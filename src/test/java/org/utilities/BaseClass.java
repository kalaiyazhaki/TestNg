package org.utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File; 
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static TakesScreenshot tk;
	public static Select s;
	public static Date d;

	
	
	//1.Launch Browser
	public static void launchChrome() {
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
	}
	
	//2.URL
	public static void loadUrl(String url ) {
driver.get(url);
	}
	
	//3.maximize
	public static void winMax() {
driver.manage().window().maximize();
	}
	
	//4.title
	public static String printTitle() {
 String title = driver.getTitle();
 return title;
	}
	//another way for title
	public static void toPrintTitle() {
		System.out.println(driver.getTitle());
			}
			
	//5.currentUrl
public static void printcurrentUrl() {
System.out.println(driver.getCurrentUrl());
	}
//another way for currenturl
	public static String toPrinturl() {
		 String url = driver.getCurrentUrl();
		 return url;
			}
	
  //6.sendKeys
public static void fill(WebElement ele, String value) {
	ele.sendKeys(value);
	}

  //7.click
public static void btnClick(WebElement ele) {
ele.click();
}

  //8.close
public static void tabClose() {
	driver.close();
}

  //9.quit
public static void entireBrowser() {
driver.quit();
}

  //10.getText
public static void printText(WebElement ele) {
System.out.println(ele.getText());
}
//another way for getText
public static String toPrintText(WebElement ele) {
	String text = ele.getText();
	return text;
}

  //11.getAttribute
public static void printValue(WebElement ele, String value) {
	String text = ele.getAttribute(value);
System.out.println(text);
}

//another way for getAttribute
public static String toPrintValue(WebElement ele, String value) {
	String text = ele.getAttribute(value);
	return text;
}

 //12.moveToElement
public static void mouseTo(WebElement ele) {
a=new Actions(driver);
a.moveToElement(ele).perform();
}

 //13.dragAndDrop
public static void dragTo(WebElement src, WebElement des) {
	a=new Actions(driver);
	a.dragAndDrop(src, des).perform();
	}

 //14.doubleClick
public static void twiceClick(WebElement ele) {
a=new Actions(driver);
a.doubleClick(ele).perform();
}

 //15.context click
public static void rightClick(WebElement ele) {
a=new Actions(driver);
a.contextClick(ele).perform();
}

 //16.shift
public static void shiftBtn() {
a=new Actions(driver);
a.keyDown(Keys.SHIFT).perform();
a.keyUp(Keys.SHIFT).perform();
}

 //17.escape
public static void escapeBtn() {
a=new Actions(driver);
a.keyDown(Keys.ESCAPE).perform();
a.keyUp(Keys.ESCAPE).perform();
}

 //18.Thread.sleep
public static  void maxiWait(int sec) throws InterruptedException {
Thread.sleep(sec);
}

//19.moveToElement and click
public static void cusorTo(WebElement ele) {
a=new Actions(driver);
a.moveToElement(ele).click().build().perform();
}

 //20.sendKeys
public static void fillUser(WebElement ele, String value) {
a=new Actions(driver);
a.sendKeys(ele, "value");
}

 //21.click
public static void btnClick() {
a=new Actions(driver);
a.click().perform();
}

 //22.enter
public static void enterBt() throws AWTException {
r=new Robot();
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
}

 //23.down
public static void DownArrow() throws AWTException {
r=new Robot();
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
}

//anotherway open link in new window
public static  void newWindow() throws AWTException {
	r=new Robot();
	for (int i = 0; i < 2; i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);	
	}
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
}
 //24.tab
public static void tab() throws AWTException {
r=new Robot();
r.keyPress(KeyEvent.VK_TAB);
r.keyRelease(KeyEvent.VK_TAB);
}

 //25.up
public static void upArrow() throws AWTException {
r=new Robot();
r.keyPress(KeyEvent.VK_UP);
r.keyRelease(KeyEvent.VK_UP);
}

 //26.ctrl+c
public static void copyBtn() throws AWTException {
r=new Robot();
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_C);
r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_C);
}

 //27.ctrl+v
public static void PasteBtn() throws AWTException {
	r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
}

 //28.getscreenshotAs
public static void screenSnap(String name) throws IOException {
	tk=(TakesScreenshot)driver;
	File src = tk.getScreenshotAs(OutputType.FILE);
	File des=new File("name");
	FileUtils.copyFile(src, des);
	
}

 //29.getWindowHandle
public static void singleWindow() {
String handle = driver.getWindowHandle();
System.out.println(handle);
}

 //30.getWindowHandles
public static void allWindows() {
Set<String> eachId = driver.getWindowHandles();
System.out.println(eachId);
} 

//another way of windowHandles
public static void winHand() {
String parentId = driver.getWindowHandle();
Set<String> allWindowId = driver.getWindowHandles();
for (String eachId : allWindowId) {
	if (!parentId.equals(eachId)) {
		driver.switchTo().window(eachId);
	}
}
} 
 //31.accept
public static void confirm() {
Alert a1 = driver.switchTo().alert();
a1.accept();
}

 //32.dismiss
public static void cancel() {
Alert a1 = driver.switchTo().alert();
a1.dismiss();
}

 //33.sendKeys
public static void userFill(String value) {
Alert a1 = driver.switchTo().alert();
a1.sendKeys(value);
}

 //34.getText
public static void alertText() {
Alert a1 = driver.switchTo().alert();
String text = a1.getText();
System.out.println(text);
}

 //35.delete
public static void deleteBtn() {
a=new Actions(driver);
a.keyDown(Keys.DELETE).perform();
a.keyUp(Keys.DELETE).perform();
}

 //36.space
public static void spaceBtn() {
a=new Actions(driver);
a.keyDown(Keys.SPACE).perform();
a.keyUp(Keys.SPACE).perform();
}

//37.capslock
public static void capsBtn() throws AWTException {
r=new Robot();
r.keyPress(KeyEvent.VK_CAPS_LOCK);
r.keyRelease(KeyEvent.VK_CAPS_LOCK);
}

//38.cut
public static void cutTo() throws AWTException {
r=new Robot();
r.keyPress(KeyEvent.VK_CUT);
r.keyRelease(KeyEvent.VK_CUT);
}

//39.greater
public static void largerThan() throws AWTException {
r=new Robot();
r.keyPress(KeyEvent.VK_GREATER);
r.keyRelease(KeyEvent.VK_GREATER);
}

//40.ctrl+a=selectAll
public static void selectAll() throws AWTException {
r=new Robot();
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_A);
r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_A);
}

//41.arrowRight
public static void rightArrow() {
a=new Actions(driver);
a.keyDown(Keys.ARROW_RIGHT).perform();
a.keyUp(Keys.ARROW_RIGHT).perform();
}

//42.arrowLeft
public static void leftArrow() {
a=new Actions(driver);
a.keyDown(Keys.ARROW_LEFT).perform();
a.keyUp(Keys.ARROW_LEFT).perform();
}
//43.getAttributename
public static void printName(WebElement ele, String name) {
	String text = ele.getAttribute(name);
System.out.println(text);
}

//another way for getAttributename
public static String toPrintName(WebElement ele, String value) {
	String text = ele.getAttribute(value);
	return text;
}

//44.select by index
public static void selectIndex(WebElement ele,int index) {
s=new Select(ele);
s.selectByIndex(index);
}

//45.select by value
public static void selectValue(WebElement ele,String value) {
s=new Select(ele);
s.selectByValue(value);
}

//46.select by visibleText
public static void selectText(WebElement ele,String text) {
s=new Select(ele);
s.selectByVisibleText(text);
}

//47.is multiple
public static void multiple(WebElement ele) {
s=new Select(ele);
boolean b = s.isMultiple();
System.out.println(b);
}

//48.deselect by visibleText
public static void deselectText(WebElement ele,String text) {
s=new Select(ele);
s.deselectByVisibleText(text);
}

//49.deselect by index
public static void deselectIndex(WebElement ele,int index) {
s=new Select(ele);
s.deselectByIndex(index);
}

//50.select by value
public static void deselectValue(WebElement ele,String value) {
s=new Select(ele);
s.deselectByValue(value);
}

//51.selectall
public static void deselect(WebElement ele,String value) {
s=new Select(ele);
s.deselectAll();
}

//52.getOptions
public static void options(WebElement ele) {
s=new Select(ele);
 s.getOptions();
}

//53.getallselectedoptions
public static void allSelected(WebElement ele) {
s=new Select(ele);
s.getAllSelectedOptions();
}

//54.getfirstselectedoption
public static void firstSelected(WebElement ele) {
s=new Select(ele);
s.getFirstSelectedOption();
}


//Read the value from excel
public static String getData(int rowNumber,int cellNumber) throws IOException {
	//Declare the location of ur excel sheet
			File f=new File("C:\\Users\\Admin\\eclipse-workspacekalai\\Framework8amBatch\\target\\testData\\Excel data 1.xlsx");
			
			//To read the file
			FileInputStream fin=new FileInputStream(f);
			
			//Type of workbook
			Workbook w=new XSSFWorkbook(fin);
																							
			//get the sheet from workbook
			Sheet s = w.getSheet("greens");
	Row row = s.getRow(rowNumber);
	Cell cell = row.getCell(cellNumber);
	int cellType = cell.getCellType();
	String value="";
	if (cellType==1) {
		value=cell.getStringCellValue();
	}else if (DateUtil.isCellDateFormatted(cell)) {
		Date d = cell.getDateCellValue();
		SimpleDateFormat sim=new SimpleDateFormat("dd MMM YYYY Z");
		value = sim.format(d);
	}else {
		double d = cell.getNumericCellValue();
		long l=(long) d;
		value = String.valueOf(l);
	}
	return value;
}

//Date Class
public static void printDate() {
	d=new Date();
	System.out.println(d);
}



}
