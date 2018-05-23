/**
 * 
 */
package com.ban.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Ashfaque Azad
 * Login class
 *
 */
public class LoginPage 
{
	WebDriver driver;
	
	By username=By.id("email");
	By pass=By.id("password");
	By loginButton=By.xpath("//input[contains(@class,'btn-submit')]");
	
	//constructor taking web driver as a parameter
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//method takes in email and password and logs in
	public void login(String email,String password)
	{
		driver.findElement(username).sendKeys(email);
		driver.findElement(pass).sendKeys(password);
		driver.findElement(loginButton).click();
	}
}
