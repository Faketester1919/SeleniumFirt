package Mavenproj25.Mavenproj25;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;

import tech.grasshopper.pdf.extent.ExtentPDFCucumberReporter;

public class Crossbrowser {
	WebDriver driver;
	@Test 
    public void test()
    {
		ExtentPDFCucumberReporter reporter= new ExtentPDFCucumberReporter("./Reports/learn.html");	
		ExtentReports extent = new ExtentReports(null);
		
		//./Report dot operator refers to project working directory
		System.setProperty("Webdriver.chrome.driver", "chromedriver");
	    WebDriver driver1 = new ChromeDriver();
	    driver1.get("https://www.google.com");
	    
	    String Pagetitle1 = driver1.getTitle();
	    
	    if (Pagetitle1.equals("Google"))
	    {
	    	System.out.println("Launching Google sucessful via chrome");
	    }
	    else{
	    	System.out.println("Launching Google failed via chrome");
	    }
	    driver1.close();
	     WebDriver driver2 = new SafariDriver();
	     driver2.get("https://www.google.com");
	     
	     String Pagetitle2= driver2.getTitle();
	     
	     if (Pagetitle2.equals("Googla"))
	     {
	    	System.out.println("Launching Google sucessful via Safari"); 
	     }
	     else{
	    	 System.out.println("Launching Google failed via Safari");
	     }
	  driver2.close();
    }

	
}
