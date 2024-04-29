package org.sap.pages;

import org.openqa.selenium.By;
import org.sap.enums.WaitStrategy;

public class GTPLBankLoginPage extends BasePage {

	private final By textBoxUserIdBy = By.xpath("//input[@name='uid']");
	private final By testBoxPasswordBy = By.xpath("//input[@name='password']");
	private final By buttonLoginBy = By.xpath("//input[@name='btnLogin']");

	public GTPLBankLoginPage enterUserName(String username) {
		enterText(textBoxUserIdBy, WaitStrategy.PRESENCE, username, "UserID");
		return this;
	}

	public GTPLBankLoginPage enterUserPassword(String password) {
		enterText(testBoxPasswordBy, WaitStrategy.PRESENCE, password, "Password");
		return this;
	}

	public GTPLBankHomePage clickLoginButton() {
		click(buttonLoginBy, WaitStrategy.CLICKBLE, "Button");
		return new GTPLBankHomePage();
	}
	
	
	public String handleAlert() {
		
	return	getAlertText(WaitStrategy.PRESENCE);
		
	}

}