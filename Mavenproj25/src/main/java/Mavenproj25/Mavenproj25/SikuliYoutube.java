package Mavenproj25.Mavenproj25;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;
import org.testng.annotations.Test;

public class SikuliYoutube {
	@Test
	public void test() throws SikuliException
	{
    System.setProperty("Webdriver.chrome.driver","chromedriver");
	WebDriver driver = new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   driver.get("https://www.youtube.com/watch?v=569qoURhXoY");
   // create object of screen class
   Screen s = new Screen(); 
   //create object of pattern class
   
   Pattern Play1 = new Pattern("Myplay.png");
   s.wait(Play1,2000);
   s.click();
   s.click();
   driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

   
   Pattern Pause1 =new Pattern("Mypause.png");
   //wait till the image is visible
   s.wait(Pause1,2000);
   s.click();
  // s.click();
   driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
 
   Pattern vol1 = new Pattern("Myvolume.png");
   s.wait(vol1,2000);
   s.click();
  // s.click();
   driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
 
   Pattern set1 = new Pattern("Mysetting.png");
   s.wait(set1, 2000);
   s.click();
   s.click();
   driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
  
   Pattern qua1 = new Pattern("Auto1080p.png");
   s.wait(qua1,2000);
   s.click();
   s.click();
   driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
   
   Pattern qua2 = new Pattern("Auto360p.png");
   s.wait(qua2,2000);
   s.click();
   s.click();
   driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

  
   Pattern qua3 = new Pattern("144p.png");
   s.wait(qua3,2000);
   s.click();
   s.click();
}
}