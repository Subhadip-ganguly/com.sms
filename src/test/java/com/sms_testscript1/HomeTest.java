package com.sms_testscript1;

import org.testng.annotations.Test;

public class HomeTest {

	@Test(groups = {"smoke","regression"})
	public void close()
	{
		System.out.println("close the app");
	}
}
