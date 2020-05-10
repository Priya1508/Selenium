package com.bridgelabz.datadrivenframework.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.bridgelabz.datadrivenframework.utility.Utility;

/**
 * 
 * @author Priya
 * 
 * Creating login page and its methods
 *
 */
public class LoginPage 
{
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;	
	}
	
	public void enterUserName(String uname) throws IOException
	{
		driver.findElement(By.id(Utility.fetchLocatorValue("login_userName_id"))).sendKeys(uname);
	}
	
	public void enterPassword(String pass) throws IOException
	{
		driver.findElement(By.id(Utility.fetchLocatorValue("login_password_id"))).sendKeys(pass);
	}
	
	public void clickSignIn() throws IOException
	{
		driver.findElement(By.xpath(Utility.fetchLocatorValue("login_signIn_xpath"))).click();	
	}
}
