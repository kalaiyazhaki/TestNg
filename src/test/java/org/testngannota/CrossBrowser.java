package org.testngannota;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {
	public WebDriver driver;
	@Parameters({"browser"})
	@Test
	public void tc1(String name) throws InterruptedException {
if (name.equals("chrome")) {
	//Launch chrome browser
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	}
else if (name.equals("ff")) {
	//Launch Firefox browser
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
}
else {
	//Launch edge browser
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
}
driver.get("https://www.zappos.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//a[text()='Sign In / Register']")).click();
Thread.sleep(5000);
driver.findElement(By.id("zapposSignIn")).click();
driver.findElement(By.name("email")).sendKeys("anupriya@gmail.com");
driver.findElement(By.name("password")).sendKeys("Anu@1234");
driver.findElement(By.id("signInSubmit")).click();
	}
}
