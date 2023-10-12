package com.Booking.qa.TestPages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Booking.qa.Base.BaseTest;
import com.Booking.qa.Pages.SigninPage;


public class TestsigninPage extends BaseTest {
	
	SigninPage sp;
	@BeforeMethod
	public void OpenApp()
	{
		openBrowser();
		sp = new SigninPage(driver);
		
	}
	
	
	@AfterMethod
	public void CloseApp()
	{
		driver.quit();
	}
	
	@Test
	public void testaccount() throws InterruptedException
	{
		
		sp.accountcreation();
		Thread.sleep(1000);
		
	}
	
	
	
	
}


