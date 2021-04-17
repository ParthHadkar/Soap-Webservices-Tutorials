package com.soap.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.soap.model.Services;

@WebService(name = "SoapApps",targetNamespace = "http://www.soapapp.com")
public interface ServiceCatlogInterface {

	@WebMethod(action = "fetch_services",operationName = "fetchServices")
	List<String> getServices();

	@WebMethod
	List<String> getServiceByCat(String serviceCat);

	@WebMethod
	List<Services> getServiceByCatv2(String serviceCat);

	@WebMethod
	boolean addService(String serviceCat, String serviceName);

}