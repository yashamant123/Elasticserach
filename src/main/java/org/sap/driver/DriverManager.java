package org.sap.driver;

import org.openqa.selenium.WebDriver;

public final class DriverManager {
	private DriverManager() {
		
	}
	public static ThreadLocal<WebDriver> dr=new ThreadLocal<WebDriver>();
	public static WebDriver getDriver() {
		return dr.get();
	}
	public static void setDriver(WebDriver driverReff) {
		dr.set(driverReff);
	}
	public static void unload() {
		dr.remove();
	}
}
