/*
Program: Review_Circle_Part4.java         Last Date of this Revision: April 7, 2022 




Purpose: To overwrite the original input for the functions equals and toString from Circle.java 

Author: Aiden Storer 
School: CHHS
Course: Computer Science 20
 

*/

package Chapter_7;

import java.util.Scanner;

public class Ex8_Adder_main 
{

	public static void main(String[] args) 
	{
		//Scans for users input
		Scanner user = new Scanner(System.in);
		
		//sets rand_n1, rand_n2, input_awn, n1, n2 and attempts as int variables
		int rand_n1, rand_n2, input_awn, n1, n2, attempts;
		
		//Creates two objects of Ex8_Adder_Functions.java
		Ex8_Adder_Functions Attempt1 = new Ex8_Adder_Functions();
		Ex8_Adder_Functions Attempt2 = new Ex8_Adder_Functions();
		
		//Loops the following code till input_awn = 999 
		do {
			
			//Initializes the variable attempts.
			attempts = 0;
			 
			//Gets two new numbers.
			n1 = Attempt1.get_New_num_1(); 
			n2 = Attempt1.get_New_num_2(); 
			 
			  //Loops the following code till input_awn = the correct answer or input_awn = 999 or attempt >= 3.
			  do{
				 
				  //Adds 1 to the attempt variable.
				  attempts += 1;
				  
				  //Displays the question.
				  System.out.println("Question: ");
				  System.out.print(n1 + " + " + n2 + " = ");
			
				  //Stores users input
				  input_awn = user.nextInt();
				  
				  //Executes the following code if input_awn does not = 999
				  if (input_awn != 999)
				  {
					  //Runs the function get_answer from the Ex8_Adder_Functions.java class
					  System.out.println(Attempt1.get_answer(n1, n2, input_awn));
					  System.out.println("Number of attempts: " + attempts); 
				  }	 	 
				  
				  
				  else 
				  {
					  //Displays "Thanks for playing!"
					  System.out.println("\n_____________________________\n ");
					  System.out.println("Thanks for playing!");
				  }
				  
				  
				  System.out.println("\n_____________________________\n ");
				  
			  }while (input_awn != (n1 + n2) && input_awn != 999 && attempts < 3);
			
			  
			 
			  //Executes the following code object 1 and object 2 have the same return from the function get_answer or if input_awn does not = 999
			  if(Attempt1.get_answer(n1, n2, input_awn) != Attempt2.get_answer(1, 1, 2) && input_awn != 999)
			  {
				  //Adds 1 to attempts 
				  attempts += 1;
				  //Displays the following code
				  System.out.println("Oops out of tries. The correct answer was " + (n1 + n2) + ".\nHere's a new question.");
			  }
			  
			  else
			  {
				  attempts += 0;
			  }
			  
			  //Determines the amount of points earned
			  Attempt1.set_points(attempts);
			  
			  //Displays the following code providing the user with the amount of points that they earned. 
			  System.out.println("You have a total of " + Attempt1.get_Total() + " points." );  
			  System.out.println("\n===========================\n ");
			
			
			
		}
		while(input_awn != 999);
	}

}
/* Screen Dump

Question: 
7 + 9 = 16
Your answer is true. Here is another question.
Number of attempts: 1

_____________________________
 
You have a total of 5 points.

===========================
 
Question: 
13 + 14 = 9
Your answer is false. Enter another answer.
Number of attempts: 1

_____________________________
 
Question: 
13 + 14 = 2
Your answer is false. Enter another answer.
Number of attempts: 2

_____________________________
 
Question: 
13 + 14 = 3
Your answer is false. Enter another answer.
Number of attempts: 3

_____________________________
 
Oops out of tries. The correct answer was 27.
Here's a new question.
You have a total of 5 points.

===========================

*/