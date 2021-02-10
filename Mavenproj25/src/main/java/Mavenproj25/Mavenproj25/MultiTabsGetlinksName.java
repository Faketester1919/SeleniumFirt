package Mavenproj25.Mavenproj25;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultiTabsGetlinksName {
	@Test
	public void test2() throws AWTException {
	System.setProperty("Webdriver.chrome.driver","chromedriver");
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
driver.get("https://www.amazon.co.in");

driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
WebElement Multitabs =  driver.findElement(By.xpath("//div[@class='navFooterLinkCol navAccessibility'][3]"));
List <WebElement> links =  Multitabs.findElements(By.tagName("a"));
System.out.println(links.size());

for(int i=0;i< links.size();i++)
		{
     System.out.println(links.get(i).getText());
    Multitabs.sendKeys(Keys.chord(Keys.COMMAND,Keys.ENTER));	

		  }  
	}
}

