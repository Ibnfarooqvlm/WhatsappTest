package com.utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class BaseFunctions extends TestBase{

	public void swipe(int startX, int startY, int endX, int endY)
	{
		new TouchAction(driver).press(PointOption.point(startX, startY))
		.waitAction(new WaitOptions().withDuration(Duration.ofMillis(1000)))
		.moveTo(PointOption.point(endX, endY))
		.release().perform();
	}

	public void click(By by, String desc)
	{
		try
		{
			driver.findElement(by).click();
		}catch(Throwable t)
		{
			t.printStackTrace();
		}
	}
	
	public void enterText(By by, String text, String desc)
	{
		try {
			driver.findElement(by).sendKeys(text);
		}catch(Throwable t)
		{
			t.printStackTrace();
		}
	}

	public WebElement waitUntilElementVisible(By by)
	{
		try
		{
			return	new WebDriverWait(driver,10)
					.until(ExpectedConditions.visibilityOfElementLocated(by));
		}catch(Throwable t)
		{
			t.printStackTrace();
		}
		return null;
	}
}