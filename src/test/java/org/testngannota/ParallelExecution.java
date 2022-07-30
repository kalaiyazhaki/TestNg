package org.testngannota;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utilities.BaseClass;

import pom.pojo.LoginPojo;

public class ParallelExecution extends BaseClass {
	@BeforeClass
	private void browserLaunch() {
		System.out.println("Open chrome");
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
	@Test
	private void tc1() {
   System.out.println("Test 1 Zappos shopping:"+Thread.currentThread().getId());
	loadUrl("https://www.zappos.com/");
	}
	@Test
	private void tc2() {
		System.out.println("Test 2 Title:"+Thread.currentThread().getId());
		toPrintTitle();
	}
	@Test(enabled=false)
	private void tc3() {
		System.out.println("Current URL:"+Thread.currentThread().getId());
		printcurrentUrl();
	}
	@Test(enabled=false)
	private void tc4() throws IOException, InterruptedException {
		System.out.println("login:"+Thread.currentThread().getId());
		LoginPojo l=new LoginPojo();
		btnClick(l.getSignIn());
		maxiWait(3000);
		btnClick(l.getLogin());
		fill(l.getEmail(), getData(12, 0));
		fill(l.getPass(), getData(12,1));
		btnClick(l.getBtnClk());
	}
}
