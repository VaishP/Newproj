package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UNIVERSAL.Basesites;

public class Festivalsaree extends Basesites{

	@FindBy(xpath="//input[@placeholder='Search By Saree Color']")
	private WebElement festcol;
	@FindBy(xpath="(//label[@title='Blue'])[2]")
	private WebElement festcolsel;
	@FindBy(xpath="//span[@id='discountedPriceOrder_DESC']")
	private WebElement discount;
	@FindBy(xpath="(//img[@class='product-image'])[1]")
	private WebElement selpdt;
	@FindBy(xpath="(//input[@placeholder='Search By Color'])[2]")
	private WebElement selblousecol;
	@FindBy(xpath="//label[@for='color_pink']")
	private WebElement selblouseclick;
	@FindBy(xpath="//label[@for='color_brown']")
	private WebElement seldesblousecol;
	@FindBy(xpath="(//input[@placeholder='Search By Color'])[2]")
	private WebElement selcontblousecoltext;
	@FindBy(xpath="//label[@for='color_gold']")
	private WebElement selcontblousecol;
	@FindBy(xpath="//input[@placeholder='Search By Kurta Color']")
	private WebElement selbykurtacol;
	@FindBy(xpath="//label[@for='kurta-color_green']")
	private WebElement selbykurtacolgreen;
	
	
	public Festivalsaree(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);

	}
	
	public void festivalcolfn(){
		festcol.sendKeys("Blue");
		}
	public void festivalcolselfn(){
		festcolsel.click();
		}
	public void discountfn(){
		discount.click();
		}
	public void selectproductfn(){
		selpdt.click();
	}
	public void selectblousefn(){
		selblousecol.sendKeys("pink");
	}
	public void selectblousecolfn(){
		selblouseclick.click();
	}
	public void selectdeblousecolfn(){
		selblousecol.sendKeys("brown");
	}
	
	public void selectdesblouseclickfn(){
		seldesblousecol.click();
	}
	public void selectcontblousecolfn(){
		selcontblousecoltext.sendKeys("gold");
	}
	public void selcontblousecolclickfn(){
		selcontblousecol.click();
}
	public void selectbykurtacolfn(){
		selbykurtacol.sendKeys("green");
	}
	public void selectbykurtacolgreenfn(){
		selbykurtacolgreen.click();
	}
}
