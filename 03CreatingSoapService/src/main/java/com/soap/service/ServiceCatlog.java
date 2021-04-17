package com.soap.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class ServiceCatlog 
{

	@WebMethod
	public List<String> getServices()
	{
		List<String> serviceList = new ArrayList<String>();
		serviceList.add("Car Wash");
		serviceList.add("Bike Wash");
		serviceList.add("Car Detailing");
		serviceList.add("Bike Detailing");
		return serviceList;
	}
	
}
