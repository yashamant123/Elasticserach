package org.sap.pages;

import org.openqa.selenium.By;
import org.sap.driver.DriverManager;
import org.sap.enums.WaitStrategy;

public class GTPLNewCustomerPage extends BasePage{




	private final By CustomerNameTextBoxBy = By.xpath("//input[@name='name']");
	private final By RadioMaleBy = By.xpath("(//input[@name='rad1'])[1]");
	private final By RadioFemaleBy = By.xpath("(//input[@name='rad1'])[2]");

	private final By calenderDOBBy = By.xpath("//input[@name='dob']");
	private final By AddressTextBoxBy = By.xpath("//textarea[@name='addr']");
	private final By CityTextBoxBy = By.xpath("//input[@name='city']");
	private final By StateTextBoxBy = By.xpath("//input[@name='state']");
	private final By PinNUmberTextBoxBy = By.xpath("//input[@name='pinno']");
	private final By TelePhoneNUmTextBoxBy = By.xpath("//input[@name='telephoneno']");
	private final By EmailIdTextBoxBy = By.xpath("//input[@name='emailid']");

	private final By SubmitButtonBy = By.xpath("//input[@type='submit']");
	private final By parentIframeBy=By.xpath("//iframe[@id='google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0']");
	private final By childIframeBy=By.xpath("//iframe[@id='ad_iframe']");
	private final By dismissButtonBy=By.id("dismiss-button");





	public GTPLNewCustomerPage enterCustomerName(String customerNameText) {
		enterText(CustomerNameTextBoxBy, WaitStrategy.PRESENCE, customerNameText, "customerName");
		return this;
	}

	public GTPLNewCustomerPage clickRadioBtn(String gender) {


		if(gender.equalsIgnoreCase("male"))
		{
			click(RadioMaleBy, WaitStrategy.CLICKBLE, gender);

		}
		else
		{
			click(RadioFemaleBy, WaitStrategy.CLICKBLE, gender);			
		}		
		return this;
	}


	public GTPLNewCustomerPage enterDOB(String DOB) {
		enterText(calenderDOBBy, WaitStrategy.PRESENCE, DOB, "dateOfBirth");
		return this;
	}
	public GTPLNewCustomerPage enterCustomerAddress(String address) {
		enterText(AddressTextBoxBy, WaitStrategy.PRESENCE, address, "customerAddress");
		return this;
	}
	public GTPLNewCustomerPage enterCustomercity(String city) {
		enterText(CityTextBoxBy, WaitStrategy.PRESENCE, city, "customerCity");
		return this;
	}
	
	public GTPLNewCustomerPage enterCustomerState(String state) {
		enterText(StateTextBoxBy, WaitStrategy.PRESENCE, state, "customerState");
		return this;
	}
	public GTPLNewCustomerPage enterCustomerPinNum(String pinnum) {
		enterText(PinNUmberTextBoxBy, WaitStrategy.PRESENCE, pinnum, "customerPinNUmber");
		return this;
	}
	public GTPLNewCustomerPage enterCustomerTelePhoneNum(String telephonenum) {
		enterText(TelePhoneNUmTextBoxBy, WaitStrategy.PRESENCE, telephonenum, "customerTelePhoneNumber");
		return this;
	}
	public GTPLNewCustomerPage enterCustomerEmailId(String emailid) {
		enterText(EmailIdTextBoxBy, WaitStrategy.PRESENCE, emailid, "customerEmailId");
		return this;
	}
	public GTPLNewCustomerPage clickSubmitButton() {
		click(SubmitButtonBy, WaitStrategy.CLICKBLE,"Submit");
		return this;
	}
	
	public GTPLNewCustomerPage dismissAdds() {
		if(DriverManager.getDriver().findElement(parentIframeBy).isDisplayed()) {
		handlingAdds(parentIframeBy,childIframeBy,dismissButtonBy);
		
		}
		return this;
	}
	
}
