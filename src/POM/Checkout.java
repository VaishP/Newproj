package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UNIVERSAL.Basesites;

public class Checkout  extends Basesites{
@FindBy(xpath="//input[@id='address-email']")
private WebElement checkoutmail;
@FindBy(xpath="//input[@id='address-first-name']")
private WebElement fn;
@FindBy(xpath="//input[@id='address-last-name']")
private WebElement ln;
@FindBy(xpath="//input[@id='address-pincode']")
private WebElement pin;
@FindBy(xpath="//textarea[@id='address-textbox']")
private WebElement addr;
@FindBy(xpath="//input[@id='address-mobileno']")
private WebElement mob;
@FindBy(xpath="//button[@id='address-form-submit']")
private WebElement deliverbtn;

public Checkout(WebDriver driver){
	super(driver);
	
	PageFactory.initElements(driver, this);
}
public void checkoutemail(){
	checkoutmail.sendKeys("yerabalusiri@gmail.com");
}
public void firstnamefn(){
	fn.sendKeys("yerabalu");
}
public void lastnamefn(){
	ln.sendKeys("sireesha");
}
public void pinfn(){
	pin.sendKeys("560037");
}
public void addrfn(){
	addr.sendKeys("fjhbghghgdvdv");
}
public void mobfn(){
	mob.sendKeys("9878345671");
}
public void deliverfn(){
	deliverbtn.sendKeys("yerabalusiri@gmail.com");
}







}
