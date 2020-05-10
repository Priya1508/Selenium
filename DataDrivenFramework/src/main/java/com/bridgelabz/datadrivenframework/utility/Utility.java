package com.bridgelabz.datadrivenframework.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 * @author Priya
 * 
 * This class reads the properties file
 *
 */
public class Utility 
{
	public static Object fetchPropertyValue(String key) throws IOException
	{
		FileInputStream file = new FileInputStream("F:\\Priya Nagare\\DataDrivenFramework\\Config\\browser.properties");
		Properties property = new Properties();
		property.load(file);
		return property.get(file);
	}
	
	public static String fetchLocatorValue(String key) throws IOException
	{
		FileInputStream file = new FileInputStream(".\\Config\\elements.properties");
		Properties property = new Properties();
		property.load(file);
		return property.get(key).toString();
	}
}
