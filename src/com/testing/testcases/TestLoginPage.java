/**
 * 
 */
package com.testing.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.ban.pages.*;

/**
 * @author Ashfaque Azad
 * 
 * this tests the log in page
 *
 */
public class TestLoginPage 
{
	public void testLogin()
	{
		//Initialize the web driver
		String exePath = "C:\\Users\\Furqan\\Desktop\\Selena\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver=new ChromeDriver();
		
		
		//maximizing the window
		driver.manage().window().maximize();
		
		//get the log in page of the website
		driver.get("https://www.barnesandnoble.com/account/login-frame.jsp?tplName=login&parentUrl=http%3a%2f%2fwww.barnesandnoble.com%2f&isCheckout=&isNookLogin=&isEgift=&customerkey=&intent=&emailSub=");
		
		//create object of the page you are verifying
		LoginPage login=PageFactory.initElements(driver,LoginPage.class);
		
		//calling the LoginPage method
		login.login("ashfaqueazadmsit@yahoo.in", "Bnazad1");
		
		driver.get("http://barnesandnoble.com");
		
		//closing the driver
		driver.quit();
	}
}
