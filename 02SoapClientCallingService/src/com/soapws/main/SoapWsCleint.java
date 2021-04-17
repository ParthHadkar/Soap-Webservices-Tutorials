package com.soapws.main;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.lavasoft.GeoIPService;
import com.lavasoft.GeoIPServiceSoap;

public class SoapWsCleint 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		// Regex for digit from 0 to 255.
        String zeroTo255
            = "(\\d{1,2}|(0|1)\\"
              + "d{2}|2[0-4]\\d|25[0-5])";
  
        // Regex for a digit from 0 to 255 and
        // followed by a dot, repeat 4 times.
        // this is the regex to validate an IP address.
        String regex
            = zeroTo255 + "\\."
              + zeroTo255 + "\\."
              + zeroTo255 + "\\."
              + zeroTo255;
  
        Pattern pattern = Pattern.compile(regex);
		System.out.println("Enter IpAddress to get country name ");
		String userInput = "";
		while(!userInput.equals("bye")) 
		{
			userInput = sc.next();
			if(userInput != null && userInput.trim().length()>0) 
			{
				Matcher matcher = pattern.matcher(userInput);
				if(matcher.matches()) 
				{
					GeoIPService geoIPService = new GeoIPService();
					GeoIPServiceSoap geoIPServiceSoap = geoIPService.getGeoIPServiceSoap();
					String location = geoIPServiceSoap.getIpLocation(userInput);
					System.out.println("location: "+location);
					break;
				}
				else
				{
					System.out.println("Invalid IpAddress");
				}
			}
			else 
			{
				System.out.println("Enter IpAddress can't be blank or empty ");
			}
		}
		sc.close();
	}
	
}
