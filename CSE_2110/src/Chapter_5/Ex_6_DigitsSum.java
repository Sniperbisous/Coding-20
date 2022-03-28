/*
Program: Review_AccountSetup.java         Last Date of this Revision: March 27, 2022 





Purpose: Requests a positive 3 digit number then displays each digit and calculates then displays the sum of all digits.

Author: Aiden Storer 
School: CHHS
Course: Computer Science 20
 

*/

package Chapter_5;

import java.util.Scanner;

public class Ex_6_DigitsSum 
{

	public static void main(String[] args)
	{
		//Scans for users input
		Scanner user = new Scanner(System.in);
		
		//Prompts user for a 3 digit number
		System.out.print("Enter a positive 3 digit interger: ");
		
		//Sets first_d, sec_d, third_d, orig and fin as int variables
		int first_d, sec_d, third_d, orig, fin;
		
		//Sets orig as the inputed value and first_d as 0
		orig = user.nextInt();
		first_d = 0;
		
		//Only runs when the number is 3 digits long 
		while(orig <= 1000)
		{
		//Calculates the first, second and third digit from the input number.
	    first_d = orig / 100; 
	    sec_d  = (orig % 100) / 10;
	    third_d = orig % 10;
	    
	    //Calculates the sum of all digits
	    fin = first_d + sec_d + third_d;
	    
	    //Displays the first second and third digits then the sum of all of them
	    System.out.println("\n" + "The first digits is: " + first_d);
	    System.out.println("The second digits is: " + sec_d);
	    System.out.println("The third digits is: " + third_d);
	    System.out.println("The sum of the digits is: " + fin);
	    
	    //Stops the loop
		orig += 1000;
		}
		

	}

}
/* Screen Dump

Enter a positive 3 digit interger: 375

The first digits is: 3
The second digits is: 7
The third digits is: 5
The sum of the digits is: 15

*/ 