package pck.Mavnproject;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class extenreportvalidation 
{
	WebDriver driver ;

	@Test(priority=0)
	public void Testcase0()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", 
					"D:\\Software\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
			driver.get("http://www.leafground.com/pages/Dropdown.html");
			driver.manage().window().maximize();
			File path=Extenreport.screnshottaken(driver, "Testcase0");
		Extenreport.test.log(LogStatus.PASS, Extenreport.test.addScreenCapture(path.toString()));
		}
		catch(Exception e)
		{
		Extenreport.test.log(LogStatus.FAIL, e);
		}
	}
	
	@Test(priority=1)
	public void Testcase1()
	{
		try
		{
			WebElement multislect=driver.findElement(By.xpath("(//div[@class='example']//child::select)[6]"));
			Select s=new Select(multislect);
			Boolean value=s.isMultiple();
			System.out.println(value);
			if(value==true)
			{
				//Select s1=new Select(driver.findElement(By.xpath("(//div[@class='example']//child::select)[6]")));
				//List<WebElement> l = s1.getOptions();
				s.selectByIndex(1);
				s.selectByIndex(2);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				File path=Extenreport.screnshottaken(driver, "Testcase1");
				Extenreport.test.log(LogStatus.PASS, Extenreport.test.addScreenCapture(path.toString()));
		
			}
		}
		catch(Exception e)
		{
			Extenreport.test.log(LogStatus.FAIL, "This test case 2 is Fail");
		}
	}
	
	@AfterSuite
	public void aftertest()
	{
		Extenreport.reportclose();
		driver.quit();
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
		Extenreport.extreport();
		System.out.println("This is Before Suite");
	}
}
