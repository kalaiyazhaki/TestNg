package data.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;

public class Momondo extends BaseClass {
	public static void main(String[] args) {
		launchChrome();
		loadUrl("https://www.momondo.com/");
		winMax();
		toPrintTitle();
		printcurrentUrl();
		WebElement from = driver.findElement(By.xpath("//input[@type='text']"));
		fill(from, "Paris, France (PAR)");
		WebElement to = driver.findElement(By.xpath("//div[text()='To?']"));
		fill(to, "Rome, Italy (ROM)");
		WebElement conti = driver.findElement(By.xpath("//span[text()='Search']"));
	    btnClick(conti);
	   //WebElement search= driver.findElement(By.name("continueFlightSearch"));	
	   //btnClick(search);
}
}