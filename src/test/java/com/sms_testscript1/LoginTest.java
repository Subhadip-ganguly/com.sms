package com.sms_testscript1;

import org.testng.annotations.Test;

public class LoginTest {

	@Test(groups = "smoke")
	public void open()
	{
		System.out.println("open app");
	}
	
	@Test(groups = "regression")
	public void logoutTest()
	{
		System.out.println("Logout");
	}
}
