package UNIVERSAL;

//import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

//verify title 
public class Basesites extends Basetest {
	
	public Basesites(WebDriver driver){
		Basetest.driver=driver;
	}
	public void verifytitle(String title){
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try{
		wait.until(ExpectedConditions.titleContains(title));
			Reporter.log("title is matching ",true);
		}
		catch(Exception e){
			Reporter.log("title is not  matching ",true);
		}
	}
	
		
	
	
}
