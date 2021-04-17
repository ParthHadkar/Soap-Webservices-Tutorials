package com.soap.service;

import java.util.List;

public interface Service 
{
	public List<String> getServices();
	public List<String> getServiceByCat(String serviceCat);
	public boolean addService(String serviceCat,String serviceName);
	
}
