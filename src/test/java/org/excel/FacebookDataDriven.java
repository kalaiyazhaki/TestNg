package org.excel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;

public class FacebookDataDriven extends BaseClass{
	public static void main(String[] args) throws IOException {
		launchChrome();
		loadUrl("https://www.facebook.com/");
	    winMax();
	WebElement email = driver.findElement(By.id("email"));
	fill(email, getData(3,1));
	WebElement password = driver.findElement(By.id("pass"));
	fill(password, getData(2,0));
	WebElement btnLogin = driver.findElement(By.name("login"));	
     btnClick(btnLogin);
	}
}
