package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Orangepom {

	@FindBy(xpath = "//input[@id='txtUsername']")
	private WebElement username;
	@FindBy(xpath = "//input[@id='txtPassword']")
	private WebElement password;
	@FindBy(xpath = "//input[@id='btnLogin']")
	private WebElement loginbtn;
	public WebElement getUsername() {
		return username;
	}
	public void setUsername(WebElement username) {
		this.username = username;
	}
	public WebElement getPassword() {
		return password;
	}
	public void setPassword(WebElement password) {
		this.password = password;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	public void setLoginbtn(WebElement loginbtn) {
		this.loginbtn = loginbtn;
	}
	

}
