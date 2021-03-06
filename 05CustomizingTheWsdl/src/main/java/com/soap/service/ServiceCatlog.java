package com.soap.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name = "SoapApp",portName = "SoapAppPort",serviceName = "SoapAppService",targetNamespace = "http://www.soapapp.com")
public class ServiceCatlog 
{

	private Service service = new ServiceImpl();
	
	@WebMethod(action = "fetch_services",operationName = "fetchServices")
	public List<String> getServices()
	{
		return service.getServices();
	}
	
	@WebMethod(exclude = true)
	public List<String> getServiceByCat(String serviceCat)
	{
		return service.getServiceByCat(serviceCat);
	}
	
	@WebMethod(exclude = true)
	public boolean addService(String serviceCat,String serviceName)
	{
		return service.addService(serviceCat,serviceName);
	}
	
}
