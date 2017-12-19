package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.HomePage;
import factory.BrowserFactory;
import factory.DataProviderFactory;

public class VerifyHomePage {

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
		System.out.println("My APllication title is" +title);
		
		Assert.assertTrue(title.contains("SNIIKS"));
	}
	
}
