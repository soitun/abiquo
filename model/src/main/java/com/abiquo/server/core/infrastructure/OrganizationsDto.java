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

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.25 at 12:44:58 PM CEST 
//

package com.abiquo.server.core.infrastructure;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.abiquo.model.transport.WrapperDto;

/**
 */
@XmlRootElement(name = "organizations")
public class OrganizationsDto extends WrapperDto<OrganizationDto>
{

    /**
     * 
     */
    private static final long serialVersionUID = 5643469409057556537L;
    public static final String mediaType = "application/vnd.abiquo.organizations+xml";
    
    /**
     * Gets the value of the host property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the host property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getCollection().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link OrganizationDto }
     */
    @Override
    @XmlElement(name = "organization")
    public List<OrganizationDto> getCollection()
    {
        if (collection == null)
        {
            collection = new ArrayList<OrganizationDto>();
        }
        return this.collection;
    }
    
    @Override
    public String getMediaType()
    {
        return OrganizationsDto.mediaType;
    }

}
