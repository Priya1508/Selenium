package com.bridgelabz.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonApp
{
	WebDriver driver;
	
	@BeforeSuite
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void getURL() throws InterruptedException
	{
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test
	public void searchItem() throws InterruptedException
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Hand sanitizer small size");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']")).click();
		Thread.sleep(2000);
	}
	
	@Test
	public void addToCart() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
