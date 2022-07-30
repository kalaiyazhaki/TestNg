package pom.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class LoginPojo extends BaseClass {

	//1.Non para constructor
public LoginPojo() {
	//2.PageFactory and initElements static method
	PageFactory.initElements(driver,this);
	}
@FindBy(xpath="//a[text()='Sign In / Register']")
private WebElement signIn;
@FindBy(id="zapposSignIn")
private WebElement login;
@FindBy(name="email")
private WebElement email;
@FindBy(name="password")
private WebElement pass;
@FindBy(id="signInSubmit")
private WebElement btnClk;
@FindBy(xpath="(//a[@href='/womens'])[1]")
private WebElement women;
@FindBy(xpath="(//a[text()='Sandals'])[2]")
private WebElement product;
@FindBy(xpath="(//a[text()='Birkenstock - Soley by Papillio. Color Black Leather 2.'])[1]")
private WebElement item;
@FindBy(xpath="//span[text()='140']")
private WebElement price;
@FindBy(xpath="//label[text()='9-9.5']")
private WebElement size;
@FindBy(xpath="(//button[text()='Add to Cart'])[1]")
private WebElement cart;
public WebElement getSignIn() {
	return signIn;
}
public WebElement getLogin() {
	return login;
}
public WebElement getEmail() {
	return email;
}
public WebElement getPass() {
	return pass;
}
public WebElement getBtnClk() {
	return btnClk;
}
public WebElement getWomen() {
	return women;
}
public WebElement getProduct() {
	return product;
}
public WebElement getItem() {
	return item;
}
public WebElement getPrice() {
	return price;
}
public WebElement getSize() {
	return size;
}
public WebElement getCart() {
	return cart;
}
}
