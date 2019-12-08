package com.testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.ChatPage;
import com.pages.MainPage;
import com.utilities.BaseFunctions;

public class MainPageTestCases extends BaseFunctions {

	@BeforeMethod
	public void beforeMethod()
	{
		initializeDriver();
	}
	
	@Test
	public void sendMessage()
	{
		MainPage mainPage = new MainPage();
		ChatPage chatPage = new ChatPage();
		try {
			mainPage.waitUntilHeaderVisible();
			mainPage.clickSearchIcon();
			mainPage.enterSearch("Jahan Wife");
			mainPage.clickSearchResult(0);
			
			chatPage.waitUntilHeaderVisible();
			chatPage.enterMessage("Hi Darling! How are you?");
			chatPage.clickSendButton();
		}catch(Throwable t)
		{
			t.printStackTrace();
		}
	}
}
