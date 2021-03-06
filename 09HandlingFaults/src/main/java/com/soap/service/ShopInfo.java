package com.soap.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.soap.exception.InvalidInputException;

@WebService
@SOAPBinding(style = Style.DOCUMENT)// Style.RPC Style.DOCUMENT
public class ShopInfo 
{
	@WebMethod
	@WebResult(name ="lookupOutput",  partName = "lookupOutput")
	public String getShopInfo(@WebParam(name ="lookupInput",partName = "lookupInput") String input) throws InvalidInputException 
	{
		String response = null;
		if(input.equalsIgnoreCase("shopName")) 
		{
			response = "AutoMobileWS";
		}
		else if(input.equalsIgnoreCase("since")) 
		{
			response = "since 2021";
		}
		else 
		{
			throw new InvalidInputException("Invalid Input", input+" is not valid input");
		}
		return response;
	}
	
}
