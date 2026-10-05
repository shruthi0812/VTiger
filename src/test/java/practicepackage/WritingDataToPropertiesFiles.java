package practicepackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import genericUtility.PropertiesUtility;

public class WritingDataToPropertiesFiles {
	public static void main(String[] args) throws IOException {
	//	FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\testdata.properties");
	//	Properties prop=new Properties();
	//	prop.load(fis);
	//	prop.setProperty("email","robin@gmail.com");
		// System.out.println(prop);
		//FileOutputStream fos=new FileOutputStream("C:\\Users\\Admin\\Desktop\\testdata.properties");
		//prop.store(fos,"emial is updated");
		PropertiesUtility pUtil=new PropertiesUtility();
		pUtil.writeDataToProperties("email","martin@gmail.com","email is updated");
		PropertiesUtility pUtil1=new PropertiesUtility();
		pUtil1.writeDataToProperties("email","robin@gmail.com","email is updated");
	
	
	
	}

}
