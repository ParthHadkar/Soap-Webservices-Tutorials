
package com.soapapp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.soapapp package. 
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

    private final static QName _GetServiceByCatResponse_QNAME = new QName("http://www.soapapp.com", "getServiceByCatResponse");
    private final static QName _GetServiceByCat_QNAME = new QName("http://www.soapapp.com", "getServiceByCat");
    private final static QName _AddServiceResponse_QNAME = new QName("http://www.soapapp.com", "addServiceResponse");
    private final static QName _FetchServices_QNAME = new QName("http://www.soapapp.com", "fetchServices");
    private final static QName _AddService_QNAME = new QName("http://www.soapapp.com", "addService");
    private final static QName _GetServiceByCatv2Response_QNAME = new QName("http://www.soapapp.com", "getServiceByCatv2Response");
    private final static QName _GetServiceByCatv2_QNAME = new QName("http://www.soapapp.com", "getServiceByCatv2");
    private final static QName _FetchServicesResponse_QNAME = new QName("http://www.soapapp.com", "fetchServicesResponse");
    private final static QName _AutoServices_QNAME = new QName("http://www.soapapp.com", "AutoServices");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.soapapp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetServiceByCat }
     * 
     */
    public GetServiceByCat createGetServiceByCat() {
        return new GetServiceByCat();
    }

    /**
     * Create an instance of {@link FetchServices }
     * 
     */
    public FetchServices createFetchServices() {
        return new FetchServices();
    }

    /**
     * Create an instance of {@link GetServiceByCatResponse }
     * 
     */
    public GetServiceByCatResponse createGetServiceByCatResponse() {
        return new GetServiceByCatResponse();
    }

    /**
     * Create an instance of {@link Services }
     * 
     */
    public Services createServices() {
        return new Services();
    }

    /**
     * Create an instance of {@link AddService }
     * 
     */
    public AddService createAddService() {
        return new AddService();
    }

    /**
     * Create an instance of {@link AddServiceResponse }
     * 
     */
    public AddServiceResponse createAddServiceResponse() {
        return new AddServiceResponse();
    }

    /**
     * Create an instance of {@link GetServiceByCatv2Response }
     * 
     */
    public GetServiceByCatv2Response createGetServiceByCatv2Response() {
        return new GetServiceByCatv2Response();
    }

    /**
     * Create an instance of {@link GetServiceByCatv2 }
     * 
     */
    public GetServiceByCatv2 createGetServiceByCatv2() {
        return new GetServiceByCatv2();
    }

    /**
     * Create an instance of {@link FetchServicesResponse }
     * 
     */
    public FetchServicesResponse createFetchServicesResponse() {
        return new FetchServicesResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceByCatResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.soapapp.com", name = "getServiceByCatResponse")
    public JAXBElement<GetServiceByCatResponse> createGetServiceByCatResponse(GetServiceByCatResponse value) {
        return new JAXBElement<GetServiceByCatResponse>(_GetServiceByCatResponse_QNAME, GetServiceByCatResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceByCat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.soapapp.com", name = "getServiceByCat")
    public JAXBElement<GetServiceByCat> createGetServiceByCat(GetServiceByCat value) {
        return new JAXBElement<GetServiceByCat>(_GetServiceByCat_QNAME, GetServiceByCat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.soapapp.com", name = "addServiceResponse")
    public JAXBElement<AddServiceResponse> createAddServiceResponse(AddServiceResponse value) {
        return new JAXBElement<AddServiceResponse>(_AddServiceResponse_QNAME, AddServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchServices }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.soapapp.com", name = "fetchServices")
    public JAXBElement<FetchServices> createFetchServices(FetchServices value) {
        return new JAXBElement<FetchServices>(_FetchServices_QNAME, FetchServices.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.soapapp.com", name = "addService")
    public JAXBElement<AddService> createAddService(AddService value) {
        return new JAXBElement<AddService>(_AddService_QNAME, AddService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceByCatv2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.soapapp.com", name = "getServiceByCatv2Response")
    public JAXBElement<GetServiceByCatv2Response> createGetServiceByCatv2Response(GetServiceByCatv2Response value) {
        return new JAXBElement<GetServiceByCatv2Response>(_GetServiceByCatv2Response_QNAME, GetServiceByCatv2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceByCatv2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.soapapp.com", name = "getServiceByCatv2")
    public JAXBElement<GetServiceByCatv2> createGetServiceByCatv2(GetServiceByCatv2 value) {
        return new JAXBElement<GetServiceByCatv2>(_GetServiceByCatv2_QNAME, GetServiceByCatv2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchServicesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.soapapp.com", name = "fetchServicesResponse")
    public JAXBElement<FetchServicesResponse> createFetchServicesResponse(FetchServicesResponse value) {
        return new JAXBElement<FetchServicesResponse>(_FetchServicesResponse_QNAME, FetchServicesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Services }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.soapapp.com", name = "AutoServices")
    public JAXBElement<Services> createAutoServices(Services value) {
        return new JAXBElement<Services>(_AutoServices_QNAME, Services.class, null, value);
    }

}
