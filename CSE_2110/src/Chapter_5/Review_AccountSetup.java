/*
Program: Review_AccountSetup.java         Last Date of this Revision: March 17, 2022 




Purpose: Stores and outputs a username and password but it will prompt for a password till a 8 character long password is given

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
		
		//Stores password as "p" to be used as a place holder
		password = "P";
		
		//Prompts user for username
		System.out.print("What is your username: ");
		
		//Scans for users input
		Scanner user = new Scanner(System.in);
		
		//Stores users input
		username = user.next();
		
		//Scans for users input
		Scanner pass = new Scanner(System.in);
		
		//Repeats code below till password is 8 letters long 
		while(password.length() < 8)
			{
				//Prompts user for password
				System.out.print("\n" + "What is your password(must be 8 character): ");
				
				//Stores users input
				password = pass.next();
			}
		
		//Changes username and password to lowercase
		username = username.toLowerCase();
		password = password.toLowerCase();
		
		//Prints the username and password entered
		System.out.print("\n" + "Your username is: " + username + "\n" + "Your password is: " + password);

	}

}
/* Screen Dump
 
What is your username: ComputERMan

What is your password(must be 8 character): THis_Is_Fun

Your username is: computerman
Your password is: this_is_fun

*/ 