package UNIVERSAL;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class Basetest implements Constants{
	
	
	public static WebDriver driver;
	@BeforeTest
	public void openapp() {
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		driver=new  FirefoxDriver();
		driver.get("http://www.craftsvilla.com/");
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@AfterTest
	public void closeapp() {
		
		//driver.close();
	}
}