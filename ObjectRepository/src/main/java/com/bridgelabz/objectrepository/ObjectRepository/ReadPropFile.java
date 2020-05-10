package com.bridgelabz.objectrepository.ObjectRepository;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadPropFile
{
	static WebDriver driver;
	public static void main(String[] args) throws IOException 
	{
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("F:\\Priya Nagare\\ObjectRepository\\config.properties");
		
		prop.load(ip);
		
		String url = prop.getProperty("URL");
		String userName = prop.getProperty("userName");
		String pass = prop.getProperty("password");
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}
}