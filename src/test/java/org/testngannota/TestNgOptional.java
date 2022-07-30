package org.testngannota;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utilities.BaseClass;

import pom.pojo.LoginPojo;

public class TestNgOptional extends BaseClass{
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
	}
	@AfterMethod
	private void endTime() {
	System.out.println("End Time:");
	printDate();
	}
	@Test(priority=-20)
	private void tc4() {
		System.out.println("Zappos shopping");
		loadUrl("https://www.zappos.com/");
	}
	@Test(invocationCount=2,priority=-10)
	private void tc6() {
		System.out.println("Title:");
		toPrintTitle();
	}
	@Test(priority=-15)
	private void tc3() {
		System.out.println("Current URL:");
		printcurrentUrl();
	}
	@Parameters({"emails","passs"})
	@Test
	private void tc1(@Optional("anu@gmail.com")String s1,@Optional("Anu@123")String s2) throws IOException, InterruptedException {
		System.out.println("search");
		LoginPojo l=new LoginPojo();
		btnClick(l.getSignIn());
		maxiWait(3000);
		btnClick(l.getLogin());
		fill(l.getEmail(), s1);
		fill(l.getPass(), s2);
		btnClick(l.getBtnClk());
	}
	@Test(priority=5)
	private void tc5() throws InterruptedException {
		System.out.println("flight trip");
		LoginPojo l=new LoginPojo();
		cusorTo(l.getWomen());
		maxiWait(5000);
		cusorTo(l.getProduct());
		maxiWait(6000);
		cusorTo(l.getItem());
		maxiWait(5000);
	}
	@Test(priority=10,enabled=false)
	private void tc2() throws InterruptedException {
		System.out.println("clik");
		LoginPojo l=new LoginPojo();
		cusorTo(l.getSize());
		maxiWait(5000);
		cusorTo(l.getCart());
	}
	@Test(enabled=false)
	private void tc7() {
	System.out.println("close");
	tabClose();
	}
	
}
