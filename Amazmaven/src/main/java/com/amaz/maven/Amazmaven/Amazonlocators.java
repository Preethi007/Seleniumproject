package com.amaz.maven.Amazmaven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.base.Amazonbase;

public class Amazonlocators extends Amazonbase
{
	@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
	private WebElement textUsername;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")
	private WebElement textUserPass;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")
	private WebElement BtnLoginButton;
   @FindBy (xpath="//*[@id='container']/div/div[2]/div/ul/li[1]/span")
   private WebElement nav1;
   @FindBy (xpath = "//a[@title='Mi']")
   private WebElement nav2;
   @FindBy (xpath ="//img[contains(@src,'mi-redmi-8-mzb8253')]")
   private WebElement nav3;
   @FindBy (xpath="//li[@class='_4f8Q22 _2y_FdK']//div[1]//div[2]")
   private WebElement nav4;
 //li/div/div[@class='_3wR-Kp]'//div//div//div
   @FindBy (xpath= "//*[@id='player_uid_946988294_1']/div[4]/button")
   private WebElement nav5;
public WebElement getNav1() {
	return nav1;
}
public void setNav1(WebElement nav1) {
	this.nav1 = nav1;
}
public WebElement getNav2() {
	return nav2;	
}
public void setNav2(WebElement nav2) {
	this.nav2 = nav2;
}
public WebElement getNav3() {
	return nav3;
}
public void setNav3(WebElement nav3) {
	this.nav3 = nav3;
}
public WebElement getNav4() {
	return nav4;
}
public void setNav4(WebElement nav4) {
	this.nav4 = nav4;
}

public String getTextUsername() {
	return textUsername.getAttribute("value");
}
public void setTextUsername(String string) {
	this.textUsername.sendKeys(string);
}
public String getTextUserPass() {
	return textUserPass.getAttribute("value");
}
public void setTextUserPass(String str) {
	this.textUserPass.sendKeys(str);
}
public WebElement getBtnLoginButton() {
	return BtnLoginButton;
}
public void setBtnLoginButton(WebElement btnLoginButton) {
	this.BtnLoginButton=btnLoginButton;
}
public Amazonlocators(){
	PageFactory.initElements(driver,this);
    }
public WebElement getNav5() {
	return nav5;
}
public void setNav5(WebElement nav5) {
	this.nav5 = nav5;
}


}
