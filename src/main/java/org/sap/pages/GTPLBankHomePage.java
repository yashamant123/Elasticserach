package org.sap.pages;

import org.openqa.selenium.By;
import org.sap.enums.WaitStrategy;

public class GTPLBankHomePage extends BasePage {

	 private final By linkLogout=By.linkText("Log out");
	 private final By NewCustomerLinkBy = By.linkText("New Customer");
	 
	 
		 
	 public GTPLBankLoginPage clickLogoutLink() {
		 click(linkLogout, WaitStrategy.PRESENCE, "Logoutlink");
		 return new GTPLBankLoginPage();
	 }
	 
	 public GTPLNewCustomerPage clickNewCustomerLink() {
		 click(NewCustomerLinkBy, WaitStrategy.PRESENCE, "NewCustomerlink");
		 return  new GTPLNewCustomerPage();
	 }
	 
		public String getTitle() {
			return getPageTitle();

		}
		

}
