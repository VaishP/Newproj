package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UNIVERSAL.Basesites;

public class Lehengasareepage extends Basesites  {
	@FindBy(xpath="//input[@placeholder='Search By Saree Color']")
	private WebElement sarebcol;
	@FindBy(xpath="//label[@for='saree-color_red']")
	private WebElement filterbcol;
	
	@FindBy(xpath="(//span[contains(text(),'Discount')])[2]")
	private WebElement discount;
	
	
	@FindBy(xpath="(//img[@class='product-image'])[1]")
	private WebElement selpdt;
	public Lehengasareepage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);

	}
	public void sareebycolor(){
		sarebcol.sendKeys("red");
	}
	public void filterbcolfn(){
		filterbcol.click();
	}
	
	public void filterbydiscount(){
		discount.click();
	}
	public void selectproductfn(){
		selpdt.click();
	}
}
