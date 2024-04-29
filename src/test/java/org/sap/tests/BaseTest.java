package org.sap.tests;

import java.util.Map;

import org.sap.driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	protected BaseTest() {
		
	}
	@SuppressWarnings("unchecked")
	@BeforeMethod
	protected void setUp(Object[] data)  {
		Map<String, String> map = (Map<String,String>)data[0];
		Driver.initDriver(map.get("browser"));


	}

	@AfterMethod
	protected void tearDown() {
		Driver.quitDriver();
	}



}
