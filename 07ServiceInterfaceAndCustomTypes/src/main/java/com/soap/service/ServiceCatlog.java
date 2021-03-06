package com.soap.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.soap.model.Services;

@WebService(endpointInterface = "com.soap.service.ServiceCatlogInterface",name = "SoapApp",portName = "SoapAppPort",
serviceName = "SoapAppService")
public class ServiceCatlog implements ServiceCatlogInterface 
{

	private Service service = new ServiceImpl();
	
	@Override
	public List<String> getServices()
	{
		return service.getServices();
	}
		
	@Override
	public List<String> getServiceByCat(String serviceCat)
	{
		return service.getServiceByCat(serviceCat);
	}
	
	@Override
	public List<Services> getServiceByCatv2(String serviceCat)
	{
		return service.getServiceByCatv2(serviceCat);
	}
	
	@Override
	public boolean addService(String serviceCat,String serviceName)
	{
		return service.addService(serviceCat,serviceName);
	}
	
}
