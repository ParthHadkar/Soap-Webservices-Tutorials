package com.soap.service;

import java.util.ArrayList;
import java.util.List;

import com.soap.model.Services;

public class ServiceImpl implements Service
{

	List<String> carWashList = new ArrayList<String>();
	List<String> bikeWashList = new ArrayList<String>();
	List<String> carDetailingList = new ArrayList<String>();
	List<String> bikeDetailingList = new ArrayList<String>();
	List<Services> carWashListv2 = new ArrayList<Services>();
	List<Services> bikeWashListv2 = new ArrayList<Services>();
	List<Services> carDetailingListv2 = new ArrayList<Services>();
	List<Services> bikeDetailingListv2 = new ArrayList<Services>();
	
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
		
		carWashListv2.add(new Services("Normal Wash", "Car", 350));
		carWashListv2.add(new Services("Advance Wash", "Car", 500));
		
		bikeWashListv2.add(new Services("Normal Wash", "Bike", 100));
		bikeWashListv2.add(new Services("Normal Wash", "Bike", 200));
		
		carDetailingListv2.add(new Services("Normal  Detailing", "Car", 350));
		carDetailingListv2.add(new Services("Advance  Detailing", "Car", 500));
		
		bikeDetailingListv2.add(new Services("Normal  Detailing", "Bike", 100));
		bikeDetailingListv2.add(new Services("Advance  Detailing", "Bike", 200));
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
	public List<Services> getServiceByCatv2(String serviceCat) 
	{
		switch(serviceCat.toLowerCase())
		{
		case "car wash":
			return carWashListv2;
		case "bike wash":
			return bikeWashListv2;
		case "car detailing":
			return carDetailingListv2;
		case "bike detailing":
			return bikeDetailingListv2;
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
