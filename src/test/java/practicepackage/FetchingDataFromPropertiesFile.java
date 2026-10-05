package practicepackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.PropertiesUtility;

public class FetchingDataFromPropertiesFile {
	public static void main(String[] args) throws IOException {
		{
			//FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\testdata.properties");
			//Properties prop=new Properties();
			//prop.load(fis);
			//String URL=prop.getProperty("url");
			//System.out.println(URL);
			//WebDriver driver=new ChromeDriver();
			//driver.get(URL);
			PropertiesUtility pUtil=new PropertiesUtility();
			String URL=pUtil.getDataFromProperties("url");
			System.out.println(URL);
			String userName=pUtil.getDataFromProperties("name");
			System.out.println(userName);
			WebDriver driver=new ChromeDriver();
			driver.get(URL);
			

			
		}
	}

}
