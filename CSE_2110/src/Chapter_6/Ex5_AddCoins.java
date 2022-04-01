/*
Program: Ex5_AddCoins.java         Last Date of this Revision: March 30, 2022 






Purpose: To prompt the user for their amount of each coin and then calculate the total dollar amount. 

Author: Aiden Storer 
School: CHHS
Course: Computer Science 20
 

*/

package Chapter_6;

import java.util.Scanner;

public class Ex5_AddCoins 
{
	
	//Calculates the total dollar amount of the inputed coins when called
	public static double getDollarAmount(int quart, int dime, int nick, int pen)
	{
		//Sets dollarAmount as a double variable and assigns it the value of 0
		double dollarAmount;
		dollarAmount = 0;
		
		//Adds the amount of quarters to the total dollar amount
		dollarAmount += (quart * 0.25);
		
		//Adds the amount of dimes to the total dollar amount
		dollarAmount += (dime * 0.10);
		
		//Adds the amount of nickels to the total dollar amount
		dollarAmount += (nick * 0.05);
		
		//Adds the amount of pennies to the total dollar amount
		dollarAmount += (pen * 0.01);
		
		//Rounds the total dollar amount to 2 decimal places
		dollarAmount = Math.round(dollarAmount * 100.0) / 100.0;
		
		//Returns the dollar amount to the main function
		return (dollarAmount);
	}
	
	
	public static void main(String[] args) 
	{
		//Scans for users input
		Scanner user = new Scanner(System.in);
		int quart, dime, nick, pen;
		
		//Prompts the user for their amount of quarters 
		System.out.print("Enter coins \n\n" + "Quarters: ");
		//Stores users input
		 quart = user.nextInt();
		 
		//Prompts the user for their amount of dimes 
		System.out.print("Dimes: ");
		//Stores users input
		 dime = user.nextInt();
		 
		//Prompts the user for their amount of nickels 
		System.out.print("Nickels: ");
		//Stores users input
		 nick = user.nextInt();
		 
		//Prompts the user for their amount of pennies 
		System.out.print("Pennies: ");
		//Stores users input
		 pen = user.nextInt();
		 
		 //Prints the total dollar amount by calling the function getDollarAmount
		 System.out.println("\n\n" + "=========================== ");
		 System.out.print("Total: $" + getDollarAmount(quart, dime, nick, pen));
		 
	}

}
/* Screen Dump
 * 
Enter coins 

Quarters: 45
Dimes: 2
Nickels: 3
Pennies: 2


=========================== 
Total: $11.62

*/ 