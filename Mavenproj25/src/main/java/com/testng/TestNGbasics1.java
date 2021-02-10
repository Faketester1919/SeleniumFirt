package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//for reprt check index.html copy the path(from properties) and paste it in browser
//path here is  "/Users/priyankac/Documents/workspace/Mavenproj25/test-output/index.html"
public class TestNGbasics1 {

@BeforeSuite

public void setup(){
		
System.out.println("Before suite");
			
	}

@BeforeClass

public void LaunchBrowser(){
	
	System.out.println("Before class");
		
}

@BeforeMethod

public void EnterUrl(){
	System.out.println("Before Method");
		
}

@BeforeTest
public void Login(){
	System.out.println("Before Test");


}
//in the index.html you can open the "4 groups" by group name
//priority and groups are keyword
@Test(priority=3,groups="Home page")
public void checkbox(){
	System.out.println("Test3");

}
@Test (priority=1, groups="Enter url")
public void Title(){
	System.out.println("Test1");
}

@Test(priority=4,groups="checkout")
public void dropdown(){
	System.out.println("Test4");
}
@Test(priority=2, groups="Login")
public void Textbox(){
	
	System.out.println("Test2");
}

@AfterTest
public void cookies(){
	
	System.out.println("After test");

}

@AfterMethod
public void logout(){
	
	System.out.println("After Method");
}
@AfterClass

public void classBrowser(){
	
	System.out.println("After class");
}
@AfterSuite

public void testreport(){
		
System.out.println("After suite");
		
		
	}

}