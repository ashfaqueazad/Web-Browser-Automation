/**
 * 
 */
package com.mainclass;
import java.util.Scanner;



import com.testing.testcases.TestCheckInCheckOut;
import com.testing.testcases.TestLoginPage;
import com.testing.testcases.TestNavigationLinks;
import com.testing.testcases.TestTop4Links;


/**
 * @author Ashfaque
 *
 */
public class MainClass 
{
	public static void main(String args[])
	{
		System.out.println("Select any one among the following");
		System.out.println("Enter 1 for testing login page");
		System.out.println("Enter 2 for testing navigation links");
		System.out.println("Enter 3 for testing top 4 links eg. memberships, stores etc.");
		System.out.println("Enter 4 for product search and submit");
		Scanner select = new Scanner(System.in);
		int selection=select.nextInt();
		if(selection<1||selection>4)
			System.out.println("Enter the correct choice");
		switch(selection)
		{
		case 1:
			TestLoginPage o =new TestLoginPage();
			o.testLogin();
			break;
			
		case 2:
			TestNavigationLinks o1=new TestNavigationLinks();
			o1.testnavigationlinks();
			break;
			
		case 3:
			TestTop4Links o2=new TestTop4Links();
			o2.testtop4links();
			break;
			
		case 4:
			TestCheckInCheckOut o3= new TestCheckInCheckOut();
			System.out.println("enter a product to search");
			Scanner sc=new Scanner(System.in);
			o3.testcheckincheckout(sc.nextLine());
			break;
		}
	}
}
