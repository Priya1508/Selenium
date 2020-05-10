package com.bridgelabz.datadrivenframework.assertions;

import org.openqa.selenium.WebDriver;

/**
 * 
 * @author Priya
 * 
 * Assertions are used to compare the actual and the expected results
 *
 */
public class Compare
{
	public static boolean validURl(WebDriver driver, String expURL)
	{
		boolean flag = false;
		if(driver.getCurrentUrl().equalsIgnoreCase(expURL))
		{
			flag = true;
		}
		return flag;
	}
}
