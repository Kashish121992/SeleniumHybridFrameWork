package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
  WebDriver driver;
  
	public LoginPage(WebDriver driver)
	
	{
		this.driver=driver;
	}
	
	@FindBy(xpath=".//*[@id='username']") WebElement username;
	@FindBy(xpath=".//*[@id='password']") WebElement password;
	//@FindBy(xpath=".//*[@id='myform']/button") WebElement login;
	
	
	public void loginApplication(String user, String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
		//login.click();
	}


	
		
	
}
