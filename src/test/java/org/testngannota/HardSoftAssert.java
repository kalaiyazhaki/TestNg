package org.testngannota;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.utilities.BaseClass;

import pom.pojo.LoginPojo;

public class HardSoftAssert extends BaseClass {
	@BeforeClass
	private void browserLaunch() {
	launchChrome();
	winMax();
	}
	@AfterClass
	private void close() {
	System.out.println("Close Chrome:");
		}
	@BeforeMethod
	private void startTime() {
	System.out.println("Start Time:");
	printDate();
	System.out.println("Zappos shopping");
	loadUrl("https://www.zappos.com/");
	
	}
	@AfterMethod
	private void endTime() {
	System.out.println("End Time:");
	printDate();
	}
	//invalid username and valid password
	@Test(priority=-20)
	private void tc1() throws IOException, InterruptedException {
		LoginPojo l=new LoginPojo();
		btnClick(l.getSignIn());
		maxiWait(3000);
		btnClick(l.getLogin());
		fill(l.getEmail(), getData(2, 0));
		fill(l.getPass(), getData(3, 0));
		btnClick(l.getBtnClk());
		maxiWait(5000);
	}
	//invalid username and invalid password
		@Test(priority=-25)
		private void tc2() throws IOException, InterruptedException {
			LoginPojo l=new LoginPojo();
			btnClick(l.getSignIn());
			maxiWait(3000);
			btnClick(l.getLogin());
			fill(l.getEmail(), getData(1, 1));
			fill(l.getPass(), getData(2, 1));
			btnClick(l.getBtnClk());
			maxiWait(5000);
		}
	@Test(priority=2)
	private void tc3() {
	System.out.println("Title:");
		}
	@Test
	private void tc4() {
		System.out.println("Current URL:");
		printcurrentUrl();
	}
	//valid username and valid password-------->HARD ASSERT
	@Test(priority=5)
	private void tc5() throws IOException, InterruptedException {
		System.out.println("search");
		LoginPojo l=new LoginPojo();
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Shoes"), "Please check your tc5");
		System.out.println(title);
		btnClick(l.getSignIn());
		maxiWait(3000);
		btnClick(l.getLogin());
		//fill(l.getEmail(), getData(7, 0));
		fill(l.getEmail(),"Nandhini");
		String email = toPrintValue(l.getEmail(), "value");
		Assert.assertEquals("Nandhini",email, "Please check the email");
		System.out.println("tc5:"+email);
		fill(l.getPass(), getData(8, 0));
		btnClick(l.getBtnClk());
		maxiWait(5000);
	}
	@Test(priority=15)
	private void tc6() throws InterruptedException, AWTException {
		System.out.println("women");
		LoginPojo l=new LoginPojo();
		cusorTo(l.getWomen());
		maxiWait(5000);
		cusorTo(l.getProduct());
		maxiWait(6000);
		cusorTo(l.getItem());
		//rightClick(l.getItem());
		//newWindow();
		maxiWait(5000);
			}
	@Test(priority=10,enabled=true)
	private void tc7() throws InterruptedException {
		LoginPojo l=new LoginPojo();
		winHand();
		printText(l.getPrice());
		maxiWait(6000);
		cusorTo(l.getSize());
		maxiWait(7000);
		btnClick(l.getCart());
	}
	//valid username and invalid password---------->SOFT ASSERT
			@Test(priority=-15)
			private void tc8() throws IOException, InterruptedException {
				LoginPojo l=new LoginPojo();
				String title = driver.getTitle();
				SoftAssert s=new SoftAssert();
				s.assertTrue(title.startsWith("Shoes"),"Please check your tc5");
				btnClick(l.getSignIn());
				maxiWait(3000);
				btnClick(l.getLogin());
				fill(l.getEmail(), getData(4, 0));
				String email = toPrintValue(l.getEmail(), "value");
				s.assertEquals("kirthu", email, "Please check the email");
				System.out.println("tc8:"+email);
				fill(l.getPass(), getData(5, 1));
				btnClick(l.getBtnClk());
				maxiWait(5000);
				s.assertAll();
			}
	@Test(enabled=false)
	private void tc9() {
	System.out.println("close");
	tabClose();
	}

}
