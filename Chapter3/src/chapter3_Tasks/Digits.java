/*

Program: Digits.java          Last Date of this Revision: Feb 28, 2022

Purpose: To display the the three separate digits from a 3 digit input number 

Author: Aiden Storer 
School: CHHS
Course: Computer Science 20
 

*/
package chapter3_Tasks;

import java.util.Scanner;
	
public class Digits {

	public static void main(String[] args) {
		//Scans for users input.
	    Scanner num = new Scanner(System.in);
	    
	    //Classifies number, first, second and third as int variable.
	    int number, first, second, third;
	    
	    // Prompts user for a three digit whole number.
	    System.out.println("Enter a three digit whole number: "); 
	    
	    //Stores user input.
	    number = num.nextInt();
	    
	    //Calculates the first, second and third digit from the input number.
	    first = number / 100; 
	    second  = (number % 100) / 10;
	    third = number % 10;
	    
	    //Displays the first, second and third digits of the original number.   
	    System.out.println("The first digit is: " + first + "\n" + "The second digit is: " + second + "\n" + "The third digit is: " + third ); 

	}

}

/* Screen Dump

Enter a three digit whole number: 
123
The first digit is: 1
The second digit is: 2
The third digit is: 3

 
 */ 