//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.26 at 12:13:14 PM CEST 
//


package com.abiquo.server.core.infrastructure.nodecollector;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.abiquo.server.core.infrastructure.nodecollector package. 
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

    private final static QName _Hypervisor_QNAME = new QName("http://abiquo.com/server/core/infrastructure/nodecollector", "Hypervisor");
    private final static QName _ErrorResponse_QNAME = new QName("http://abiquo.com/server/core/infrastructure/nodecollector", "ErrorResponse");
    private final static QName _Hosts_QNAME = new QName("http://abiquo.com/server/core/infrastructure/nodecollector", "Hosts");
    private final static QName _Host_QNAME = new QName("http://abiquo.com/server/core/infrastructure/nodecollector", "Host");
    private final static QName _VirtualSystemCollection_QNAME = new QName("http://abiquo.com/server/core/infrastructure/nodecollector", "VirtualSystemCollection");
    private final static QName _VirtualSystem_QNAME = new QName("http://abiquo.com/server/core/infrastructure/nodecollector", "VirtualSystem");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.abiquo.server.core.infrastructure.nodecollector
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResourceType }
     * 
     */
    public ResourceType createResourceType() {
        return new ResourceType();
    }

    /**
     * Create an instance of {@link HostsDto }
     * 
     */
    public HostsDto createHostsDto() {
        return new HostsDto();
    }

    /**
     * Create an instance of {@link VirtualSystemCollectionDto }
     * 
     */
    public VirtualSystemCollectionDto createVirtualSystemCollectionDto() {
        return new VirtualSystemCollectionDto();
    }

    /**
     * Create an instance of {@link VirtualSystemDto }
     * 
     */
    public VirtualSystemDto createVirtualSystemDto() {
        return new VirtualSystemDto();
    }

    /**
     * Create an instance of {@link ErrorResponseDto }
     * 
     */
    public ErrorResponseDto createErrorResponseDto() {
        return new ErrorResponseDto();
    }

    /**
     * Create an instance of {@link HostDto }
     * 
     */
    public HostDto createHostDto() {
        return new HostDto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HypervisorEnumTypeDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abiquo.com/server/core/infrastructure/nodecollector", name = "Hypervisor")
    public JAXBElement<HypervisorEnumTypeDto> createHypervisor(HypervisorEnumTypeDto value) {
        return new JAXBElement<HypervisorEnumTypeDto>(_Hypervisor_QNAME, HypervisorEnumTypeDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorResponseDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abiquo.com/server/core/infrastructure/nodecollector", name = "ErrorResponse")
    public JAXBElement<ErrorResponseDto> createErrorResponse(ErrorResponseDto value) {
        return new JAXBElement<ErrorResponseDto>(_ErrorResponse_QNAME, ErrorResponseDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HostsDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abiquo.com/server/core/infrastructure/nodecollector", name = "Hosts")
    public JAXBElement<HostsDto> createHosts(HostsDto value) {
        return new JAXBElement<HostsDto>(_Hosts_QNAME, HostsDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HostDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abiquo.com/server/core/infrastructure/nodecollector", name = "Host")
    public JAXBElement<HostDto> createHost(HostDto value) {
        return new JAXBElement<HostDto>(_Host_QNAME, HostDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VirtualSystemCollectionDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abiquo.com/server/core/infrastructure/nodecollector", name = "VirtualSystemCollection")
    public JAXBElement<VirtualSystemCollectionDto> createVirtualSystemCollection(VirtualSystemCollectionDto value) {
        return new JAXBElement<VirtualSystemCollectionDto>(_VirtualSystemCollection_QNAME, VirtualSystemCollectionDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VirtualSystemDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abiquo.com/server/core/infrastructure/nodecollector", name = "VirtualSystem")
    public JAXBElement<VirtualSystemDto> createVirtualSystem(VirtualSystemDto value) {
        return new JAXBElement<VirtualSystemDto>(_VirtualSystem_QNAME, VirtualSystemDto.class, null, value);
    }

}
