package pck.Mavnproject;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class groups {
	
	@BeforeSuite()
	public void BF()
	{
		System.out.println("BF");
	}

	@Test(priority=0,dependsOnMethods={"Testcase2"},description="Test1",groups="Sanity")
	
	public void Testcase1()
	{
		System.out.println("This is Test case 1");
	}
	
	@Test(priority=1,enabled=true,groups="SIT")
	public void Testcase0()
	{
		System.out.println("This is Test case 0");
	}
	
	@Test(priority=2,groups="Sanity")
	public void Testcase2()
	{
		System.out.println("This is Test case 2");
	}
	
	@Test(priority=3,groups={"Sanity","UAT"})
	public void Testcase3()
	{
		System.out.println("This is Test case 3");
	}
	
	@Test(priority=4,groups="UAT")
	public void Testcase4()
	{
		System.out.println("This is Test case 4");
	}
}
