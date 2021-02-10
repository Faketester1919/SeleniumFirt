package Mavenproj25.Mavenproj25;

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

public class Actionclass2 {
	
	WebDriver driver;
@Test
public void test1() throws InterruptedException {
System.setProperty("Webdriver.chrome.driver","chromedriver");
WebDriver driver= new ChromeDriver();
driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
driver.get("https://www.facebook.com");
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);   
Actions act1 = new Actions(driver);
   act1.sendKeys(Keys.TAB)
       .sendKeys(Keys.TAB)
       .sendKeys(Keys.TAB)
       .sendKeys(Keys.TAB)
       .sendKeys(Keys.ENTER)
       .build().perform();
WebDriverWait wait = new WebDriverWait(driver,30);
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign Up")));
WebElement e1= driver.findElement(By.xpath("//input[@name='firstname']"));
    act1.moveToElement(e1)
   .sendKeys("priyanka")
   .sendKeys(Keys.TAB)
   .sendKeys("Chauhan")
   .sendKeys(Keys.TAB)
   .sendKeys("parctacc@gmail.com")
   .sendKeys(Keys.TAB)
   .sendKeys("Password@123")
   .sendKeys(Keys.TAB)
   .sendKeys("Password@123")
   .sendKeys(Keys.TAB)
   .sendKeys(Keys.TAB).click().keyDown(Keys.ARROW_DOWN).keyDown(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

//  .sendKeys("18")
//  .sendKeys(Keys.TAB)
//   .sendKeys(Keys.TAB)
//  .sendKeys(Keys.TAB).click()
//  .sendKeys(Keys.TAB)
//   .sendKeys(Keys.TAB)
//   .sendKeys(Keys.TAB)
//  .sendKeys(Keys.TAB).build().perform();
}

}
