package org.testngannota;

import java.awt.AWTException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utilities.BaseClass;

import pom.pojo.LoginPojo;

public class MethodClassExecution extends BaseClass {
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
	private void tc5() {
   System.out.println("Test 5 Zappos shopping:"+Thread.currentThread().getId());
	loadUrl("https://www.zappos.com/");
	}
	@Test
	private void tc6() {
		System.out.println("Test 6 Current URL:"+Thread.currentThread().getId());
		printcurrentUrl();
	}
	@Test(enabled=false)
	private void tc7() throws InterruptedException, AWTException {
		System.out.println("product search:"+Thread.currentThread().getId());
		LoginPojo l=new LoginPojo();
		cusorTo(l.getWomen());
		maxiWait(5000);
		cusorTo(l.getProduct());
		maxiWait(6000);
		rightClick(l.getItem());
		newWindow();
		maxiWait(5000);
	}
	@Test(enabled=false)
	private void tc8() throws InterruptedException {
		System.out.println("print price:"+Thread.currentThread().getId());
		LoginPojo l=new LoginPojo();
		winHand();
		printText(l.getPrice());
		maxiWait(6000);
		cusorTo(l.getSize());
		maxiWait(5000);
		btnClick(l.getCart());
		}
}
