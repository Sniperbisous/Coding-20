/*

Program: Grade_Exercise_5.java         Last Date of this Revision: March 8, 2022






Purpose: To display the letter grade associated with the inputed percentage

Author: Aiden Storer 
School: CHHS
Course: Computer Science 20
 

*/

package Chapter_4;

import java.util.Scanner;

public class MathTutor_Exercise_6 
{

	public static void main(String[] args) 
	{
		//Scans for users input
		Scanner user = new Scanner(System.in);
		Scanner user_anw = new Scanner(System.in);
		
		//Sets input_op as a int and rand_n1, rand_n2, anw and input_anw as a double variable type
		int input_op; 
		double rand_n1, rand_n2, anw, input_anw; 
		
		//Sets anw and input_anw as 0
		anw = 0;
		input_anw = 0;
		
		//Prompts user for operation associated with a number
		System.out.println("What operation do you need: \n 1: Addition \n 2: Subtraction \n 3: Multiplication \n 4: Division");
								
		//Stores users input
		input_op = user.nextInt();
		
		//Creates 2 random number
		rand_n1 = (int)(10 * Math.random()) + 1; 
		rand_n2 = (int)(10 * Math.random()) + 1;
		
		//Run a code that either adds, subtracts, divides or multiples the two random number and prompts for an answer based on what operation was selected. 
		switch(input_op)
		{
			case 1:
				
				System.out.println("What is " + rand_n1 + " + " + rand_n2);
				anw = rand_n1 + rand_n2;
				input_anw = user_anw.nextDouble();
				break;
				
			case 2:
				
				System.out.println("What is " + rand_n1 + " - " + rand_n2);
				anw = rand_n1 - rand_n2;
				input_anw = user_anw.nextDouble();
				break;
				
			case 3:
				
				System.out.println("What is " + rand_n1 + " * " + rand_n2 + " to two decimal places.");	
				anw = Math.round((rand_n1 * rand_n2) * 100.00)/100.00;
				input_anw = user_anw.nextDouble();
				break;
				
			case 4:
				
				System.out.println("What is " + rand_n1 + " / " + rand_n2 + " to two decimal places.");	
				anw = Math.round((rand_n1 / rand_n2) *100.00)/100.00;
				
				input_anw = user_anw.nextDouble();
				break;
				
		
		}
		
		//Checks if the calculated answer is the same as the entered solution and displays "Correct" or "Incorrect the answer is: " and the answer
		if(input_anw == anw)
		{
			System.out.println("Correct");	
		}
		else 
		{
			System.out.println("Incorrect the awnser is: " + anw);	
		}
	}

}

/* Screen Dump
What operation do you need: 
 1: Addition 
 2: Subtraction 
 3: Multiplication 
 4: Division
1
What is 4.0 + 7.0
11
Correct


What operation do you need: 
 1: Addition 
 2: Subtraction 
 3: Multiplication 
 4: Division
2
What is 5.0 - 4.0
1
Correct



What operation do you need: 
 1: Addition 
 2: Subtraction 
 3: Multiplication 
 4: Division
3
What is 1.0 * 7.0 to two decimal places.
7.00
Correct


What operation do you need: 
 1: Addition 
 2: Subtraction 
 3: Multiplication 
 4: Division
4
What is 1.0 / 5.0 to two decimal places.
0.2
Correct


 */ 