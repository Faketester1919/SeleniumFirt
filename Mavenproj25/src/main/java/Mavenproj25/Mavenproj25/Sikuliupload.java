package Mavenproj25.Mavenproj25;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.SikuliException;
import org.testng.annotations.Test;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class Sikuliupload {
	@Test
	public void test() throws SikuliException
	{
    System.setProperty("Webdriver.chrome.driver","chromedriver");
	WebDriver driver = new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   driver.get("https://www.naukri.com");
driver.manage().window().maximize();
driver.findElement(By.xpath("//div[@class='wdgt-upload-btn']/label")).click();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//once "upload cv" is clicked  a new window will open to to identify the window take screenshot where the path is provided  and save it in below path
String imageFilepath = "Users\\priyankac\\Desktop\\Screenshot2\\";
//where the file to be uploaded location is present
String inputFilepath ="Users\\priyankac\\Desktop\\Screenshot2\\";
Screen sc = new Screen();
Pattern file = new Pattern(imageFilepath +"search.docx");
Pattern OB = new Pattern(imageFilepath +"OPEN.png");
sc.wait(file,20);
//for uploading a file
sc.type(file,inputFilepath+"pc.docx");
// to click on open button so that file gets uploaded
sc.click(OB);
}
}