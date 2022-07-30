package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;

public class ProductSearch extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		launchChrome();
		loadUrl("https://www.zappos.com/");
		winMax();
		toPrintTitle();
		printcurrentUrl();
		maxiWait(5000);
		WebElement women = driver.findElement(By.xpath("(//a[@href='/womens'])[1]"));
		cusorTo(women);
		maxiWait(5000);
		WebElement product = driver.findElement(By.xpath("(//a[text()='Sandals'])[2]"));
		cusorTo(product);
		maxiWait(6000);
		WebElement item= driver.findElement(By.xpath("(//a[text()='Birkenstock - Soley by Papillio. Color Black Leather 2.'])[1]"));
		cusorTo(item);
		maxiWait(5000);
		winHand();
		WebElement price = driver.findElement(By.xpath("//span[text()='140']"));
		printText(price);
		maxiWait(5000);
		WebElement size = driver.findElement(By.xpath("//label[text()='9-9.5']"));
		cusorTo(size);
		maxiWait(8000);
		//WebElement width = driver.findElement(By.xpath("//label[text()='Narrow']"));
		//cusorTo(width);
		WebElement cart = driver.findElement(By.xpath("(//button[text()='Add to Cart'])[1]"));
		cusorTo(cart);
		maxiWait(8000);
}
}
