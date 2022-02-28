/*
Program: Change.java          Last Date of this Revision: Feb 28, 2022


Purpose: To display the amount of input change in quarters, dimes, nickels and pennies.

Author: Aiden Storer 
School: CHHS
Course: Computer Science 20
 

*/
package chapter3_Tasks;

import java.util.Scanner;

public class Change {

	public static void main(String[] args) {
		//Scans for the users input.
	    Scanner T = new Scanner(System.in);
	    
	    //Classifies the variable as an int variable.
	    int t, q, d, n, p;
	    
	    // Asks user to input the amount of change in cents.
	    System.out.println("Enter the change in cents."); 
	    
	   //Stores the users input number.
	    t = T.nextInt();
	    
	    //Calculates amount of quarters, dimes, nickels and pennies that the original amount can be made up of.
	    q = t / 25; 
	    d  = (t % 25) / 10;
	    n = (t % 10) / 5;
	    p = (t % 5) / 1;
	    
	    //Outputs amount of quarters, dimes, nickels and pennies.
	    System.out.println("The amount of coins is: " + "\n" + "Quarters: " + q + "\n" + "Dimes: " + d + "\n" + "Nickel: " + n + "\n" + "Pennie: " + p );
	}

}

/* Screen Dump

Enter the change in cents.
222
The amount of coins is: 
Quarters: 8
Dimes: 2
Nickel: 0
Pennie: 2


 
 */