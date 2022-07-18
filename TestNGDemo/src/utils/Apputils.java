package utils;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Apputils 
{
	
	@BeforeTest
	public static void login()
	{
		System.out.println("Gmail Login");
	}
	
	@AfterTest
		public static void logout()
		{
			System.out.println("Gmail Logout");
		}
	
	@BeforeSuite
	public static void launchApp()
	{
		System.out.println("Launch Gmail App");
	}
	
	@AfterSuite
	public static void closeApp()
	{
		System.out.println("Close Gmail App");
	}

}
