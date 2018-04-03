/**
 * 
 */
package TestNGPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
/**
 * @author nairl
 *
 */
public class FirstTestNG {
	WebDriver driver;
	
@Test
@Parameters("browser")
public void setPropertyforChrome(String browser)
{
	if(browser.equals("Firefox")) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\nairl\\Downloads\\geckodriver-v0.20.0-win64\\geckodriver.exe");
	
	driver = new FirefoxDriver();
	driver.get("https://www.google.com");
	System.out.println("Firefox proeprty set");
	}
}

@BeforeTest
public void openBrowser()
{
System.out.println("Browser opened");
}

@BeforeClass
public void launchurl()
{
System.out.println("Url launched");	
}

@Test
public void Test()
{
System.out.println(driver.getTitle());	
AssertJUnit.assertEquals(driver.getTitle(), "Google","Title does not match");
}

@Test(invocationCount = 2)
public void Test1()
{
System.out.println("sucesssss!!!");	
}
@AfterSuite
public void deletcookie()
{
	System.out.println("Delete cookies");
}

@AfterTest
public void closeBrowser()
{
	driver.close();
System.out.println("Browser closed");
}

@AfterClass
public void bye()
{
	
System.out.println("Bye");	
}

}
