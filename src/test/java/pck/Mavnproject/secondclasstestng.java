package pck.Mavnproject;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class secondclasstestng {
	
	@Test(priority=0)
	public void Testcase1()
	{
		System.out.println("This is Test case 1");
	}
	
	@Test(priority=1)
	public void Testcase01()
	{
		System.out.println("This is Test case 0");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("This is after Test");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("This is Before Class in second class");
	}
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("This is Before Suite");
	}

}
