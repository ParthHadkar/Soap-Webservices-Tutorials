package com.soap.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class ServiceCatlog 
{

	private Service service = new ServiceImpl();
	
	@WebMethod
	public List<String> getServices()
	{
		return service.getServices();
	}
	
	@WebMethod
	public List<String> getServiceByCat(String serviceCat)
	{
		return service.getServiceByCat(serviceCat);
	}
	
	@WebMethod
	public boolean addService(String serviceCat,String serviceName)
	{
		return service.addService(serviceCat,serviceName);
	}
	
}
