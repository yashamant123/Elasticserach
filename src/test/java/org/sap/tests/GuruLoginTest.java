package org.sap.tests;

import java.util.Map;

import org.assertj.core.api.Assertions;
import org.sap.annotations.FrameWorkAnnotation;
import org.sap.enums.AuthorNames;
import org.sap.enums.CategoryType;
import org.sap.pages.GTPLBankLoginPage;
import org.testng.annotations.Test;

import com.sap.utils.DecodeUtils;

public class GuruLoginTest extends BaseTest{
	private GuruLoginTest() {}
	@FrameWorkAnnotation(category = {CategoryType.REGRESSION}, autherName = { AuthorNames.VASANTH })
	@Test
	public void loginValidCredentials(Map<String,String>data) {
		GTPLBankLoginPage gblp=new GTPLBankLoginPage();
	//	String actualTitle=gblp.enterUserName(data.get("username")).enterUserPassword(DecodeUtils.getDecoderString(data.get("passowrd"))).clickButton().getTitle();
		String actualTitle=gblp.enterUserName(data.get("username")).enterUserPassword(data.get("passowrd")).clickLoginButton().getTitle();
		Assertions.assertThat(actualTitle)
		.isNotBlank()
		.isNotEmpty()
		.isEqualToIgnoringCase("GTPL Bank Manager HomePage")
		.containsIgnoringCase("GTPL");
	}
	
	@FrameWorkAnnotation(category = {CategoryType.REGRESSION}, autherName = { AuthorNames.JAYESH })
	@Test
	public void loginInvalidCredentials(Map<String,String>data) {
		GTPLBankLoginPage gblp=new GTPLBankLoginPage();
	//	String actualTitle=gblp.enterUserName(data.get("username")).enterUserPassword(DecodeUtils.getDecoderString(data.get("passowrd"))).clickButton().getTitle();
		
		
		gblp.enterUserName(data.get("username")).enterUserPassword(data.get("passowrd")).clickLoginButton();
		
		
		
		String actualAlertMessage=gblp.handleAlert();
		Assertions.assertThat(actualAlertMessage)
		.isNotBlank()
		.isNotEmpty()
		.isEqualToIgnoringCase("User is not valid");
	}
}