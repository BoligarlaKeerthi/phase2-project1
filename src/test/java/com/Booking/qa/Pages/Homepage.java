package com.Booking.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Booking.qa.Base.BaseTest;

public class Homepage extends BaseTest {
	Actions a = new Actions(driver);
	@FindBy(xpath = "//div[text()='Login']")
	WebElement login;
	@FindBy(xpath = "//li[text()='Sign In/Sign Up']")
	WebElement signin;
	
    @FindBy(xpath="//div[@class='search-lbl']")
    WebElement search;
    @FindBy(xpath="//div[@class='main-wrapper search-box-wrapper']/descendant::input[1]")
    WebElement source;
    @FindBy(xpath="//div[@class='main-wrapper search-box-wrapper']/descendant::input[2]")
    WebElement destination;
    @FindBy(xpath="//div[@id='date-box']")
    WebElement date;
    @FindBy(xpath="//span[@class=\"DayTiles__CalendarDaysSpan-sc-14em0t0-1 fxWHuy\"]")
    WebElement datepic;
public Homepage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}

	
	
	public void gettitle()
	{
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	
	// method name is similar to action to be done
	
	
	public void clickonLogin()
	{
		login.click();
	}
	
	public void clickonsignin()
	{
		signin.click();
	}
	
	public void search()
	{
		search.click();
	}
	public void source()
	{
		source.sendKeys("Paris");
	}
	public void destination()
	{
		destination.sendKeys("London");
	}
	public void date()
	{
		date.click();
	}
	public void datepic()
	{
		datepic.click();
	}

}
