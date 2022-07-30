package org.junitsupp;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.utilities.BaseClass;

public class Facebook extends BaseClass{
@BeforeClass
public static void bfCls() {
System.out.println("Before class started\n=======");
printDate();
}
@AfterClass
public static void aftCls() {
System.out.println("\n=======After class ends");
printDate();
}
@Before
public void bf() {
System.out.println("Before started\n=======");
launchChrome();
winMax();
}
@After
public void aft() {
System.out.println("After ends\n========");
tabClose();
}

@Test
public void tc1() {
System.out.println("Test 1");	
loadUrl("https://www.facebook.com/");
printTitle();
printcurrentUrl();
}
@Test
public void tc2() {
System.out.println("Test 2");
loadUrl("https://www.redbus.in/");
printTitle();
printcurrentUrl();
}
@Ignore
@Test
public void tc3() {
System.out.println("Test 3");
}
}
