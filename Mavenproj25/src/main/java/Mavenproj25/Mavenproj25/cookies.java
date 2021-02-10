package Mavenproj25.Mavenproj25;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class cookies {
@Test
public void cookies() {
System.setProperty("Webdriver.chrome.driver","chromedriver");
WebDriver driver= new ChromeDriver();
driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
driver.get("https://www.blazedemo.com/");
Set <Cookie> cookies=driver.manage().getCookies();
//size of cookies
System.out.println("no of cookies"+" "+ cookies.size());

for(Cookie cookiedetails:cookies){
	System.out.println("cookie name"+" "+ cookiedetails.getName());
	System.out.println("cookie path"+" "+ cookiedetails.getPath());
	System.out.println("cookie value"+" "+ cookiedetails.getValue());
	System.out.println("cookie domain"+" "+ cookiedetails.getDomain());
}
driver.manage().deleteAllCookies();
System.out.println("cookie size after deletion"+" "+cookies.size());
// adding a cookie
Cookie add =new Cookie("username" ,"priyanka");
driver.manage().addCookie(add);
System.out.println("cookie size after ADDING"+" "+cookies.size());
System.out.println(driver.manage().getCookieNamed("username"));
driver.quit();
}
}