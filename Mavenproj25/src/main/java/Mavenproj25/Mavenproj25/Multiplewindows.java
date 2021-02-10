package Mavenproj25.Mavenproj25;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import com.sun.glass.events.KeyEvent;

public class Multiplewindows {

	@Test
	public void test1() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "chromedriver");
	    WebDriver driver = new ChromeDriver();
   driver.get("https://www.online.citibank.co.in/");
   driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
   System.out.println(driver.getTitle());
   //gives you ID of current window
   String pa = driver.getWindowHandle();
   System.out.println(pa);
   //to click on the login button which will open anew window
   driver.findElement(By.xpath("//*[@title='LOGIN NOW']/img")).click();;
   //allwin.size give you number of windows/popup open which is 2
   //set object does not store the  value on the basis of indexes
   Set<String> allwin = driver.getWindowHandles();
   int count = allwin.size();
   System.out.println(count);
   //in order to work on the new window you need to point your driver on the new window to do that iterate the windows
   //as windowhandles is a set object "For loop" wont work as set object does not store the  value on the basis of indexes instead we will use iterator
   //create iterator object
   Iterator <String> it =allwin.iterator();
   //it.next will give you parent window id value
   String parentwindow = it.next();
 System.out.println("parentwindow id"+" "+ parentwindow);
 //it.next if mentioned 2nd time it will point it to child window
 String childwindow =it.next();
 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
 System.out.println("childwindow id"+" "+ childwindow);
 driver.switchTo().window(childwindow);
 System.out.println("title of childwindow"+" "+driver.getTitle()); 
}
}