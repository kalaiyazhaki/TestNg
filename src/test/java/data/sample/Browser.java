package data.sample;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	//How to remove the "chrome is being controlled by automated test software" message?
	ChromeOptions options=new ChromeOptions();
	List<String> eSwitches=new ArrayList<String>();
	eSwitches.add("enable-automation");
	options.setExperimentalOption("excludeSwitches", eSwitches); //use this(list<string>) or use below line
	//options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
	WebDriver driver=new ChromeDriver(options);
//driver.get("https://www.zappos.com/");
driver.get("https://www.goshop.com.my/");
driver.manage().window().maximize();
//driver.navigate().refresh();
}
}
