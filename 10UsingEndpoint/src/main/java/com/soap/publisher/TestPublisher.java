package com.soap.publisher;

import javax.xml.ws.Endpoint;

import com.soap.service.ServiceCatlog;

public class TestPublisher {

	public static void main(String[] args) {
		
		Endpoint.publish("http://localhost:1234/SoapAppService", new ServiceCatlog());
		System.out.println("Successful");
	}

}
