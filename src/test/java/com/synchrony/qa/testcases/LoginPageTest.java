package com.synchrony.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.synchrony.qa.base.TestBase;
import com.synchrony.qa.pages.Loginpage;



public class LoginPageTest extends TestBase {
	Loginpage loginpage;
	
	
	public LoginPageTest()
	{
		super();
	}
		
		@BeforeMethod()
		public void setUp()
		{
			initalization();
			loginpage=new Loginpage();
		}

		@Test()
		 public void loginPageTitleTest()
		{
			String Title=loginpage.validateloginpage();
			Assert.assertEquals(Title, "Synchrony Bank - Login");			
		 
		}
		
		
//		@AfterMethod()
//		public void teardown()
//		{
//			driver.quit();
//		}
}
