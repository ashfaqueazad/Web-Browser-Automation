/**
 * 
 */
package com.testing.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.ban.pages.NavigationLinks;

/**
 * @author Ashfaque
 *
 */
public class TestNavigationLinks 
{
	public void testnavigationlinks()
	{
		//Initialize the web driver
				String exePath = "C:\\Users\\Furqan\\Desktop\\Selena\\chromedriver_win32\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", exePath);
				WebDriver driver=new ChromeDriver();
				
				//maximizing the window
				driver.manage().window().maximize();
				
				driver.get("http://barnesandnoble.com");
				
				//create object of the page you are verifying
				NavigationLinks navigate=PageFactory.initElements(driver,NavigationLinks.class);
				
				//calling the method of NavigationLinks
				navigate.navigationlinks();
				//close the driver
				driver.quit();
	}
}
