package org.junitsupp;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;

import pom.pojo.LoginPojo;

public class ZapposJunitPojo extends BaseClass {
	@BeforeClass
	public static void bfCls() {
	System.out.println("Before class started\n=======");
	printDate();
	}
	@AfterClass
	public static void aftCls() {
	System.out.println("\n=======After class ends");
	printDate();
	}
	@Before
	public void bf() {
	System.out.println("Before started\n=======");
	launchChrome();
	winMax();
	}
	@After
	public void aft() {
	System.out.println("After ends\n========");
		}
@Ignore
	@Test
	public void tc1() throws IOException {
	System.out.println("Test 1");	
	loadUrl("https://www.facebook.com/");
	String title = printTitle();
	//for check use assert
	//Assert.assertTrue("check the title:", true);
	Assert.assertTrue("check the title:",title.contains("book"));
	System.out.println("title: "+title);
	printcurrentUrl();
}
	@Test
	public void tc2() throws IOException {
	System.out.println("Test 2");	
	loadUrl("https://www.zappos.com/");
	String title = printTitle();
	//for check use assert
	//Assert.assertTrue("check the title:", true);
	Assert.assertTrue("check the title:",title.contains("Shoes"));
	System.out.println("title: "+title);
	String url = toPrinturl();
	//for check use assert
	Assert.assertTrue("check the url:",url.startsWith("https:"));
	System.out.println("Url: "+url);
	//create object for pojoclass
	LoginPojo l=new LoginPojo();
	//use this method or below method
	fill(l.getEmail(),"ROME (FCO), ITALY");
	//use get attribute to print input
	String from = toPrintValue(l.getEmail(),"value");
	System.out.println(from);
	//for checking inputs use assertequals
	Assert.assertEquals("check from", "ROME (FCO), ITALY", from);
	WebElement to = l.getPass();
	to.sendKeys("PULA (PUY), CROATIA");
	String to0 = toPrintValue(to, "value");
	System.out.println(to0);
	Assert.assertEquals("check to:", "PULA (PUY), CROATIA",to0);
	}
}