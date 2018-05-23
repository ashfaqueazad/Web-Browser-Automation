/**
 * 
 */
package com.ban.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Ashfaque Azad
 *
 */
public class Top4Links 
{
	WebDriver driver;
	
	By header=By.xpath(".//*[@id='categoryHeaderContainer']/h1");
	
	public Top4Links(WebDriver driver)
	{
		this.driver=driver;
	}
	public void top4links()
	{
		//MEMBERSHIP
		try{
		driver.findElement(By.xpath("//a[contains(@href,'http://www.barnesandnoble.com/membership/')]")).click();
		driver.findElement(header);
		System.out.println("1.Membership working fine");
		}catch(Exception e){
			//writer.write("\nMEMBERSHIP EXCEPTION== "+e);
			//writer.write(System.getProperty( "line.separator" ));
			System.out.println("\nMEMBERSHIP EXCEPTION== "+e);
		}
		//GIFT CARDS
		try{
		driver.findElement(By.xpath("//a[contains(@href,'http://www.barnesandnoble.com/b/gift-cards/_/N-8rg')]")).click();
		driver.findElement(By.xpath(".//*[@id='categoryHeaderContainer']/h1"));
		System.out.println("2.Gift cards working fine");
		}catch(Exception e){
			//writer.write("\nGIFT CARDS EXCEPTION== "+e);
			//writer.write(System.getProperty( "line.separator" ));
			System.out.println("\nGIFT CARDS EXCEPTION== "+e);
		}
		//STORES&EVENTS
		try{
		driver.findElement(By.xpath("//a[contains(@href,'http://stores.barnesandnoble.com/')]")).click();
		System.out.println("3.Stores and Events working fine");
		}catch(Exception e){
			//writer.write("\nSTORES&EVENTS EXCEPTION== "+e);
			//writer.write(System.getProperty( "line.separator" ));
			System.out.println("\nSTORES&EVENTS EXCEPTION== "+e);
		}
		//enter the store number
		try{
		driver.findElement(By.xpath("//form[contains(@class,'form-inline')]")).click();
		driver.findElement(By.xpath("//input[contains(@id,'store-input')]")).sendKeys("10001");
		driver.findElement(By.xpath("//input[contains(@type,'submit')]")).submit();
		System.out.println("4.Store locator working fine");
		}catch(Exception e){
			//writer.write("\nSTORE LOCATOR EXCEPTION== "+e);
			//writer.write(System.getProperty( "line.separator" ));
			System.out.println("\nSTORE LOCATOR EXCEPTION== "+e);
		}
		//HELP
		try{
		driver.findElement(By.xpath("//a[contains(@href,'https://help.barnesandnoble.com/')]")).click();
		System.out.println("5.Help working fine");
		}catch(Exception e){
			//writer.write("\nHELP EXCEPTION== "+e);
			//writer.write(System.getProperty( "line.separator" ));
			System.out.println("\nHELP EXCEPTION== "+e);
		}
	}
}
