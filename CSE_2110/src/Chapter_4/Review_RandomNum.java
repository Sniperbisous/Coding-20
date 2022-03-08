/*

Program: Review_RandomNum.java         Last Date of this Revision: March 8, 2022




Purpose: Generate and display a random number within the max and min amount entered by the user.

Author: Aiden Storer 
School: CHHS
Course: Computer Science 20
 

*/
package Chapter_4;

import java.util.Scanner;

public class Review_RandomNum 
{

	public static void main(String[] args) 
	{
		//Classifies variable Max_n, Min_n, Fin as a int
		int Max_n, Min_n, Fin;
		
		//Classifies variable Ran_n and Rang as a double
		double Ran_n, Rang;
		
		//Scans for users input
		Scanner Max = new Scanner(System.in);
		Scanner Min = new Scanner(System.in);
				
		//Prompts user for the Max of the random number window
		System.out.println("What is the max number? ");
		
		//Stores users Max input
		Max_n = Max.nextInt();
		
		//Prompts user for the Min of the random number window		
		System.out.println("What is the min number? ");
				
		//Stores users Min input
		Min_n = Min.nextInt();
		
		//Calculates the range 
		Rang = Max_n - Min_n; 
		
		//Generates a number between 1 and 0
		Ran_n = Math.random();
		
		//Calculates the random number
		Fin = (int)(Rang * Ran_n) + Min_n;
		
		//Displays the random number
		System.out.println("Number: " + Fin);
	}

}
/* Screen Dump
 
 
What is the max number? 
3000
What is the min number? 
10
Number: 120


What is the max number? 
3000
What is the min number? 
10
Number: 392


 */ 