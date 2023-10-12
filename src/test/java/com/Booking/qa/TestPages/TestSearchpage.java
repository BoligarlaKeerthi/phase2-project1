package com.Booking.qa.TestPages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Booking.qa.Base.BaseTest;
import com.Booking.qa.Pages.SearchPage;


public class TestSearchpage extends BaseTest {
	
	SearchPage sp;
	@BeforeMethod
	public void OpenApp()
	{
		openBrowser();
		sp = new SearchPage(driver);
	}
	
	
	@AfterMethod
	public void CloseApp()
	{
		driver.quit();
	}
	
	@Test
	public void searchPages() throws InterruptedException
	{
		sp.clicksearch();
		Thread.sleep(1000);
		
	}
	
	
	
	
	
}


