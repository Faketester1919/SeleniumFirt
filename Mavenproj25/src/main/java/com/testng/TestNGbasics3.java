package com.testng;

import org.testng.annotations.Test;

public class TestNGbasics3 {
	//if you want to execute same test case 10 times
	
	@Test(invocationCount=10)
	public void method1(){
		System.out.println("PRINTING 10 IMES");
		
	}

}
