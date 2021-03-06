package com.soap.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.DOCUMENT)// Style.RPC Style.DOCUMENT
public class ShopInfo 
{
	@WebMethod
	@WebResult(name ="lookupOutput",  partName = "lookupOutput")
	public String getShopInfo(@WebParam(name ="lookupInput",partName = "lookupInput") String input) 
	{
		String response = "Invalid Input";
		if(input.equalsIgnoreCase("shopName")) 
		{
			response = "AutoMobileWS";
		}
		else if(input.equalsIgnoreCase("since")) 
		{
			response = "since 2021";
		}
		return response;
	}
	
}
