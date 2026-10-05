package genericUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
/**
 * This is a utility class which has functionality from java library
 * @author Admin
 * @version 26-09-09
 */

public class JavaUtility {
	/**
	 * This is generic method to fetch the calendar details
	 * @param pattern
	 * @return
	 */
	
	public String getCalendardetails(String pattern)
	{
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String value = sdf.format(date);
		return value;
	}
	
	/**
	 * This is a generic method to generate random number
	 * @param bound
	 * @return
	 */
	public int generateRandomNumber(int bound)
	{
		Random r = new Random();
		int num=r.nextInt(bound);
		return num;
		
	}
	
	
	
	

}
