package com.pages;

import org.openqa.selenium.By;

import com.utilities.BaseFunctions;

import io.appium.java_client.MobileBy;

public class ChatPage extends BaseFunctions {

	By byChatPersonName = MobileBy.id("com.whatsapp:id/conversation_contact_name");
	By byMessageField = MobileBy.id("com.whatsapp:id/entry");
	By bySendButton = MobileBy.AccessibilityId("Send");
	
	public void waitUntilHeaderVisible()
	{
		try {
			waitUntilElementVisible(byChatPersonName);
		}catch(Throwable t) {
			t.printStackTrace();
		}
	}
	
	public void enterMessage(String message)
	{
		try {
			enterText(byMessageField, message, "Chat Message");
		}catch(Throwable t) {
			t.printStackTrace();
		}
	}
	
	public void clickSendButton()
	{
		try {
			driver.findElement(bySendButton).click();
		}catch(Throwable t) {
			t.printStackTrace();
		}
	}
}
