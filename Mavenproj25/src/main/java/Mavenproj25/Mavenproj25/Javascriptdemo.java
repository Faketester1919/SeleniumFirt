package Mavenproj25.Mavenproj25;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Javascriptdemo {
	@Test 
    public void test()
    {
		System.setProperty("Webdriver.chrome.driver", "chromedriver");
	    WebDriver driver = new ChromeDriver();
/*	   driver.get("https://www.google.com/");
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   driver.manage().window().maximize();  
	   //converting Webdriver to Java script executor
	   JavascriptExecutor js =(JavascriptExecutor)driver;
	   js.executeScript("alert('welcome to demo')"); 
	      
   */
	   
//Highlight the element using Javascript

driver.get("https://www.facebook.com/");
driver.manage().window().maximize();  
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	   
driver.findElement(By.id("email")).sendKeys("testerjournal1919@gmail.com");;
driver.findElement(By.id("pass")).sendKeys("12345678");;
WebElement button= driver.findElement(By.id("u_0_b"));
	  flash(button,driver); 
	  border(button,driver);
    }   
	   	   
public static void flash(WebElement element, WebDriver driver){
	  //JavascriptExecutor js =(JavascriptExecutor)driver;
String bgcolor = element.getCssValue("backgroundColor");
for(int i=0; i<100; i++){
	changeColor("rgb(0,200,0)",element,driver);
	changeColor(bgcolor,element,driver);
}
}
public static void changeColor(String color,WebElement element, WebDriver driver){
	   JavascriptExecutor js =(JavascriptExecutor)driver;
js.executeScript("arguments[0].style.backgroundColor='"+color+"'", element);
try{
	Thread.sleep(20);
	}
catch(InterruptedException e){
	
}
}
public static void border(WebElement element, WebDriver driver){
	   JavascriptExecutor js =(JavascriptExecutor)driver;
	   js.executeScript("arguments[0].style.border='3px solid red'", element);

	
}
}

