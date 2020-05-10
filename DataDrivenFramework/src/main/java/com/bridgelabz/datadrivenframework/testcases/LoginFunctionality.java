package com.bridgelabz.datadrivenframework.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.bridgelabz.datadrivenframework.Base;
import com.bridgelabz.datadrivenframework.pages.LoginPage;

public class LoginFunctionality extends Base
{
	@Test
	public void loginFuntionality() throws IOException
	{
		LoginPage login = new LoginPage(driver);
		login.enterUserName("8109555221");
		login.enterPassword("testdata@1234");
		login.clickSignIn();
	}
}
