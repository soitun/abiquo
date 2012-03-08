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
// Generated on: 2012.02.23 at 01:07:44 PM CET 
//


package org.dmtf.schemas.wbem.wscim._1.common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.w3._2001.xmlschema.Adapter1;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.dmtf.schemas.wbem.wscim._1.common package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DefaultValue_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/common", "DefaultValue");
    private final static QName _CimDateTimeCIMDateTime_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/common", "CIM_DateTime");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.dmtf.schemas.wbem.wscim._1.common
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CimReference }
     * 
     */
    public CimReference createCimReference() {
        return new CimReference();
    }

    /**
     * Create an instance of {@link CimUnsignedShort }
     * 
     */
    public CimUnsignedShort createCimUnsignedShort() {
        return new CimUnsignedShort();
    }

    /**
     * Create an instance of {@link QualifierSInt64 }
     * 
     */
    public QualifierSInt64 createQualifierSInt64() {
        return new QualifierSInt64();
    }

    /**
     * Create an instance of {@link QualifierString }
     * 
     */
    public QualifierString createQualifierString() {
        return new QualifierString();
    }

    /**
     * Create an instance of {@link CimShort }
     * 
     */
    public CimShort createCimShort() {
        return new CimShort();
    }

    /**
     * Create an instance of {@link CimInt }
     * 
     */
    public CimInt createCimInt() {
        return new CimInt();
    }

    /**
     * Create an instance of {@link CimByte }
     * 
     */
    public CimByte createCimByte() {
        return new CimByte();
    }

    /**
     * Create an instance of {@link QualifierSArray }
     * 
     */
    public QualifierSArray createQualifierSArray() {
        return new QualifierSArray();
    }

    /**
     * Create an instance of {@link CimString }
     * 
     */
    public CimString createCimString() {
        return new CimString();
    }

    /**
     * Create an instance of {@link CimFloat }
     * 
     */
    public CimFloat createCimFloat() {
        return new CimFloat();
    }

    /**
     * Create an instance of {@link CimChar16 }
     * 
     */
    public CimChar16 createCimChar16() {
        return new CimChar16();
    }

    /**
     * Create an instance of {@link CimHexBinary }
     * 
     */
    public CimHexBinary createCimHexBinary() {
        return new CimHexBinary();
    }

    /**
     * Create an instance of {@link CimUnsignedInt }
     * 
     */
    public CimUnsignedInt createCimUnsignedInt() {
        return new CimUnsignedInt();
    }

    /**
     * Create an instance of {@link CimDouble }
     * 
     */
    public CimDouble createCimDouble() {
        return new CimDouble();
    }

    /**
     * Create an instance of {@link QualifierBoolean }
     * 
     */
    public QualifierBoolean createQualifierBoolean() {
        return new QualifierBoolean();
    }

    /**
     * Create an instance of {@link QualifierUInt32 }
     * 
     */
    public QualifierUInt32 createQualifierUInt32() {
        return new QualifierUInt32();
    }

    /**
     * Create an instance of {@link CimDateTime }
     * 
     */
    public CimDateTime createCimDateTime() {
        return new CimDateTime();
    }

    /**
     * Create an instance of {@link CimBoolean }
     * 
     */
    public CimBoolean createCimBoolean() {
        return new CimBoolean();
    }

    /**
     * Create an instance of {@link CimUnsignedLong }
     * 
     */
    public CimUnsignedLong createCimUnsignedLong() {
        return new CimUnsignedLong();
    }

    /**
     * Create an instance of {@link CimBase64Binary }
     * 
     */
    public CimBase64Binary createCimBase64Binary() {
        return new CimBase64Binary();
    }

    /**
     * Create an instance of {@link CimLong }
     * 
     */
    public CimLong createCimLong() {
        return new CimLong();
    }

    /**
     * Create an instance of {@link CimAnySimpleType }
     * 
     */
    public CimAnySimpleType createCimAnySimpleType() {
        return new CimAnySimpleType();
    }

    /**
     * Create an instance of {@link CimUnsignedByte }
     * 
     */
    public CimUnsignedByte createCimUnsignedByte() {
        return new CimUnsignedByte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/common", name = "DefaultValue")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<String> createDefaultValue(String value) {
        return new JAXBElement<String>(_DefaultValue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/common", name = "CIM_DateTime", scope = CimDateTime.class)
    public JAXBElement<String> createCimDateTimeCIMDateTime(String value) {
        return new JAXBElement<String>(_CimDateTimeCIMDateTime_QNAME, String.class, CimDateTime.class, value);
    }

}
