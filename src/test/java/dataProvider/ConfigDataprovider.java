package dataProvider;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

@Test
public class ConfigDataprovider {
	Properties pro;
	public ConfigDataprovider()
	{
		File src=new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(src);
	        pro=new Properties();
	        pro.load(fis);
			
		
		} catch (Exception e) {
			System.out.println("Any Thing go Wrong"+e.getMessage());
		}
	}
	
	  public String getChromePath()
	  {
		  String url=pro.getProperty("ChromePath");
		  return url;
	  }
  
	  public String getIEPath()
	  {
		  String url=pro.getProperty("IEPath");
		  return url;
	  }
	  
	  public String getapplicationUrl()
	  {
		  String url=pro.getProperty("url");
		  return url;
	  }
	  
}
