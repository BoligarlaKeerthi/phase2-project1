package com.Booking.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	@FindBy(xpath="//div[@class='main-wrapper search-box-wrapper']/descendant::input[1]")
    WebElement source;
	
    @FindBy(xpath="//div[@class='main-wrapper search-box-wrapper']/descendant::input[2]")
    WebElement destination;
   
    @FindBy(xpath="//div[@id='date-box']")
    WebElement date;
    @FindBy(xpath="//*[@class='main-wrapper search-box-wrapper']/descendant::div[16]")
    
    WebElement datepic;

    @FindBy(xpath="//div[@class='search-lbl']")
    WebElement search;
    
  
 public SearchPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
   
   public void clicksearch()
   {
	   source.sendKeys("paris");
	   
	   
	   destination.sendKeys("London, United Kingdom");
	  
	   date.click();
	   datepic.click();
	   search.click();
	 
   }
}	
  


