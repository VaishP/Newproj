package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UNIVERSAL.Basesites;

public class Logoutpage extends Basesites {

	@FindBy(xpath="//span[@id='cart-header-login']")
	private WebElement username;
	@FindBy(xpath="(//a[@class='js-cart-header-link'])[6]")
	private WebElement logoutbtn;
	
	
	public Logoutpage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void movetoelementfun(){
		Actions action=new Actions(driver);
	action.moveToElement(username).perform();
}
	public void logoutfun(){
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", logoutbtn);

		
	}
}
