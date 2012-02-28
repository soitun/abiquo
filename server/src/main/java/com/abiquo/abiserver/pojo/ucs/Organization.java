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
// Generated on: 2010.12.24 at 11:14:06 AM CET 
//

package com.abiquo.abiserver.pojo.ucs;

import com.abiquo.model.transport.SingleResourceTransportDto;
import com.abiquo.server.core.infrastructure.OrganizationDto;

/**
 * This class is not persisted in Abiquo but we needed to provide compatibility with the server.
 */
public class Organization extends SingleResourceTransportDto
{

    protected String name;

    protected String level;

    protected String dn;

    /**
     * Gets the value of the name property.
     * 
     * @return possible object is {@link String }
     */
    public String getDn()
    {
        return dn;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value allowed object is {@link String }
     */

    public void setDn(final String dn)
    {
        this.dn = dn;
    }

    protected String status;

    protected String description;

    /**
     * Gets the value of the name property.
     * 
     * @return possible object is {@link String }
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setName(final String value)
    {
        this.name = value;
    }

    /**
     * Gets the value of the associated property.
     * 
     * @return possible object is {@link String }
     */
    public String getLevel()
    {
        return level;
    }

    /**
     * Sets the value of the associated property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setLevel(final String value)
    {
        this.level = value;
    }

    /**
     * Gets the value of the associatedTo property.
     * 
     * @return possible object is {@link String }
     */
    public String getStatus()
    {
        return status;
    }

    /**
     * Sets the value of the associatedTo property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setStatus(final String value)
    {
        this.status = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return possible object is {@link String }
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setDescription(final String value)
    {
        this.description = value;
    }

    public static Organization create(final OrganizationDto dto)
    {
        Organization organization = new Organization();
        organization.setDn(dto.getDn());
        organization.setName(dto.getName());
        organization.setLevel(dto.getLevel());
        organization.setStatus(dto.getStatus());
        organization.setDescription(dto.getDescription());
        return organization;
    }
}
