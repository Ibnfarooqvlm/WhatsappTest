package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utilities.BaseFunctions;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class MainPage extends BaseFunctions {

	By byPageHeader = MobileBy.xpath("//android.widget.TextView[@text='WhatsApp']");
	By bySearchIcon = MobileBy.AccessibilityId("Search");
	By bySearchField = MobileBy.id("com.whatsapp:id/search_src_text");
	By byListItems = MobileBy.id("com.whatsapp:id/contact_row_container");
	
	public boolean waitUntilHeaderVisible()
	{
		if(waitUntilElementVisible(byPageHeader) == null)
			return false;
		else
			return true;
	}
	
	public void clickSearchIcon()
	{
		try
		{
			click(bySearchIcon,"Search Icon");
		}catch(Throwable t)
		{
			t.printStackTrace();
		}
	}
	
	public void enterSearch(String search)
	{
		try
		{
			enterText(bySearchField,search,"Search Field");
		}catch(Throwable t)
		{
			t.printStackTrace();
		}
	}
	
	public void clickSearchResult(int index)
	{
		try
		{
			List<MobileElement> list = driver.findElements(byListItems);
			list.get(index).click();
		}catch(Throwable t)
		{
			t.printStackTrace();
		}
	}
}

