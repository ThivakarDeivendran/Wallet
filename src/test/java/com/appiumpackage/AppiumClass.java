package com.appiumpackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class AppiumClass {
	
	public static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities virtual = new DesiredCapabilities();
		virtual.setCapability("platformName", "Android");
		virtual.setCapability("platformVersion", "9 PKQ1.180904.001");
		virtual.setCapability("udid", "874adccf");
		virtual.setCapability("deviceName", "Thiva12");
		virtual.setCapability("appPackage", "com.google.android.calculator");
		virtual.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver(url,virtual);
	}

}
