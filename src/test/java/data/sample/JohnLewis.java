package data.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;

public class JohnLewis extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		launchChrome();
		loadUrl("https://www.johnlewis.com");
		//winMax();
		toPrintTitle();
		printcurrentUrl();
		//maxiWait(5000);
		WebElement electrical= driver.findElement(By.xpath("//a[text()='Electricals']"));
		mouseTo(electrical);
		maxiWait(5000);
		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobile Phones & Accessories']"));
		cusorTo(mobile);
		maxiWait(6000);
		WebElement item= driver.findElement(By.xpath("(//a[text()='Shop now'])[8]"));
		cusorTo(item);
		//maxiWait(5000);
		//winHand();
		//WebElement price = driver.findElement(By.xpath("//span[text()='140']"));
		//printText(price);
		//maxiWait(5000);
		//WebElement size = driver.findElement(By.xpath("//label[text()='7-7.5']"));
		//cusorTo(size);
		//maxiWait(5000);
		//WebElement width = driver.findElement(By.xpath("//label[text()='Narrow']"));
		//cusorTo(width);
		//WebElement cart = driver.findElement(By.xpath("(//button[@type='submit'])[4]"));
		//cusorTo(cart);
}
}
