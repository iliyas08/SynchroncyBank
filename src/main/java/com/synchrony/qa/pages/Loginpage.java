package com.synchrony.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.synchrony.qa.base.TestBase;

public class Loginpage extends TestBase{

	// Page Factory -OR
	
	@FindBy(id="openaccount")
	WebElement Openanaccount;
	
	
	@FindBy(id="banklogo")
	WebElement SYFlogo;
	
	//Initializing the pge objects
	public Loginpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateloginpage()
	{
		return driver.getTitle();
	}
	
	
	public boolean syflog()
	{
		return SYFlogo.isDisplayed();
	}
	
	
	
	
	
	
	
	
	
}
