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
		l.loginmail();
		l.continuebtnfn();
		l.pawrdfun();
		l.logincheck();	
		Homepage h=new Homepage(driver);
		h.movetoelementfun();
		h.designerfn();
		Festivalsaree fe=new Festivalsaree(driver);
		fe.selectblousefn();
		fe.selectdeblousecolfn();
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