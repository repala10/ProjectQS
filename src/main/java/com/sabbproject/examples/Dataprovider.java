package com.sabbproject.examples;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider 
{
	@DataProvider(name="employdetails")
	public Object[][] getData() {
		return new Object[][] {
			{"Akhil", "Repala"},
			{"EMP ID", "CT824"},
			{"COMPANY", "maveric"}
		};
	}
	
	@Test(dataProvider="employdetails")
	public void testMethod1(String employdetails, String employdetails1) {
		System.out.println("employdetails1: " + employdetails1);
		System.out.println("employdetails1: " +employdetails );
	}}

