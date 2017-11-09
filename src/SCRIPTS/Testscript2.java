package SCRIPTS;

import org.testng.annotations.Test;

import POM.Buynowpage;
import POM.Festivalsaree;
import POM.Homepage;
import POM.LoginPage;
import POM.Logoutpage;
import POM.Step2page;
import UNIVERSAL.Basetest;

public class Testscript2 extends Basetest{
	@Test
	public void testvalidlogonlogout2() throws InterruptedException{
		LoginPage l=new LoginPage(driver);

		l.signinbtn();
		l.loginmail();
		l.continuebtnfn();
		l.pawrdfun();
		l.logincheck();	
		Homepage h=new Homepage(driver);
		h.movetoelementfun();
		h.festivalopfn();
		Festivalsaree f=new Festivalsaree(driver);
		f.festivalcolfn();
		Thread.sleep(5000);
		f.festivalcolselfn();
		Thread.sleep(5000);
		f.discountfn();
		Thread.sleep(5000);
		f.selectproductfn();
		
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
