package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UNIVERSAL.Basesites;

public class Buynowpage  extends Basesites  {
	@FindBy(id="buynow")
	private WebElement buynow;
	
	
	public Buynowpage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);

	}
	
	public void buynowfn(){
		buynow.click();
	}

}
