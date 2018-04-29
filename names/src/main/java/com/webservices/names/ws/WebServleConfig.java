/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webservices.names.ws;

import javax.xml.ws.Endpoint;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.feature.LoggingFeature;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class WebServleConfig{
    
    @Bean
    public ServletRegistrationBean despacharServidor(){
        return new ServletRegistrationBean(new CXFServlet());
    }
    
    @Bean(name=Bus.DEFAULT_BUS_ID)
    public SpringBus springBus(){
        SpringBus springBus = new SpringBus();
        /*
            opcional agregar interceptores    
            springBus.getInInterceptors().add(new AppInboundInterceptor());
        springBus.getOutInterceptors().add(new AppOutboundInterceptor());
        */
        return springBus;
        
    }
    
    @Bean
    public Endpoint endpoint(){
        EndpointImpl endpoint = new EndpointImpl(springBus(), new NameServiceImpl());
        endpoint.getFeatures().add(new LoggingFeature());
        endpoint.publish("/nameServices");
        return endpoint;
    }
    
    
    
    
}
