package Mavenproj25.Mavenproj25;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitleUrl 
{
		
	@Test 
    public void beforetest()
    {
		System.setProperty("Webdriver.chrome.driver", "chromedriver");
	    WebDriver driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   driver.manage().window().maximize();    
	    driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//div[@class='mCRfo9']/div/div/button")).click();
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mobile");	    
	    driver.navigate().to("https://www.amazon.in");
	    String title = driver.getTitle();
	    String url = driver.getCurrentUrl();
	    System.out.println(title);
	    System.out.println(url);
	    driver.navigate().back();
	    driver.navigate().forward();
	    driver.navigate().refresh();
	driver.close();
	driver.quit();	
	
    }
	}

	
