package com.bridgelabz.bookswagon.Bookswagon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BooksWagon
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("http://www.bookswagon.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_TopSearch1_txtSearch")).sendKeys("William Shakespeare");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_TopSearch1_Button1")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Julius Caesar')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Buy Now']")).click();
		Thread.sleep(2000);
	}
}
