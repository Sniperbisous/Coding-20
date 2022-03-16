/*
Program: Review_NumberSum.java         Last Date of this Revision: March 16, 2022




Purpose: Displays all numbers between 1 and the inputed maxNumthen display the sum of all numbers added together

Author: Aiden Storer 
School: CHHS
Course: Computer Science 20
 

*/
package Chapter_5;

import java.util.Scanner;

public class Review_AccountSetup 
{

	public static void main(String[] args) 
	{
		String password, username;
		
		password = "P";
		System.out.println("What is your username: ");
		
		//Scans for users input
		Scanner user = new Scanner(System.in);
		
		username = user.next();
		
		//Scans for users input
		Scanner pass = new Scanner(System.in);
		
		while(password.length() < 8)
		{
		System.out.println("What is your password(must be 8 character): ");
		password = pass.next();
		}
		
	}

}
/* Screen Dump


*/ 