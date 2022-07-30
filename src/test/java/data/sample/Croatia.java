package data.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;


public class Croatia extends BaseClass {
public static void main(String[] args) {
	launchChrome();
	loadUrl("https://www.croatiaairlines.com/");
	winMax();
	toPrintTitle();
	printcurrentUrl();
	WebElement from = driver.findElement(By.name("from"));
	fill(from, "PULA (PUY), CROATIA");
	WebElement to = driver.findElement(By.name("to"));
	fill(to, "ZADAR (ZAD), CROATIA");
	WebElement conti = driver.findElement(By.name("continueFlightSearch"));
    btnClick(conti);
   //WebElement search= driver.findElement(By.name("continueFlightSearch"));	
   //btnClick(search);
  // WebElement flight = driver.findElement(By.id("flightType"));
   //cusorTo(flight);
   //WebElement trip = driver.findElement(By.xpath("(//li[text()='one-way'])[1]"));
   //cusorTo(trip);
   WebElement departure = driver.findElement(By.id("daterangeFrom"));
   btnClick(departure);
   WebElement day = driver.findElement(By.xpath("(//td[@data-title='r3c2'])[1]"));
   cusorTo(day);
   WebElement ret = driver.findElement(By.id("daterangeTo"));
   btnClick(ret);
   WebElement date = driver.findElement(By.xpath("(//td[@data-title='r3c5'])[1]"));
   cusorTo(date);
   WebElement passenger = driver.findElement(By.id("passengersId"));
   cusorTo(passenger);
   WebElement adult = driver.findElement(By.xpath("(//button[text()='+'])[1]"));
   cusorTo(adult);
   WebElement infant = driver.findElement(By.xpath("(//button[text()='+'])[2]"));
   cusorTo(infant);
   WebElement cont = driver.findElement(By.id("btnPassengers"));
   btnClick(cont);
   WebElement btnSearch = driver.findElement(By.id("submitSearchFlight"));
   btnClick(btnSearch);
}
}
