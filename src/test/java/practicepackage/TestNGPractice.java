package practicepackage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(genericUtility.ListenersImplementation.class)
public class TestNGPractice {
	@Test
	
	public void riyaWakes()
	{
		System.out.println("Good morning");
	}
	@Test
	public void riyaChats()
	{
		System.out.println("Hello");
	}
	@Test
	
	public void riyaEats()
	{
		System.out.println("I love Chicken Biryani");
	}
	@Test
	
	public void riyaSleeps()
	{
		System.out.println("Good night");
	}

}
