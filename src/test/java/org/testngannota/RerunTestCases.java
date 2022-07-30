package org.testngannota;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.utilities.BaseClass;

import pom.pojo.LoginPojo;

public class RerunTestCases extends BaseClass {
	@Test
	private void tc1() {
		System.out.println("Zappos shopping");
		launchChrome();
		winMax();
		loadUrl("https://www.zappos.com/");
	}
	@Test
	private void tc2() {
		System.out.println("Current URL:");
		printcurrentUrl();
}
	@Test
	private void tc3() throws IOException, InterruptedException {
		LoginPojo l=new LoginPojo();
		btnClick(l.getSignIn());
		maxiWait(3000);
		btnClick(l.getLogin());
		fill(l.getEmail(), getData(2, 0));
		fill(l.getPass(), getData(3, 0));
		btnClick(l.getBtnClk());
		maxiWait(5000);
	}
	//to make your test should failed use asserttrue false
	@Test//(retryAnalyzer=Failed.class)this for 2nd approach
	private void tc4() {
		System.out.println("Title:");
		toPrintTitle();
		Assert.assertTrue(false, "Please check the tc4 title");
	}
}
