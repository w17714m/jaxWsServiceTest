/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webservices.names.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;



/**
 *
 * @author USER
 */

@WebService
public interface NameService {
    @WebMethod
    @WebResult(name = "result")
    modelResponse getUserName(@WebParam(name="model") ModelRequest modelRequest);
}
