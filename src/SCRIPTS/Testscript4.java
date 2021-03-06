package SCRIPTS;

import org.testng.annotations.Test;

import POM.Buynowpage;
import POM.Festivalsaree;
import POM.Homepage;
import POM.LoginPage;
import POM.Logoutpage;
import POM.Step2page;
import UNIVERSAL.Basetest;

public class Testscript4 extends Basetest  {
	@Test 
	public void testvalidlogonlogout4() throws InterruptedException{
		LoginPage l=new LoginPage(driver);

		l.signinbtn();
		Thread.sleep(1000);
		l.loginmail();
		l.continuebtnfn();
		l.pawrdfun();
		l.logincheck();	
		Homepage h=new Homepage(driver);
		h.movetoelementfun();
		h.designerfn();
		Festivalsaree fe=new Festivalsaree(driver);
		fe.selectdeblousecolfn();
		Thread.sleep(5000);
		fe.selectdesblouseclickfn();
		Festivalsaree f=new Festivalsaree(driver);
		Thread.sleep(5000);
		f.discountfn();
		Thread.sleep(5000);
		fe.selectproductfn();
		Buynowpage bn=new Buynowpage(driver);
		bn.buynowfn();
		Step2page sh=new Step2page(driver);
		sh.cashondelfn();
		sh.placeorederfn();
		Logoutpage lo=new Logoutpage(driver);
		lo.movetoelementfun();
		lo.logoutfun();
		Thread.sleep(1000);
}
}