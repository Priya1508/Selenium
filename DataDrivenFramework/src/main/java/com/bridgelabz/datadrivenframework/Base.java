package com.bridgelabz.datadrivenframework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.bridgelabz.datadrivenframework.utility.Utility;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author Priya
 * 
 * This class is to create method for webdrivers and setting up the browser
 *
 */
public class Base 
{
	public WebDriver driver;
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		if(Utility.fetchPropertyValue("browserName").toString().equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(Utility.fetchPropertyValue("browserName").toString().equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		driver.get(Utility.fetchPropertyValue("URL").toString());
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
