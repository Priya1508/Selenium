package com.bridgelabz.facebook.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.bridgelabz.facebook.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author Priya
 * 
 *
 */
public class VerifyFacebookLogin
{
	@Test
	public void verifyValidLogin()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		
		LoginPage login = new LoginPage(driver);
		login.typeUserName();
		login.typePassword();
		login.clickOnLoginButton();
		login.clickForMoreOptions();
	}
}
