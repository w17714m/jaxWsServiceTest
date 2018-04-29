package com.webservices.client.namesClient;

import com.webservices.client.namesClient.ws.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NamesClientApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(NamesClientApplication.class, args);

        

    }

    @Override
    public void run(String... args) throws Exception {
        NameServiceImplService nsis = new NameServiceImplService();
        NameService ns = nsis.getNameServiceImplPort();
        Modelrequest mr = new Modelrequest();
        mr.setDocument("C123456C");
        mr.setId("111");
        ModelResponse mrp = ns.getUserName(mr);
        System.out.println("result-->" + mrp.getName() + mrp.getLastname());
    }
}
