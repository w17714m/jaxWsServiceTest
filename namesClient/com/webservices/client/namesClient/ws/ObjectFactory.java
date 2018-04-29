
package com.webservices.client.namesClient.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.webservices.client.namesClient.ws package. 
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

    private final static QName _Modelrequest_QNAME = new QName("http://ws.names.webservices.com/", "modelrequest");
    private final static QName _ModelResponse_QNAME = new QName("http://ws.names.webservices.com/", "modelResponse");
    private final static QName _GetUserName_QNAME = new QName("http://ws.names.webservices.com/", "getUserName");
    private final static QName _GetUserNameResponse_QNAME = new QName("http://ws.names.webservices.com/", "getUserNameResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.webservices.client.namesClient.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUserNameResponse }
     * 
     */
    public GetUserNameResponse createGetUserNameResponse() {
        return new GetUserNameResponse();
    }

    /**
     * Create an instance of {@link GetUserName }
     * 
     */
    public GetUserName createGetUserName() {
        return new GetUserName();
    }

    /**
     * Create an instance of {@link ModelResponse }
     * 
     */
    public ModelResponse createModelResponse() {
        return new ModelResponse();
    }

    /**
     * Create an instance of {@link Modelrequest }
     * 
     */
    public Modelrequest createModelrequest() {
        return new Modelrequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Modelrequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.names.webservices.com/", name = "modelrequest")
    public JAXBElement<Modelrequest> createModelrequest(Modelrequest value) {
        return new JAXBElement<Modelrequest>(_Modelrequest_QNAME, Modelrequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.names.webservices.com/", name = "modelResponse")
    public JAXBElement<ModelResponse> createModelResponse(ModelResponse value) {
        return new JAXBElement<ModelResponse>(_ModelResponse_QNAME, ModelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.names.webservices.com/", name = "getUserName")
    public JAXBElement<GetUserName> createGetUserName(GetUserName value) {
        return new JAXBElement<GetUserName>(_GetUserName_QNAME, GetUserName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.names.webservices.com/", name = "getUserNameResponse")
    public JAXBElement<GetUserNameResponse> createGetUserNameResponse(GetUserNameResponse value) {
        return new JAXBElement<GetUserNameResponse>(_GetUserNameResponse_QNAME, GetUserNameResponse.class, null, value);
    }

}
