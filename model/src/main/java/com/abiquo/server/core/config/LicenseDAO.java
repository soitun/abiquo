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
package com.abiquo.server.core.config;

import javax.persistence.EntityManager;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.abiquo.server.core.common.persistence.DefaultDAOBase;

@Repository("jpaLicenseDAO")
public class LicenseDAO extends DefaultDAOBase<Integer, License>
{
    public LicenseDAO()
    {
        super(License.class);
    }

    public LicenseDAO(EntityManager entityManager)
    {
        super(License.class, entityManager);
    }

    public boolean existsAnyWithData(String data)
    {
        return existsAnyByCriterions(equalsData(data));
    }

    public boolean existsAnyOtherWithData(License license, String data)
    {
        return this.existsAnyOtherByCriterions(license, equalsData(data));
    }

    private Criterion equalsData(String data)
    {
        return Restrictions.eq(License.DATA_PROPERTY, data);
    }
}
