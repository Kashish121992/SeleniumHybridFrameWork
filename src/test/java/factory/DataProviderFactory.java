package factory;

import dataProvider.ConfigDataprovider;

public class DataProviderFactory {

	public static ConfigDataprovider getConfig()
	{
		ConfigDataprovider config=new ConfigDataprovider();
		 return config;
	}
	
	/*public static ConfigDataprovider getConfig()
	{
		ConfigDataprovider config=new ConfigDataprovider();
		 return config;
	}*/
	
}
