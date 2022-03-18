/*
Program: Ex_8_GuessingGame.java         Last Date of this Revision: March 18, 2022 



Purpose: To prompt the user for a random number between 1 and 20 and gives the user infinite guesses.

Author: Aiden Storer 
School: CHHS
Course: Computer Science 20
 

*/
package Chapter_5;

import java.util.Scanner;

public class Ex_8_GuessingGame 
{

	public static void main(String[] args) 
	{
		//Scans for users input
		Scanner user = new Scanner(System.in);
		
		//Sets play, ran_n and input_anwser as a int variable.
		int play, ran_n, input_anwser;
		
		//Prompts the user to guess a number between 1-20.
		System.out.println("Guess a the random number between 1-20: ");
		
		//Generates a random number between 1-20
		ran_n = (int) (20 * Math.random() + 1);
		
		
		do
		{
			//Stores the user input
			input_anwser = user.nextInt(); 
			
			//compares the inputed answer to the correct answer and displays "try again" if they do not match
			if(input_anwser != ran_n)
				{
					System.out.println("___________________________ ");
					System.out.print("\n" + "Try again: ");
				}
			
		}
		while(input_anwser != ran_n); //Repeats the above code till the right answer is given
		
		//Prints a congratulation and the right number + two lines
		System.out.println("\n" + "=========================== ");
		System.out.println("*************************** ");
		System.out.println("\n" + "Well done you did it!");
		System.out.println("The number was " + ran_n);
	}

}
/* Screen Dump

Guess a the random number between 1-20: 
1
___________________________ 

Try again: 4
___________________________ 

Try again: 5
___________________________ 

Try again: 6
___________________________ 

Try again: 7
___________________________ 

Try again: 8
___________________________ 

Try again: 3

=========================== 
*************************** 

Well done you did it!
The number was 3

*/ 