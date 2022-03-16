/*
Program: Review_OddSum.java         Last Date of this Revision: March 16, 2022





Purpose: To find and calculate the sum of all odd numbers between the input number and 1

Author: Aiden Storer 
School: CHHS
Course: Computer Science 20
 

*/
package Chapter_5;

import java.util.Scanner;

public class Review_OddSum 
{

	public static void main(String[] args) 
	{
		//Sets numMax, num and sum as a int variable
		int numMax, odd, sum;
			
		//Sets odd as 1
		odd = 1;
		
		//Sets sum as 0
		sum = 0;
			
		//Scans for users input
		Scanner user = new Scanner(System.in);
			
		//Prompts for the users input and stores it
		System.out.println("Input the max number: ");
		numMax = user.nextInt();
				
		//loops till num is larger than numMax
		while(odd <= numMax)
				
			{
				
				
				//prints a line
				System.out.println("=============");
				
				//Prints odd
				System.out.println(odd);
				
				//Adds odd to the sum and adds 2 to odd
				sum += odd;
				odd += 2;			
				
			}
				
		//Displays the sum 
		System.out.println("The sum of the odd numbers is: "+ sum);
	}

}
/* Screen Dump

Input the max number: 
6
=============
1
=============
3
=============
5
The sum of the odd numbers is: 9

*/ 