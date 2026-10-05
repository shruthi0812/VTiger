package practicepackage;

import genericUtility.JavaUtility;

public class JavaUtilityPratice {
	public static void main(String[] args) {
		JavaUtility jutil = new JavaUtility();
		String value = jutil.getCalendardetails("dd-MM-YY");
		System.out.println(value);
		String value1=jutil.getCalendardetails("dd-MM-YY hh-mm-ss");
	System.out.println(value1);
	int num=jutil.generateRandomNumber(100000);
	System.out.println(num);
	}

}
