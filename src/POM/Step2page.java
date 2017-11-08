package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UNIVERSAL.Basesites;

public class Step2page  extends Basesites{
	@FindBy(xpath="//span[contains(text(),'Cash On Delivery')]")
	private WebElement cashondel;
	@FindBy(xpath="(//button[@class='pure-button payment-submit-button js-payment-submit-btn'])[1]")
	private WebElement placeorderbtn;
	
	public Step2page(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);

	}
	
	public void cashondelfn(){
		cashondel.click();
	}
	public void placeorederfn(){
		placeorderbtn.click();
	}

}
