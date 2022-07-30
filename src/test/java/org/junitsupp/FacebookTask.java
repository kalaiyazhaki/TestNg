package org.junitsupp;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;

public class FacebookTask extends BaseClass {
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
	//tabClose();
	}

	@Test
	public void tc1() throws IOException {
	System.out.println("Test 1");	
	loadUrl("https://www.facebook.com/");
	String title = printTitle();
	//for check use assert
	Assert.assertTrue("check the email:",title.contains("book"));
	System.out.println("title: "+title);
	printcurrentUrl();
	WebElement email = driver.findElement(By.id("email"));
	//fill(email, getData(1, 0)); use this line or below one line
	fill(email, "malini");
	//use get attribute
String user = toPrintValue(email, "value");
//for check use assert
Assert.assertTrue("check the email",user.contains("malini"));
//Assert.assertEquals("check username","malini", user); use this or use above one
System.out.println("email: "+user);
WebElement password = driver.findElement(By.id("pass"));
//fill(password, getData(6, 0)); use this line or below one line
fill(password, "mali@12");
String pass = toPrintValue(password, "value");
//for check use assert
//Assert.assertTrue("check the password", pass.contains("Malini"));   use this or use below one
Assert.assertEquals("check passsword","mali@12", pass);
System.out.println("password: "+pass);
	}
}

