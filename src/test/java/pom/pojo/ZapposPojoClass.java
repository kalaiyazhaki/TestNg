package pom.pojo;

import java.awt.AWTException;
import java.io.IOException;

import org.utilities.BaseClass;

public class ZapposPojoClass extends BaseClass {
public static void main(String[] args) throws IOException, InterruptedException, AWTException {
	launchChrome();
	loadUrl(getData(11, 1));
	winMax();
    toPrintTitle();
	printcurrentUrl();
	
	LoginPojo l=new LoginPojo();
	btnClick(l.getSignIn());
	maxiWait(3000);
	btnClick(l.getLogin());
	fill(l.getEmail(), getData(12, 0));
	fill(l.getPass(), getData(12,1));
	btnClick(l.getBtnClk());
	cusorTo(l.getWomen());
	maxiWait(5000);
	cusorTo(l.getProduct());
	maxiWait(6000);
	rightClick(l.getItem());
	newWindow();
	maxiWait(5000);
	winHand();
	printText(l.getPrice());
	maxiWait(6000);
	cusorTo(l.getSize());
	maxiWait(6000);
	cusorTo(l.getCart());
	maxiWait(5000);
}

}
