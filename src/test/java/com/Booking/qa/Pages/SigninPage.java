package com.Booking.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {
	@FindBy(xpath = "//div[text()='Login']")
	WebElement login;
	@FindBy(xpath = "//li[text()='Sign In/Sign Up']")
	WebElement signin;
	
	
public SigninPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}

public void accountcreation() throws InterruptedException
{
	login.click();
	signin.click();
	
	Thread.sleep(1000);
	
	
}

}