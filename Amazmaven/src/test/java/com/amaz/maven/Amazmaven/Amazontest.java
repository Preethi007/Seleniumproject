package com.amaz.maven.Amazmaven;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.interactions.Actions;

import com.amazon.base.Amazonbase;


public class Amazontest extends Amazonbase{
static Amazonbase b;
static Amazonlocators c;
static Actions a;

@BeforeClass
public static void before(){
	driver = Amazonbase.getdriver("Chrome");
}
@Test
public void test() throws InterruptedException{
	c= new Amazonlocators();
	a = new Actions (driver);
	c.setTextUsername("aswinravi5@gmail.com");
	Thread.sleep(3000);
//	c.setTextUsername("rekha@gmail.com");
//    Assert.assertEquals("rekha@gmail.com",c.getTextUsername());
	c.setTextUserPass("Aswin@123");
//	Assert.assertEquals("rekha@123",c.getTextUserPass());
	c.getBtnLoginButton().click();
	Thread.sleep(3000);
	a.moveToElement(c.getNav1()).perform();
	Thread.sleep(3000);
    a.moveToElement(c.getNav2()).perform();
	Thread.sleep(3000);
	c.getNav2().click();
	Thread.sleep(3000);
	a.moveToElement(c.getNav3()).perform();
	Thread.sleep(3000);
	c.getNav3().click();
	Thread.sleep(3000);
	a.moveToElement(c.getNav4()).perform();
	Thread.sleep(3000);
	a.moveToElement(c.getNav5()).perform();
	Thread.sleep(3000);
	c.getNav5().click();

	}
@AfterClass
public static void after()
{
//  driver.close();
}
}