package genericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * This is the utility class which deals with the properties file
 * @author QSP
 * *@version 26-09-04
 */





public class PropertiesUtility {
	
	/**
	 * This is the generic method to fetch data from properties file
	 * @param Key
	 * @return
	 * @throws IOException
	 */
	
	
	
	public String getDataFromProperties(String Key) throws IOException
	{
		FileInputStream fis=new FileInputStream(IPathUtility.propertiesPath);
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty(Key);
		return value;
		
	
	}
	public void writeDataToProperties(String Key,String value,String comment) throws IOException
	{
		FileInputStream fis=new FileInputStream(IPathUtility.propertiesPath);
		Properties prop=new Properties();
		prop.load(fis);
		prop.setProperty(Key, value);
		FileOutputStream fos=new FileOutputStream(IPathUtility.propertiesPath);
		prop.store(fos,comment);
		
		
		
		
	}

}
