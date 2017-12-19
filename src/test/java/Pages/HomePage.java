package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(xpath=".//*[@id='aa-header']/div[1]/div/div/div/div/div[2]/ul/li[3]/a") WebElement signlink;
	@FindBy(xpath=".//*[@id='aa-header']/div[1]/div/div/div/div/div[2]/ul/li[4]/a") WebElement password;
	
	public void Clickonsignlink()
	{
		signlink.click();
	}
	public void clickonpassword()
	{
		password.click();
	}
	public String getApplicationTitle()
	{
		return driver.getTitle();
	}
}
