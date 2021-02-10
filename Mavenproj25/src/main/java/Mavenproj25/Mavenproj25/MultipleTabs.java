package Mavenproj25.Mavenproj25;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.sun.glass.events.KeyEvent;

public class MultipleTabs {
	@Test
	public void test2() throws AWTException {
	System.setProperty("Webdriver.chrome.driver","chromedriver");
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
driver.get("https://www.amazon.co.in");

driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
// TO OPEN ONLY gmail link in new tab
driver.get("https://www.google.com/");
WebElement w = driver.findElement(By.linkText("Gmail"));
w.sendKeys(Keys.chord(Keys.COMMAND,Keys.ENTER));	
WebElement ab = driver.findElement(By.id("nav-link-accountList"));
Actions act = new Actions(driver);
act.moveToElement(ab).build().perform();
//getting items in hover over window
WebElement ad =  driver.findElement(By.xpath("//div[@id='nav-al-container']"));
List <WebElement> link =  ad.findElements(By.tagName("a"));
System.out.println(link.size());
driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//-------------------------------------------------------------------------------------------------------------------//
//to get X and Y coordinates of element discover your style "point is a class"
Point p = driver.findElement(By.linkText("Discover Your Style")).getLocation();
System.out.println(p);
int X= p.getX();
int Y =p.getY();
System.out.println("X coordinate"+ X);
System.out.println("Y coordinate"+ Y);
//int X= driver.findElement(By.linkText("Discover Your Style")).getLocation().getX();
//int Y=driver.findElement(By.linkText("Discover Your Style")).getLocation().getY();
System.out.println("X coordinate"+ X);
System.out.println("Y coordinate"+ Y);
//--------------------------------------------------------------------------------------------------------------------//
WebElement ac=driver.findElement(By.linkText("Discover Your Style"));
act.moveToElement(ac).build().perform();
//act.contextClick(ac).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
Robot bot = new Robot();
driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
//TO Perform right click.
bot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
bot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
System.out.println("Browse button Clicked");
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
bot.keyPress(KeyEvent.VK_DOWN);
bot.keyRelease(KeyEvent.VK_DOWN);
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
bot.keyPress(KeyEvent.VK_ENTER);
bot.keyRelease(KeyEvent.VK_ENTER);
System.out.println("Open link button Clicked");
	}

}
