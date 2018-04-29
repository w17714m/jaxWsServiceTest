package com.webservices.names.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAttribute;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modelrequest", propOrder = {"id","document"})
@XmlRootElement(name="modelrequest")
public class ModelRequest {
    @XmlElement(name="id")
    private String id;
    @XmlElement(name="document")
    private String document;

    
    public String getDocument() {
        return document;
    }
	
    public void setDocument(String document) {
        this.document = document;
    }
	
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
