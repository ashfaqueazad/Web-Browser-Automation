/**
 * 
 */
package com.ban.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


/**
 * @author Ashfaque
 *
 */
public class CheckInOut 
{
	WebDriver driver;
	
	
	public CheckInOut(WebDriver driver)
	{
		this.driver=driver;
	}
	public void checkinout(String product)
	{
		//open sign in link
		try{
		driver.get("https://www.barnesandnoble.com/account/login-frame.jsp?tplName=login&parentUrl=http%3a%2f%2fwww.barnesandnoble.com%2f&isCheckout=&isNookLogin=&isEgift=&customerkey=&intent=&emailSub=");
		driver.findElement(By.xpath("//form[contains(@id,'loginForm')]")).click();
		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("#########");
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("#####");
		driver.findElement(By.xpath("//input[contains(@class,'btn-submit')]")).submit();
		System.out.println("1.Sign in working fine");
		}catch(Exception e){
			//writer.write("\nSIGN IN EXCEPTION== "+e);
			//writer.write(System.getProperty( "line.separator" ));
			System.out.println("\nSIGN IN EXCEPTION== "+e);
		}
		//open sign in link
		try{
		driver.get("https://www.barnesandnoble.com/account/login-frame.jsp?tplName=login&parentUrl=http%3a%2f%2fwww.barnesandnoble.com%2f&isCheckout=&isNookLogin=&isEgift=&customerkey=&intent=&emailSub=");
		driver.findElement(By.xpath("//form[contains(@id,'loginForm')]")).click();
		//driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("ashfaqueazadmsit@yahoo.in");
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("Bnazad1");
		driver.findElement(By.xpath("//input[contains(@class,'btn-submit')]")).submit();
		System.out.println("2.Sign in working fine");
		}catch(Exception e){
			//writer.write("\nSIGN IN EXCEPTION== "+e);
			//writer.write(System.getProperty( "line.separator" ));
			System.out.println("\nSIGN IN EXCEPTION== "+e);
		}
//account page
		try{
		driver.get("https://www.barnesandnoble.com/account/");
		}catch(Exception e){
			//writer.write("\nACCOUNT PAGE EXCEPTION== "+e);
			//writer.write(System.getProperty( "line.separator" ));
			System.out.println("\nACCOUNT PAGE EXCEPTION== "+e);
		}
//go to wish list
		try{
		driver.findElement(By.xpath("//a[contains(@id,'myAccountLink')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'/account/wishlist/')]")).click();
		System.out.println("3.Wish list working fine");
		}catch(Exception e){
			//writer.write("\nWISH LIST EXCEPTION== "+e);
			//writer.write(System.getProperty( "line.separator" ));
			System.out.println("\nWISH LIST EXCEPTION== "+e);
		}
//search a product
		try{
			//////////////
			//BNHCFilev1 randomWord = new BNHCFilev1();
		   ////////////	
		driver.findElement(By.xpath("//input[contains(@id,'searchBarBN')]")).sendKeys(product);
		driver.findElement(By.xpath("//span[contains(@class,'selectBox-arrow')]")).click();
		driver.findElement(By.xpath("//a[contains(@rel,'0')]")).click();
		driver.findElement(By.xpath("//input[contains(@id,'searchSubmit')]")).click();
		System.out.println("4.Product search working fine");
		}catch(Exception e){
			//writer.write("\nPRODUCT SEARCH EXCEPTION== "+e);
			//writer.write(System.getProperty( "line.separator" ));
			System.out.println("\nPRODUCT SEARCH EXCEPTION== "+e);
		}
//click a product
		try{
		driver.findElement(By.xpath(".//*[@id='gridView']/li/ul[1]/li[1]/div[2]/p/a")).click();
		System.out.println("5.Click a product working fine");
		}catch(Exception e){
			//writer.write("\nCLICK A PRODUCT EXCEPTION== "+e);
			//writer.write(System.getProperty( "line.separator" ));
			System.out.println("\nCLICK A PRODUCT EXCEPTION== "+e);
		}
//check ratings and reviews
		try{
		driver.findElement(By.xpath("//a[contains(@class,'gig-rating-readReviewsLink')]")).click();
		System.out.println("6.Reviews and Rating working fine");
		}catch(Exception e){
			//writer.write("\nREVIEWS AND RATING EXCEPTION== "+e);
			//writer.write(System.getProperty( "line.separator" ));
			System.out.println("\nREVIEWS AND RATING EXCEPTION== "+e);
		}
//scroll up
		try{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,-2500)");
		System.out.println("7.Scroll Up working fine");
		}catch(Exception e){
			//writer.write("\nSCROLL UP EXCEPTION== "+e);
			//writer.write(System.getProperty( "line.separator" ));
			System.out.println("\nSCROLL UP EXCEPTION== "+e);
		}
//add to bag
		try{
		driver.findElement(By.xpath("//input[contains(@class,'btn-addtocart btn-pdp-addtocart')]")).click();
		System.out.println("8.Add to bag working fine");
		}catch(Exception e){
			//writer.write("\nADD TO BAG EXCEPTION== "+e);
			//writer.write(System.getProperty( "line.separator" ));
			System.out.println("\nADD TO BAG EXCEPTION== "+e);
		}
//switch control back to default window
		/*try{
		driver.switchTo().defaultContent();
		}catch(Exception e){
			writer.write("\nDEFAULT CONTENT EXCEPTION== "+e);
		}*/
//check the cart
		try{
		driver.findElement(By.xpath("//div[contains(@id,'bagTotal')]")).click();
		System.out.println("9.Check the cart working fine");
		}catch(Exception e){
			//writer.write("\nCHECK THE CART EXCEPTION== "+e);
			//writer.write(System.getProperty( "line.separator" ));
			System.out.println("\nCHECK THE CART EXCEPTION== "+e);
		}
		//check the cart
		try{
		driver.findElement(By.xpath("//div[contains(@id,'bagTotal')]")).click();
		System.out.println("10.Check the cart working fine");
		}catch(Exception e){
			//writer.write("\nCHECK THE CART EXCEPTION== "+e);
			//writer.write(System.getProperty( "line.separator" ));
			System.out.println("\nCHECK THE CART EXCEPTION== "+e);
		}
//remove the product
		try{
		driver.findElement(By.xpath("//form[contains(@action,'//checkout/index.jsp?_DARGS=/checkout/includes/get-line-item.jsp.removeItem_hg_1_1')]")).click();
		System.out.println("11.Remove the product working fine");
		}catch(Exception e){
			//writer.write("\nREMOVE THE PRODUCT EXCEPTION== "+e);
			//writer.write(System.getProperty( "line.separator" ));
			System.out.println("\nREMOVE THE PRODUCT EXCEPTION== "+e);
		}
//go to order summary
		try{
		driver.findElement(By.xpath("//aside[contains(@id,'orderSummary')]")).click();
		System.out.println("12.Go to order summary working fine");
		}catch(Exception e){
			//writer.write("\nGO TO ORDER SUMMARY EXCEPTION EXCEPTION== "+e);
			//writer.write(System.getProperty( "line.separator" ));
			System.out.println("\nGO TO ORDER SUMMARY EXCEPTION EXCEPTION== "+e);
		}
//continue button
		try{
		driver.findElement(By.xpath("//input[contains(@id,'continue')]")).click();
		System.out.println("13.Continue button working fine");
		}catch(Exception e){
			//writer.write("\nCONTINUE BUTTON EXCEPTION== "+e);
			//writer.write(System.getProperty( "line.separator" ));
			System.out.println("\nCONTINUE BUTTON EXCEPTION== "+e);
		}
//submit order
		try{
		driver.findElement(By.xpath("//input[contains(@id,'memberSubmitOrder')]")).click();
		System.out.println("14.Submit order working fine");
		}catch(Exception e){
			//writer.write("\nSUBMIT ORDER EXCEPTION== "+e);
			//writer.write(System.getProperty( "line.separator" ));
			System.out.println("\nSUBMIT ORDER EXCEPTION== "+e);
		}
//go to global header
		try{
		driver.findElement(By.xpath("//header[contains(@id,'globalHeader')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'/')]")).click();
		System.out.println("15.Go to global Header working fine");
		}catch(Exception e){
			//writer.write("\nGLOBAL HEADER EXCEPTION== "+e);
			//writer.write(System.getProperty( "line.separator" ));
			System.out.println("\nGLOBAL HEADER EXCEPTION== "+e);
		}
//sign out
		try{
		driver.findElement(By.xpath("//a[contains(@id,'myAccountLink')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'/logout.jsp')]")).click();
		System.out.println("16.Sign out working fine");
		}catch(Exception e){
			//writer.write("\nSIGN OUT EXCEPTION== "+e);
			//writer.write(System.getProperty( "line.separator" ));
			System.out.println("\nSIGN OUT EXCEPTION== "+e);
		}
		//writer.close();
		
	}
}


