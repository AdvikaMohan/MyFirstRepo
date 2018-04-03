package TestNGPack;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SecondTestNG {
	
	WebDriver driver;
	@Test
	public void addition() {
		int a = 20;
		int b= 10;
		int c= a+b;
		System.out.println("Sum is :" +c);
	}	
		@AfterTest
		public void closeBrowsersecond()
		{
			driver.close();
		System.out.println("Second class AfterTest");
		}
	

}
