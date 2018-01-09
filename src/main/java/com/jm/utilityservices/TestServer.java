package com.jm.utilityservices;

import javax.xml.ws.Endpoint;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jm.utilityservices.services.CountryService;
import com.jm.utilityservices.webservices.Country;
import com.jm.utilityservices.webservices.Hello;  

public class TestServer {
    public static void main(String[] args) { 
    	System.out.println("running...");    	
        //Endpoint.publish("http://localhost:9090/ws/hello", new Hello());
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
    	CountryService countryService = context.getBean(CountryService.class);
    	Country country = context.getBean(Country.class);
    	System.out.println(countryService.getCountries());
    	System.out.println(country.getCountries());
        System.out.println("terminated.");
         }  
}
