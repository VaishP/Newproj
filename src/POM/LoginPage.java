package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
@FindBy(xpath="//span[@class='hidden-xs user-name']")
private WebElement signin;
@FindBy(xpath="//input[@id='emailId']")
private WebElement loginemail;
@FindBy(xpath="//div[@id='continueBtn']")
private WebElement contbtn;
@FindBy(xpath="//input[@id='userPassword']")
private WebElement pwd;
@FindBy(xpath="//div[@id='loginCheck']")
private WebElement login;

public LoginPage(WebDriver driver){
	PageFactory.initElements(driver, this);
}
public void signinbtn() {
	signin.click();
	
}

public void loginmail() {
	loginemail.sendKeys("vaishpnair@gmail.com");
	
}
public void continuebtnfn() {
	contbtn.click();
	
}
public void pawrdfun() {

pwd.sendKeys("Ibexi@123");

}
public void logincheck(){
	login.click();
	
}

}
