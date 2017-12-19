package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Pages.HomePage;
import Pages.LoginPage;
import factory.BrowserFactory;
import factory.DataProviderFactory;

public class VerifyLoginPageWithReport {
	WebDriver driver;
	ExtentReports report;
	ExtentTest logger;
	 
	@BeforeMethod
	public void Setup()
	{
		report=new ExtentReports(".\\Report\\LoginPageReport.html",true);
		
		logger=report.startTest("verify test ");
		
		driver=BrowserFactory.getbrowser("Chrome");
		driver.get(DataProviderFactory.getConfig().getapplicationUrl());
	 
		logger.log(LogStatus.INFO, "Application is up and running");
		
	}
    
	@Test
	public void testHomePage()
	{
		HomePage home=PageFactory.initElements(driver, HomePage.class);
		
		String title=home.getApplicationTitle();
		
		Assert.assertTrue(title.contains("SNIIKS"));
		
		logger.log(LogStatus.INFO, "Home PAge LOAD");
		
		home.Clickonsignlink();
		
		logger.log(LogStatus.INFO, "click on sign link");
		
	    LoginPage login=PageFactory.initElements(driver,LoginPage.class);
	
	    logger.log(LogStatus.INFO, "Enter to login page");
	    
    	login.loginApplication("shub@gmail.com", "khan");
    	
    	logger.log(LogStatus.PASS, "Enter the Details");
	}
	@AfterMethod
	public void tearDown()
	{
		report.endTest(logger);
		report.flush();
	}
}
