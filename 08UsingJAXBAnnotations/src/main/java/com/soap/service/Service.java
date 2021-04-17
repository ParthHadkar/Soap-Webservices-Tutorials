package com.soap.service;

import java.util.List;

import com.soap.model.Services;

public interface Service 
{
	public List<String> getServices();
	public List<String> getServiceByCat(String serviceCat);
	public boolean addService(String serviceCat,String serviceName);
	public List<Services> getServiceByCatv2(String serviceCat);
	
}
