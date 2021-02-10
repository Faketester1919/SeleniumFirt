package Mavenproj25.Mavenproj25;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Screenshotss {	
	@Test
	public void test() throws IOException
	{
    System.setProperty("Webdriver.chrome.driver","chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	/*driver.get("https://www.amazon.com/");
	Actions ac = new Actions(driver);
	driver.get("https://www.facebook.com/");
	ac.keyDown(Keys.COMMAND.SHIFT +"3").build().perform();
	driver.get("https://www.amazon.com/");*/  
	  
 driver.get("https://www.facebook.com");
 driver.manage().window().maximize();
 driver.findElement(By.id("email")).sendKeys("topriyankac@gmail.com");
//enter wrong password
 driver.findElement(By.id("pass")).sendKeys("12345678");
 WebElement button= driver.findElement(By.id("u_0_b"));
//highlighting the login button
 border(button,driver);
 TakesScreenshot ts1=(TakesScreenshot)driver;
 File src1 = ts1.getScreenshotAs(OutputType.FILE);
// Screenshot will be saved in folder fbhighlight already created in desktop and screenshot name will be screenshot1
FileUtils.copyFile(src1, new File("/Users/priyankac/Desktop/fbhighlight/screenshot1.png"));
//Now click on login button
 button.click();
String title = driver.getTitle();
//if the title is still Facebook login page that mean user did not navigate to the next window
 if(title.contentEquals("Facebook – log in or sign up"))
    {
	//moving on to next window unsuccessful
System.out.println("launch unsuccessful");
	//Take the screenshot of the error message.
	   TakesScreenshot ts2=(TakesScreenshot)driver;
		File src2 = ts2.getScreenshotAs(OutputType.FILE);
		// save it in same folder fbhighlight with name screenshot2
	FileUtils.copyFile(src2, new File("/Users/priyankac/Desktop/fbhighlight/screenshot2.png"));
		 }
else {
	System.out.println("launch successful");

     }
    
	}
	public static void border(WebElement element, WebDriver driver){
		   JavascriptExecutor js =(JavascriptExecutor)driver;
		   js.executeScript("arguments[0].style.border='3px solid red'", element);

	}

}
