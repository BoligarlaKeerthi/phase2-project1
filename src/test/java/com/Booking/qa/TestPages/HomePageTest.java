package com.Booking.qa.TestPages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Booking.qa.Base.BaseTest;
import com.Booking.qa.Pages.Homepage;



	public class HomePageTest extends BaseTest{
		
		Homepage hp;
		
		@BeforeMethod
		public void OpenApp()
		{
			openBrowser();
			hp = new Homepage(driver);
		}
		
		
		@AfterMethod
		public void CloseApp()
		{
			driver.quit();
		}
		
		@Test(priority='1')
		public void testTitle()
		{
			hp.gettitle();
		}
		

		@Test(priority='2')
		public void logintest()
		{
			hp.clickonLogin();  
			hp.clickonsignin();  
			hp.gettitle();  // get title
		}

		@Test(priority='3')
		public void testdetails() throws InterruptedException
		{
			hp.source();  
			hp.destination();
			hp.date();
			hp.datepic();
			hp.search();
			Thread.sleep(3000);
			hp.gettitle();
	
		}
		
		
		

}
