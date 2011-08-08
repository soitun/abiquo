/**
 * Abiquo community edition
 * cloud management application for hybrid clouds
 * Copyright (C) 2008-2010 - Abiquo Holdings S.L.
 *
 * This application is free software; you can redistribute it and/or
 * modify it under the terms of the GNU LESSER GENERAL PUBLIC
 * LICENSE as published by the Free Software Foundation under
 * version 3 of the License
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * LESSER GENERAL PUBLIC LICENSE v.3 for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the
 * Free Software Foundation, Inc., 59 Temple Place - Suite 330,
 * Boston, MA 02111-1307, USA.
 */

package com.abiquo.server.core.pricing;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;

import org.apache.commons.lang.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Disjunction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.abiquo.server.core.common.persistence.DefaultDAOBase;
import com.abiquo.server.core.util.PagedList;

@Repository("jpaCosteCodeCurrencyDAO")
public class CostCodeCurrencyDAO extends DefaultDAOBase<Integer, CostCodeCurrency>
{
    public CostCodeCurrencyDAO()
    {
        super(CostCodeCurrency.class);
    }

    public CostCodeCurrencyDAO(final EntityManager entityManager)
    {
        super(CostCodeCurrency.class, entityManager);
    }

    private Criterion filterBy(final String filter)
    {
        Disjunction filterDisjunction = Restrictions.disjunction();

        filterDisjunction.add(Restrictions.like(CostCodeCurrency.COST_CODE_PROPERTY, filter));

        return filterDisjunction;
    }

    private Criterion sameCostCode(final CostCode costCode)
    {
        return Restrictions.eq(CostCodeCurrency.COST_CODE_PROPERTY, costCode);
    }

    private Criterion sameCurrency(final Currency currency)
    {
        return Restrictions.eq(CostCodeCurrency.CURRENCY_PROPERTY, currency);
    }

    public CostCodeCurrency findCurrencyCostCode(final CostCode costCode, final Currency currency)
    {
        return (CostCodeCurrency) createCriteria(sameCostCode(costCode), sameCurrency(currency))
            .uniqueResult();
    }

    public boolean existAnyOtherWithCurrency(final CostCodeCurrency costCodeCurrency,
        final Currency currency, final CostCode costCode)
    {
        return existsAnyOtherByCriterions(costCodeCurrency, sameCurrency(currency),
            sameCostCode(costCode));
    }

    public Collection<CostCodeCurrency> find(final String filter, final String orderBy,
        final boolean desc, final int offset, final int numResults, final CostCode cc)
    {
        Criteria criteria = createCriteria(cc, filter, orderBy, desc);

        Long total = count(criteria);

        criteria = createCriteria(cc, filter, orderBy, desc);

        criteria.setFirstResult(offset * numResults);
        criteria.setMaxResults(numResults);

        List<CostCodeCurrency> result = getResultList(criteria);

        PagedList<CostCodeCurrency> page = new PagedList<CostCodeCurrency>();
        page.addAll(result);
        page.setCurrentElement(offset);
        page.setPageSize(numResults);
        page.setTotalResults(total.intValue());

        return page;
    }

    private Criteria createCriteria(final CostCode cc, final String filter, final String orderBy,
        final boolean desc)
    {
        Criteria criteria = createCriteria();

        criteria.add(sameCostCode(cc));

        if (!StringUtils.isEmpty(filter))
        {
            criteria.add(filterBy(filter));
        }

        if (!StringUtils.isEmpty(orderBy))
        {
            Order order = Order.asc(orderBy);
            if (desc)
            {
                order = Order.desc(orderBy);
            }
            criteria.addOrder(order);
            criteria.addOrder(Order.asc(CostCodeCurrency.COST_CODE_PROPERTY));
        }

        return criteria;
    }
}
