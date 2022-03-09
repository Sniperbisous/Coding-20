/*

Program: Grade_Exercise_5.java         Last Date of this Revision: March 9, 2022





Purpose: To display the letter grade associated with the inputed percentage

Author: Aiden Storer 
School: CHHS
Course: Computer Science 20
 

*/
package Chapter_4;

import java.util.Scanner;

public class Grade_Exercise_5 
{

	public static void main(String[] args) 
	{
		//Scans for users input
		Scanner user = new Scanner(System.in);
				
		//Sets pri_per and copies as a double variable
		int input_per; 
		char output_let;
						
		//Prompts user for the amount of copies to be printed
		System.out.println("What is the percentage:");
						
		//Stores users input amount
		input_per = user.nextInt();
		
		//Calculates what output_let is based on which range the input percentage fall into 
		if (input_per <= 100 && input_per >= 90)
			{
					
				output_let = 'A';
						
			}
				
		else if (input_per <= 89 && input_per >= 80)
			{
			
				output_let = 'B';
					
			}
				
		else if (input_per <= 79 && input_per >= 70)
			{
			
				output_let = 'C';
				
			}
				
		else if (input_per <= 69 && input_per >= 60)
			{

				output_let = 'D';
			
			}
		
		else 
			{

				output_let = 'F';
			
			}
		
		//Displays the letter grade of the inputed percentage
		System.out.println("Your letter grade is: " + output_let);
	}

}

/* Screen Dump

What is the percentage:
88
Your letter grade is: B


What is the percentage:
69
Your letter grade is: D


 */ 