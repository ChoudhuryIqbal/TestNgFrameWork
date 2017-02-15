package TestNG.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassONe {
	
	@Test
	public void f()
	{
		System.out.println("this is test");
	}
	
	@BeforeMethod
	public void openBrowser()
	{
		System.out.println("Before Method run before every test");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		System.out.println("run this method after every test ");
	}

}
