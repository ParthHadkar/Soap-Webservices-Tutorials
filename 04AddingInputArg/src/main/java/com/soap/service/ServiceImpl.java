package com.soap.service;

import java.util.ArrayList;
import java.util.List;

public class ServiceImpl implements Service
{

	List<String> carWashList = new ArrayList<String>();
	List<String> bikeWashList = new ArrayList<String>();
	List<String> carDetailingList = new ArrayList<String>();
	List<String> bikeDetailingList = new ArrayList<String>();
	
	public ServiceImpl() 
	{
		carWashList.add("Normal Car Wash");
		carWashList.add("Advance Car Wash");
		
		bikeWashList.add("Normal Bike Wash");
		bikeWashList.add("Advance Bike Wash");
		
		carDetailingList.add("Normal Car Detailing");
		carDetailingList.add("Advance Car Detailing");
		
		bikeDetailingList.add("Normal Bike Detailing");
		bikeDetailingList.add("Advance Bike Detailing");
	}

	@Override
	public List<String> getServices() 
	{
		List<String> serviceList = new ArrayList<String>();
		serviceList.add("Car Wash");
		serviceList.add("Bike Wash");
		serviceList.add("Car Detailing");
		serviceList.add("Bike Detailing");
		return serviceList;
	}

	@Override
	public List<String> getServiceByCat(String serviceCat) 
	{
		switch(serviceCat.toLowerCase())
		{
		case "car wash":
			return carWashList;
		case "bike wash":
			return bikeWashList;
		case "car detailing":
			return carDetailingList;
		case "bike detailing":
			return bikeDetailingList;
		}
		return null;
	}

	@Override
	public boolean addService(String serviceCat, String serviceName)
	{
		switch(serviceCat.toLowerCase())
		{
		case "car wash":
			carWashList.add(serviceName);
			break;
		case "bike wash":
			bikeWashList.add(serviceName);
			break;
		case "car detailing":
			carDetailingList.add(serviceName);
			break;
		case "bike detailing":
			bikeDetailingList.add(serviceName);
			break;
		default:
			return false;
		}
		return true;
	}

}
