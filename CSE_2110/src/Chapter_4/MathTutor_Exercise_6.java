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
		
		//Sets pri_per and copies as a double variable
		int input_op; 
		double rand_n1, rand_n2, anw, input_anw; 
		
		anw = 0;
		input_anw = 0;
		
		//Prompts user for operation associated with a number
		System.out.println("What opperation do you need: \n 1: Addition \n 2: Subtraction \n 3: Multiplication \n 4: Division");
								
		//Stores users input
		input_op = user.nextInt();
		
		rand_n1 = (int)(10 * Math.random()) + 1; 
		rand_n2 = (int)(10 * Math.random()) + 1;
		
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
				
				System.out.println("What is " + rand_n1 + " * " + rand_n2 + "to two decimal places do not round");	
				anw = rand_n1 * rand_n2;
				input_anw = user_anw.nextDouble();
				break;
				
			case 4:
				
				System.out.println("What is " + rand_n1 + " / " + rand_n2 + "to two decimal places do not rounds");	
				anw = rand_n1 / rand_n2;
				input_anw = user_anw.nextDouble();
				break;
				
		
		}
		
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




 */ 