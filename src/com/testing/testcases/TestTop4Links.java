package com.testing.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.ban.pages.Top4Links;


public class TestTop4Links 
{
	public void testtop4links()
	{
			//Initialize the web driver
			String exePath = "C:\\Users\\Furqan\\Desktop\\Selena\\chromedriver_win32\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);
			WebDriver driver=new ChromeDriver();
			
			//maximizing the window
			driver.manage().window().maximize();
			
			driver.get("http://barnesandnoble.com");
			
			//create object of the page you are verifying
			Top4Links top4=PageFactory.initElements(driver,Top4Links.class);
			top4.top4links();
			
			//closing the driver
			driver.quit();
	}
}
