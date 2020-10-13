package com.bridgelabz.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * 
 * @author Priya
 * 
 * This class will store all the locators and methods of login page
 *
 */
public class LoginPage 
{
	WebDriver driver;
	
	By username = By.id("email");
	By password = By.name("pass");
	By loginButton = By.xpath("//input[@type='submit']");
	By dropDown = By.xpath("//div[@class='_6qfu _5lxt']");
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void typeUserName()
	{
		driver.findElement(username).sendKeys("8109555221");
	}
	
	public void typePassword()
	{
		driver.findElement(password).sendKeys("testdata@1234");
	}
	
	public void clickOnLoginButton()
	{
		driver.findElement(loginButton).click();
	}
	
	public void clickForMoreOptions()
	{
		driver.findElement(dropDown).click();
	}
}