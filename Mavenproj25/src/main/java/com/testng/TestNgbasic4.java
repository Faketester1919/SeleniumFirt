package com.testng;

import org.testng.annotations.Test;

public class TestNgbasic4 {
	//infinteloop will timout in 2 sec
	@Test(invocationTimeOut=2)
	
public void infinteloop1(){
		
int i=1;
while(i==1){
		
		System.out.println("i");
}
		
	}
//apart from trycatch we can handle exception via TESTNG keyword expected Exceptions)
@Test(expectedExceptions=NumberFormatException.class)
public void test()
{
	String x ="100A";
			System.out.println(x);
}
}
