package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;



public class TestGrid {
	
	@Test
	public void test1() throws MalformedURLException
	{
		DesiredCapabilities cap=new DesiredCapabilities().chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		URL url=new URL("http://192.168.1.36:5555/wd/hub");
		WebDriver driver=new RemoteWebDriver(url, cap);
		driver.get("https://www.sniiks.com");
	}
}
