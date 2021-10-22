package pck.Mavnproject;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class beforesuite 
{
	@BeforeSuite(alwaysRun=true)
	public void BF()
	{
		System.out.println("BF");
	}

	@Test(priority=0,description="Test1",groups="Sanity",invocationCount=5,invocationTimeOut=10)
	
	public void Testcase1()
	{
		System.out.println("This is Test case 1");
	}
	
	@Test(priority=1,enabled=true,groups="SIT",timeOut=60,successPercentage=50)
	public void Testcase0()
	{
		System.out.println("This is Test case 0");
	}
	

}
