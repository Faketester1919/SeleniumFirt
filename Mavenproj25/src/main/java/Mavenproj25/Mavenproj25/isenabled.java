package Mavenproj25.Mavenproj25;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class isenabled {
		WebDriver driver;
			
			
		@Test 
	    public void test()
	    {
			System.setProperty("Webdriver.chrome.driver", "chromedriver");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		    driver.manage().window().maximize();   
		    driver.get("https://www.flipkart.com");
		    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    
		   // WebDriverWait wait = new WebDriverWait(driver,30);
		   // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));

		driver.findElement(By.xpath("//div[@class='mCRfo9']/div/div/button")).click();
	      Boolean b =  driver.findElement(By.xpath("//a[@class='_3Ep39l']")).isEnabled();
	      Boolean d =  driver.findElement(By.xpath("//a[@class='_3Ep39l']")).isDisplayed();
	      Boolean s  =  driver.findElement(By.xpath("//a[@class='_3Ep39l']")).isSelected();
	    		  System.out.println(b);
	    		  System.out.println(d);
	    		  System.out.println(s);
		driver.close();
		driver.quit();	

	    }
		}



