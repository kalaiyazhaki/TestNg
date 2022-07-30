package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;

public class Zappos extends BaseClass {
public static void main(String[] args) throws InterruptedException {
	launchChrome();
	loadUrl("https://www.zappos.com/");
	winMax();
	toPrintTitle();
	printcurrentUrl();	
	WebElement signIn = driver.findElement(By.xpath("//a[text()='Sign In / Register']"));
	btnClick(signIn);
	maxiWait(3000);
	WebElement login = driver.findElement(By.id("zapposSignIn"));
	btnClick(login);
	WebElement email= driver.findElement(By.name("email"));
	fill(email, "kalaiyazhaki@gmail.com");
	WebElement pass= driver.findElement(By.name("password"));
    fill(pass, "Mamallan@1988");
	WebElement btnClk = driver.findElement(By.id("signInSubmit"));	
	btnClick(btnClk);
	WebElement women = driver.findElement(By.xpath("(//a[@href='/womens'])[1]"));
	cusorTo(women);
	maxiWait(5000);
	WebElement product = driver.findElement(By.xpath("(//a[text()='Sandals'])[2]"));
	cusorTo(product);
	maxiWait(6000);
	WebElement item= driver.findElement(By.xpath("(//a[text()='Birkenstock - Soley by Papillio. Color Black Leather 2.'])[1]"));
	cusorTo(item);
	maxiWait(5000);
	//WebElement price = driver.findElement(By.xpath("//span[text()='140']"));
	//toPrintText(price);
	maxiWait(5000);
	WebElement size = driver.findElement(By.xpath("//label[text()='7-7.5']"));
	cusorTo(size);
	maxiWait(5000);
	WebElement width = driver.findElement(By.xpath("//label[text()='Narrow']"));
	cusorTo(width);
	WebElement cart = driver.findElement(By.xpath("(//button[@type='submit'])[4]"));
	cusorTo(cart);
}
	
}
