/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webservices.names.ws;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import org.springframework.stereotype.Service;

/**
 *
 * @author USER
 */

@Service
//@WebService(endpointInterface = "com.webservices.names.ws.NameService"
//        ,serviceName = "NameService"
//)
public class NameServiceImpl implements NameService{

    @Override
    public modelResponse getUserName(ModelRequest modelRequest) {
        modelResponse mr = new modelResponse();
        mr.setLastName("lastname-->" + modelRequest.getId());
        mr.setName("name-->" + modelRequest.getId());
        
        return mr;
    }

    
    
}
