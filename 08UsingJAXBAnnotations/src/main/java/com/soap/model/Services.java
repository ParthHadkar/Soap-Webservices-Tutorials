package com.soap.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "AutoServices")
@XmlType(propOrder = {"serviceType","serviceName","price"})
public class Services 
{
	private String serviceName;
	private String serviceType;
	private double price;
	
	public Services() {}
	
	public Services(String serviceName, String serviceType, double price) 
	{
		this.serviceName = serviceName;
		this.serviceType = serviceType;
		this.price = price;
	}

	@XmlElement(name = "AutoServiceName")
	public String getServiceName() 
	{
		return serviceName;
	}

	public void setServiceName(String serviceName) 
	{
		this.serviceName = serviceName;
	}

	@XmlElement(name = "AutoServiceType")
	public String getServiceType() 
	{
		return serviceType;
	}

	public void setServiceType(String serviceType) 
	{
		this.serviceType = serviceType;
	}

	@XmlElement(name = "AutoServicePrice")
	public double getPrice() 
	{
		return price;
	}

	public void setPrice(double price) 
	{
		this.price = price;
	}
	
	
}
