package SCRIPTS;

import org.testng.annotations.Test;

import POM.Buynowpage;
import POM.Festivalsaree;
import POM.Homepage;
import POM.LoginPage;
import POM.Logoutpage;
import POM.Step2page;
import UNIVERSAL.Basetest;

public class Testscript11 extends Basetest{
	@Test 
	public void testvalidlogonlogout11() throws InterruptedException{
		LoginPage l=new LoginPage(driver);
		l.signinbtn();
		Thread.sleep(5000);
		l.loginmail();
		l.continuebtnfn();
		l.pawrdfun();
		l.logincheck();
		Homepage h=new Homepage(driver);
		h.salwarsuitfn();
		h.salwarreadymadefn();
		Festivalsaree fe=new Festivalsaree(driver);
		fe.selectbykurtacolfn();
		Thread.sleep(3000);
		fe.selectbykurtacolgreenfn();
		Thread.sleep(3000);
		fe.selectproductfn();
		Thread.sleep(3000);
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
