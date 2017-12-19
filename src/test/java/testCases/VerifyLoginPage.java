package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import factory.BrowserFactory;
import factory.DataProviderFactory;

public class VerifyLoginPage {
	WebDriver driver;
	 
	@BeforeMethod
	public void Setup()
	{
		driver=BrowserFactory.getbrowser("Chrome");
		driver.get(DataProviderFactory.getConfig().getapplicationUrl());
	}
    
	@Test
	public void testHomePage()
	{
		HomePage home=PageFactory.initElements(driver, HomePage.class);
		
		String title=home.getApplicationTitle();
		
		Assert.assertTrue(title.contains("SNIIKS"));
		
		home.Clickonsignlink();
		
	    LoginPage login=PageFactory.initElements(driver,LoginPage.class);
	
    	login.loginApplication("shub@gmail.com", "khan");
	}
	
}
