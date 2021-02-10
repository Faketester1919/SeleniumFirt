package Mavenproj25.Mavenproj25;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
public class Actionclass {
		WebDriver driver;
	@Test
	public void test1() throws InterruptedException {
    System.setProperty("Webdriver.chrome.driver","chromedriver");
    WebDriver driver= new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
    driver.get("https://www.flipkart.com");

	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
	//Mouse hover On element Electronics
   WebElement ab= driver.findElement(By.xpath("//div[@id='container']/div/div[2]/div/div/span"));
    driver.manage().window().maximize();
   Actions act = new Actions(driver);
   act.moveToElement(ab).build().perform();
  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
   WebDriverWait wait = new WebDriverWait(driver,30);
  // wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("iPhone SE")));
   
    // after Mousehover select the item iPhone SE
    WebElement ac = driver.findElement(By.linkText("iPhone SE"));
    act.moveToElement(ac);
    act.click().build().perform();
   
   //right click
        act.contextClick().click().build().perform();
   
}
}