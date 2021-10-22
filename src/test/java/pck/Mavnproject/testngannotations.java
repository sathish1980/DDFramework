package pck.Mavnproject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngannotations {


	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("This is Before Test");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("This is Before Class");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("This is Before method");
	}
	
	@Test(priority=0,dependsOnMethods="Testcase0")
	public void Testcase1()
	{
		System.out.println("This is Test case 1");
	}
	
	@Test(priority=1)
	public void Testcase0()
	{
		System.out.println("This is Test case 0");
	}
	
	@Test(priority=2)
	public void Testcase2()
	{
		System.out.println("This is Test case 2");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("This is after method");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("This is after Class");
	}
	
	
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("This is After Suite");
	}
}
