package com.utilities;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TestBase {

	public static AndroidDriver<MobileElement> driver = null;
	public void initializeDriver()
	{
		try
		{
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("deviceName", "My Phone");
			caps.setCapability("udid", "677010300305"); //Give Device ID of your mobile phone
			caps.setCapability("platformName", "Android");
			caps.setCapability("platformVersion", "9.0");
			caps.setCapability("appPackage", "com.whatsapp");
			caps.setCapability("appActivity", "com.whatsapp.Main");
			caps.setCapability("noReset", "true");
			
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),caps);
		}catch(Throwable t)
		{
			t.printStackTrace();
		}
	}
}
