package pck.Mavnproject;

import org.testng.annotations.Test;

public class testparameters {
	
	@Test(priority=0)
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
	
	@Test(priority=2)
	public void Testcase3()
	{
		System.out.println("This is Test case 3");
	}



}
