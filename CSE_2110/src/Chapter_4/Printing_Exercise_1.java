/*

Program: Review_Printing_Exercise_1.java         Last Date of this Revision: March 8, 2022




Purpose: To calculate and display the price per amount of inputed copies as well as the total cost 

Author: Aiden Storer 
School: CHHS
Course: Computer Science 20
 

*/

package Chapter_4;

import java.util.Scanner;

public class Printing_Exercise_1 
{

	public static void main(String[] args) 
	{
		//Scans for users input
		Scanner user = new Scanner(System.in);
		
		//Sets pri_per and copies as a double variable
		double pri_per, copies;
				
		//Prompts user for the amount of copies to be printed
		System.out.println("What is the amout of copies that you wish to print: ");
				
		//Stores users input amount
		copies = user.nextDouble();
		
		//Calculates what pri_per is based on which range the copies fall into 
		if (copies <= 99 && copies >= 0)
			{
			
				pri_per = 0.30;
				
			}
		
		else if (copies <= 499 && copies >= 100)
			{
		
				pri_per = 0.28;
			
			}
		
		else if (copies <= 749 && copies >= 500)
			{
	
				pri_per = 0.27;
		
			}
		
		else if (copies <= 1000 && copies >= 750)
			{

				pri_per = 0.26;
	
			}
		else 
			{

				pri_per = 0.25;

			}
		
		//Sends to next line
		System.out.print("\n");
		
		//Displays the price per copy base on the if else statement sorting
		System.out.printf("Price per copy is: $%.2f \n", pri_per);
		//Displays the total cost of printing the inputed copies
		System.out.printf("The total cost is: $%.2f", (pri_per * copies));
	}

}

/* Screen Dump

What is the amout of copies that you wish to print: 
1001

Price per copy is: $0.25 
The total cost is: $250.25


What is the amout of copies that you wish to print: 
23

Price per copy is: $0.30 
The total cost is: $6.90


 */ 