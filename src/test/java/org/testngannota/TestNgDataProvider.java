package org.testngannota;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.utilities.BaseClass;

import pom.pojo.LoginPojo;

public class TestNgDataProvider extends BaseClass {
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
	@Test(invocationCount=2,priority=2)
	private void tc3() {
		System.out.println("Title:");
		toPrintTitle();
	}
	@Test
	private void tc4() {
		System.out.println("Current URL:");
		printcurrentUrl();
	}
	//valid username and valid password
	@Test(priority=5)
	private void tc5() throws IOException, InterruptedException {
		System.out.println("search");
		LoginPojo l=new LoginPojo();
		btnClick(l.getSignIn());
		maxiWait(3000);
		btnClick(l.getLogin());
		fill(l.getEmail(), getData(7, 0));
		fill(l.getPass(), getData(8, 0));
		btnClick(l.getBtnClk());
		maxiWait(5000);
	}
	@Test(priority=10)
	private void tc6() throws InterruptedException, AWTException {
		System.out.println("Product Search");
		LoginPojo l=new LoginPojo();
		cusorTo(l.getWomen());
		maxiWait(5000);
		cusorTo(l.getProduct());
		maxiWait(6000);
		rightClick(l.getItem());
		newWindow();
		maxiWait(5000);
	}
	@Test(priority=15,enabled=true)
	private void tc7() throws InterruptedException {
		System.out.println("price");
		LoginPojo l=new LoginPojo();
		winHand();
		printText(l.getPrice());
		maxiWait(5000);
		cusorTo(l.getSize());
		maxiWait(5000);
		cusorTo(l.getCart());
	}
	//valid username and invalid password
			@Test(priority=-15,dataProvider="login")
			private void tc8(String s1,String s2) throws IOException, InterruptedException {
				LoginPojo l=new LoginPojo();
				btnClick(l.getSignIn());
				maxiWait(3000);
				btnClick(l.getLogin());
				fill(l.getEmail(), s1);
				fill(l.getPass(), s2);
				btnClick(l.getBtnClk());
				maxiWait(5000);
			}
			//manual key this
			@DataProvider(name="login")
			private Object[][] data(){
				return new Object[][] {
					{"java","java@123"},
					{"sql","sql@123"},
					{"selenium","selenium@123"},
					{"ruby","ruby@123"}
					};
			}
	@Test(enabled=false)
	private void tc9() {
	System.out.println("close");
	tabClose();
	}
}
