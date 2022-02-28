/*

Program: Review_Digits.java          Last Date of this Revision: Feb 28, 2022

Purpose: To display the two separate digits of a two digit input number.

Author: Aiden Storer 
School: CHHS
Course: Computer Science 20
 

*/
package chapter3_Tasks;

import java.util.Scanner;

public class Review_Digits {

	public static void main(String[] args) 
	{
		//Scans for users input.
		Scanner num = new Scanner(System.in);
		
		//Classifies number, first and second as int variable.
	    int number, first, second;
	    
	    // Prompts user for a two digit whole number.
	    System.out.println("Enter your two digit whole number: "); 
	    
	    //Stores user input.
	    number = num.nextInt();
	    
	    //Calculates the first and second digit from the input number.
	    first = number / 10; 
	    second  = number % 10;
	     
	   //Displays the first and second digits of the original number. 
	    System.out.println("The first digit is: " + first + "\n" + "The second digit is: " + second);
	}

}
/* Screen Dump

Enter your two digit whole number: 
22
The first digit is: 2
The second digit is: 2

 
 */ 