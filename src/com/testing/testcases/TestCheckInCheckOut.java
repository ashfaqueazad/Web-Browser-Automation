package com.testing.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.ban.pages.CheckInOut;


public class TestCheckInCheckOut 
{
	public void testcheckincheckout(String prod)
	{
		//Initialize the web driver
				String exePath = "C:\\Users\\Furqan\\Desktop\\Selena\\chromedriver_win32\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", exePath);
				WebDriver driver=new ChromeDriver();
				
				
				//maximizing the window
				driver.manage().window().maximize();
				
				//create object of the page you are verifying
				CheckInOut check=PageFactory.initElements(driver,CheckInOut.class);
				check.checkinout(prod);
				
				driver.quit();
	}

}
