package Mavenproj25.Mavenproj25;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class flipkart {

	WebDriver driver;
		
		
	@Test 
    public void test() 
    {
		System.setProperty("Webdriver.chrome.driver", "chromedriver");
	    WebDriver driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   driver.manage().window().maximize();    
	    driver.get("https://www.flipkart.com");
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mobile");
	    driver.findElement(By.xpath("//*[@class='_34RNph']")).click();
//choosing price via dropdown
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//make use of Select class
		  Select  se= new Select(driver.findElement(By.className("_2YxCDZ")));
		   se.selectByValue("7000");
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		   Select  de= new Select(driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/section[2]/div[4]/div[3]/select[1]")));
		   de.selectByValue("25000");
	
		
//select ram of mobile which is 3 gb		
		   driver.findElement(By.xpath("//div[@title='3 GB']")).click();
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   //select brand of mobile which is Samsung
		   driver.findElement(By.xpath("//div[@id='container']/div[1]/div[3]/div[2]/div[1]/div/div/div/div/section[5]/div[2]/div/div[6]")).click();
		   
	//driver.close();
	//driver.quit();	
	

    }
	
}
