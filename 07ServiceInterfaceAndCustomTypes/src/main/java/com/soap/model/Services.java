package com.soap.model;

public class Services 
{
	
	private String serviceName;
	private String serviceType;
	private double price;
	
	public Services(String serviceName, String serviceType, double price) 
	{
		this.serviceName = serviceName;
		this.serviceType = serviceType;
		this.price = price;
	}

	public String getServiceName() 
	{
		return serviceName;
	}

	public void setServiceName(String serviceName) 
	{
		this.serviceName = serviceName;
	}

	public String getServiceType() 
	{
		return serviceType;
	}

	public void setServiceType(String serviceType) 
	{
		this.serviceType = serviceType;
	}

	public double getPrice() 
	{
		return price;
	}

	public void setPrice(double price) 
	{
		this.price = price;
	}
	
	
}
