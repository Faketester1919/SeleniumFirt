package com.testng;

import org.testng.annotations.Test;

public class testngbasics2 {
	@Test (priority=1, groups="Enter url")
	public void Title(){
	System.out.println("Test1");
	int i=2/0;//Arithmetic exception created to fail the test case
	}
	//if testcase 1 passes then only 2 will run as dependsOnMethod is used, if failed then this will be skipped
	// textbox method in result is  is yellow marked as it did not run
	
	@Test(priority=2, groups="Login", dependsOnMethods="Title")
	public void Textbox(){
		
		System.out.println("Test2");
	}
	@Test(priority=3,groups="Home page")
	public void checkbox(){
		System.out.println("Test3");
}
}