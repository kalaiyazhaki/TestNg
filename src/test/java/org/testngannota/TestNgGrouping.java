package org.testngannota;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;
import org.utilities.BaseClass;

import pom.pojo.LoginPojo;

public class TestNgGrouping extends BaseClass {
	@Test(priority=-30,groups="regression")
	private void tc11() {
	launchChrome();
	winMax();
	}
	@Test(groups= {"cloud,smoke"})
	private void tc22() {
	System.out.println("Close Chrome:");
	}
	//AND operator same condition give in 
	@Test(priority=-25,groups= {"bvt,share"})
	private void tc33() {
	System.out.println("Start Time:");
	printDate();
	}
	@Test(priority=-20,groups="Functional")
	private void tc44() {
	System.out.println("End Time:");
	printDate();
	}
	@Test(priority=-22,groups="sanity")
	private void tc55() {
		System.out.println("Zappos shopping");
	loadUrl("https://www.zappos.com/");
	}
	@Test(groups="bvt")
	private void tc2() {
		System.out.println("Title:");
		toPrintTitle();
	}
	@Test(groups="Functional")
	private void tc3() {
		System.out.println("Current URL:");
		printcurrentUrl();
	}
	@Test(groups= {"sanity","smoke"})
	private void tc4() throws IOException, InterruptedException {
		System.out.println("Login");
		LoginPojo l=new LoginPojo();
		btnClick(l.getSignIn());
		maxiWait(3000);
	}
	//like OR operator
		@Test(groups= {"sanity","regression"})
		private void tc5() throws IOException, InterruptedException {
		System.out.println("Signin");
		LoginPojo l=new LoginPojo();
		btnClick(l.getLogin());
		fill(l.getEmail(), getData(12, 0));
		fill(l.getPass(), getData(12,1));
		btnClick(l.getBtnClk());
		maxiWait(3000);
	}
	@Test(groups= {"smoke","regression"})
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
	@Test(groups= {"cloud","regression"})
	private void tc7() throws InterruptedException {
		System.out.println("price");
		LoginPojo l=new LoginPojo();
		winHand();
		printText(l.getPrice());
		maxiWait(5000);
		cusorTo(l.getSize());
		maxiWait(6000);
		cusorTo(l.getCart());
		}
	@Test(groups= {"cloud","share"})
	private void tc8() {
	System.out.println("close");
	tabClose();
	}
}
