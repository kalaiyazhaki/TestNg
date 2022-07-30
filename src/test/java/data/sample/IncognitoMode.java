package data.sample;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IncognitoMode {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeOptions options =new ChromeOptions();
	List<String> eSwitches=new ArrayList<String>();
	eSwitches.add("enable-automation");
	options.setExperimentalOption("excludeSwitches", eSwitches);
	options.addArguments("-incognito");
	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setCapability(ChromeOptions.CAPABILITY, options);
	WebDriver driver=new ChromeDriver(options);
	driver.get("https://www.zappos.com/");
			
}
}
