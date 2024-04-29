package org.sap.tests;

import java.util.Map;

import org.sap.annotations.FrameWorkAnnotation;
import org.sap.enums.AuthorNames;
import org.sap.enums.CategoryType;
import org.sap.pages.BasePage;
import org.sap.pages.GTPLBankLoginPage;
import org.sap.pages.GTPLNewCustomerPage;
import org.testng.annotations.Test;

public class GuruNewCustomerTest extends BaseTest{
	
	
	@FrameWorkAnnotation(category = {CategoryType.REGRESSION}, autherName = { AuthorNames.TIRUMALA })
	@Test
	public void AddNewCustomer(Map<String,String>data)
	{
		GTPLBankLoginPage gblp=new GTPLBankLoginPage();
		GTPLNewCustomerPage gbcp=
		gblp.enterUserName(data.get("username")).enterUserPassword(data.get("passowrd")).clickLoginButton().clickNewCustomerLink().dismissAdds();
		
		gbcp.enterCustomerName(data.get("CustomerName")).clickRadioBtn(data.get("gender")).enterDOB("05052000").enterCustomerAddress(data.get("Address")).enterCustomercity(data.get("City"))
		.enterCustomerState(data.get("State")).enterCustomerPinNum(data.get("PinNum")).enterCustomerTelePhoneNum(data.get("TelephoneNum"))
		.enterCustomerEmailId(data.get("EmailId")).clickSubmitButton();
		
		
		
		
	}

}
