package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UNIVERSAL.Basesites;


public class Homepage extends Basesites {
	
@FindBy(xpath="//a[contains(text(),'SAREES')]")
private WebElement saree;
@FindBy(xpath="//a[@href='/sarees/lehenga-saree-sarees/?MID=megamenu_sarees_style_lehengasaree']")
private WebElement lehsaree;
@FindBy(xpath="(//li/a[contains(text(),'Festival')])[1]")
private WebElement festivalop;
@FindBy(xpath="( //a[contains(text(),'Readymade')])[1]")
private WebElement readymade;
@FindBy(xpath="(//li/a[contains(text(),'Designer')])[4]")
private WebElement designer;
@FindBy(xpath="(//li/a[contains(text(),'Contemporary')])[2]")
private WebElement contemporary;
@FindBy(xpath="//li/a[contains(text(),'SALWAR SUITS')]")
private WebElement salwar;
@FindBy(xpath="(//li/a[contains(text(),'Anarkalis')])[3]")
private WebElement anarkalis;
@FindBy(xpath="(//li/a[contains(text(),'Plain')])[3]")
private WebElement plain;
@FindBy(xpath="(//li/a[contains(text(),'Traditional')])[3]")
private WebElement traditional;
@FindBy(xpath="(//li//a[contains(text(),'Ankle')])[2]")
private WebElement ankle;
@FindBy(xpath="//li/a[contains(text(),'Semi-stitched')]")
private WebElement semistitch;
@FindBy(xpath="(//li//a[contains(text(),'Readymade')])[2]")
private WebElement salwarreadymade;
@FindBy(xpath="//li/a[contains(text(),'Semi-stitched')]")
private WebElement salwarunstitched;
@FindBy(xpath="//li/a[contains(text(),'Floor')]")
private WebElement floor;
@FindBy(xpath="(//li/a[contains(text(),'Embroidered')])[3]")
private WebElement embroidery;
@FindBy(xpath="//li/a[contains(text(),'Patialas')]")
private WebElement patialas;




public Homepage(WebDriver driver){
	super(driver);
	PageFactory.initElements(driver, this);

}

public void movetoelementfun(){
		Actions action=new Actions(driver);
	action.moveToElement(saree).perform();
}
 
public void selectlehsaree(){
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", lehsaree);
	//lehsaree.click();
}
public void festivalopfn(){
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", festivalop);
	//festivalop.click();
}
public void readymadefn(){
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", readymade);
	//readymade.click();
}

public void designerfn(){
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", designer);
	//designer.click();
}

public void contemporaryfn(){
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", contemporary);
	//contemporary.click();
}
public void salwarsuitfn(){
	Actions action=new Actions(driver);
	action.moveToElement(salwar).perform();
}
public void anarkalisfn(){
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", anarkalis);
	//anarkalis.click();
}

public void plainfn(){
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", plain);
	//plain.click();
}
public void traditionalfn(){
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", traditional);

	//traditional.click();
}
public void anklefn(){
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", ankle);

	//ankle.click();
}
public void semistitchfn(){
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", semistitch);

	//semistitch.click();
}
public void salwarreadymadefn(){
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", salwarreadymade);

	//salwarreadymade.click();
}
public void salwarunstitchedfn(){
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", salwarunstitched);

	//salwarunstitched.click();
}
public void salwarfloorfn(){
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", floor);

	//floor.click();
}

public void embroyderyfn(){
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", embroidery);

	//embroidery.click();
}
public void patialafn(){
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", patialas);

	//patialas.click();
}


}
