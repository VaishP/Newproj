package SCRIPTS;

import org.testng.annotations.Test;

import POM.Buynowpage;
import POM.Homepage;
import POM.Lehengasareepage;
import POM.LoginPage;
import POM.Logoutpage;
import POM.Step2page;
import UNIVERSAL.Basetest;

//for login
public class Testscript1  extends Basetest{
@Test
public void testvalidlogonlogout1() throws InterruptedException{
	//driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	LoginPage l=new LoginPage(driver);

	l.signinbtn();
	Thread.sleep(5000);
	
	l.loginmail();
	l.continuebtnfn();
	l.pawrdfun();
	l.logincheck();	
Homepage h=new Homepage(driver);
	
	h.movetoelementfun();
	h.selectlehsaree();
	Lehengasareepage lp=new Lehengasareepage(driver);
	lp.sareebycolor();
	lp.filterbcolfn();
	Thread.sleep(5000);
	lp.filterbydiscount();
	Thread.sleep(5000);
	lp.selectproductfn();
	Buynowpage bn=new Buynowpage(driver);
	bn.buynowfn();
	
	Step2page s=new Step2page(driver);
	s.cashondelfn();
	s.placeorederfn();
	
	Logoutpage lo=new Logoutpage(driver);
	lo.movetoelementfun();
	lo.logoutfun();
	Thread.sleep(1000);
}
}
