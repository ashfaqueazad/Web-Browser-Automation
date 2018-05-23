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
public class NavigationLinks 
{
	WebDriver driver;
	
	By header=By.xpath(".//*[@id='categoryHeaderContainer']/h1");
	
	public NavigationLinks(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void navigationlinks(){
	
	try{
		driver.findElement(By.xpath("//li[contains(@class,'nav-item main-cat-1')]")).click();
		driver.findElement(header);
		System.out.println("1.BOOKS working fine");
		}catch(Exception e){
			//writer.write("\nBOOKS EXCEPTION== "+e);
			//writer.write(System.getProperty( "line.separator" ));
			System.out.println("\nBOOKS EXCEPTION== "+e);
		}
		try{
		driver.findElement(By.xpath("//li[contains(@class,'nav-item main-cat-2')]")).click();
		driver.findElement(header);
		System.out.println("2.NOOK BOOKS working fine");
		}catch(Exception e){
			//writer.write("\nNOOK BOOKS EXCEPTION== "+e);
			//writer.write(System.getProperty( "line.separator" ));
			System.out.println("\nNOOK BOOKS EXCEPTION== "+e);
		}
		try{
		driver.findElement(By.xpath("//li[contains(@class,'nav-item main-cat-3')]")).click();
		driver.findElement(header);
		System.out.println("3.NOOK working fine");
		}catch(Exception e){
			//writer.write("\nNOOK EXCEPTION== "+e);
			//writer.write(System.getProperty( "line.separator" ));
			System.out.println("\nNOOK EXCEPTION== "+e);
		}
		try{
		driver.findElement(By.xpath("//li[contains(@class,'nav-item main-cat-4')]")).click();
		driver.findElement(header);
		System.out.println("4.TEXTBOOKS working fine");
		}catch(Exception e){
			//writer.write("\nTEXTBOOKS EXCEPTION== "+e);
			//writer.write(System.getProperty( "line.separator" ));
			System.out.println("\nTEXTBOOKS EXCEPTION== "+e);
		}
		try{
		driver.findElement(By.xpath("//li[contains(@class,'nav-item main-cat-5')]")).click();
		driver.findElement(header);
		System.out.println("5.BARGAIN working fine");
		}catch(Exception e){
			//writer.write("\nBARGAIN EXCEPTION== "+e);
			//writer.write(System.getProperty( "line.separator" ));
			System.out.println("\nBARGAIN EXCEPTION== "+e);
		}
		try{
		driver.findElement(By.xpath("//li[contains(@class,'nav-item main-cat-6')]")).click();
		driver.findElement(header);
		System.out.println("6.NEWSSTAND working fine");
		}catch(Exception e){
			//writer.write("\nNEWSSTAND EXCEPTION== "+e);
			//writer.write(System.getProperty( "line.separator" ));
			System.out.println("\nNEWSSTAND EXCEPTION== "+e);
		}
		try{
		driver.findElement(By.xpath("//li[contains(@class,'nav-item main-cat-7')]")).click();
		driver.findElement(header);
		System.out.println("7.TEENS working fine");
		}catch(Exception e){
			//writer.write("\nTEENS EXCEPTION== "+e);
			//writer.write(System.getProperty( "line.separator" ));
			System.out.println("\nTEENS EXCEPTION== "+e);
		}
		try{
		driver.findElement(By.xpath("//li[contains(@class,'nav-item main-cat-8')]")).click();
		driver.findElement(header);
		System.out.println("8.KIDS working fine");
		}catch(Exception e){
			//writer.write("\nKIDS EXCEPTION== "+e);
			//writer.write(System.getProperty( "line.separator" ));
			System.out.println("\nKIDS EXCEPTION== "+e);
		}
		try{
		driver.findElement(By.xpath("//li[contains(@class,'nav-item main-cat-9')]")).click();
		driver.findElement(header);
		System.out.println("9.TOYS&GAMES working fine");
		}catch(Exception e){
			//writer.write("\nTOYS&GAMES EXCEPTION== "+e);
			//writer.write(System.getProperty( "line.separator" ));
			System.out.println("\nTOYS&GAMES EXCEPTION== "+e);
		}
		try{
		driver.findElement(By.xpath("//li[contains(@class,'nav-item main-cat-10')]")).click();
		driver.findElement(header);
		System.out.println("10.HOBBIES working fine");
		}catch(Exception e){
			//writer.write("\nHOBBIES EXCEPTION== "+e);
			//writer.write(System.getProperty( "line.separator" ));
			System.out.println("\nHOBBIES EXCEPTION== "+e);
		}
		try{
		driver.findElement(By.xpath("//li[contains(@class,'nav-item main-cat-11')]")).click();
		driver.findElement(header);
		System.out.println("11.HOME GIFTS working fine");
		}catch(Exception e){
			//writer.write("\nHOME GIFTS EXCEPTION== "+e);
			//writer.write(System.getProperty( "line.separator" ));
			System.out.println("\nHOME GIFTS EXCEPTION== "+e);
		}
		try{
		driver.findElement(By.xpath("//li[contains(@class,'nav-item main-cat-12')]")).click();
		driver.findElement(header);
		System.out.println("12.MOVIES&TV working fine");
		}catch(Exception e){
			//writer.write("\nMOVIES&TV EXCEPTION== "+e);
			//writer.write(System.getProperty( "line.separator" ));
			System.out.println("\nMOVIES&TV EXCEPTION== "+e);
		}
		try{
		driver.findElement(By.xpath("//li[contains(@class,'nav-item main-cat-13')]")).click();
		driver.findElement(header);
		System.out.println("13.MUSIC working fine");
		}catch(Exception e){
			//writer.write("\nMUSIC EXCEPTION== "+e);
			//writer.write(System.getProperty( "line.separator" ));
			System.out.println("\nMUSIC EXCEPTION== "+e);
		}
	}
}
