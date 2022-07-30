package data.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.zappos.com/");
driver.manage().window().maximize();
WebElement signIn = driver.findElement(By.xpath("//a[text()='Sign In / Register']"));
signIn.click();
WebElement login = driver.findElement(By.id("zapposSignIn"));
login.click();
WebElement email= driver.findElement(By.name("email"));
email.sendKeys("kalaiyazhaki@gmail.com");
WebElement pass= driver.findElement(By.name("password"));
pass.sendKeys("Mamallan@1988");
WebElement btnClk = driver.findElement(By.id("signInSubmit"));	
btnClk.click();
}
}
