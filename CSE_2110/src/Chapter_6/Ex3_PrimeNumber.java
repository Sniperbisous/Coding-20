/*

Program: Review_TimeConverter.java         Last Date of this Revision: March 30, 2022 






Purpose: To prompt the user for their desired number and calculate whether it is a prime number or not. 

Author: Aiden Storer 
School: CHHS
Course: Computer Science 20
 

*/

package Chapter_6;

import java.util.Scanner;

public class Ex3_PrimeNumber 
{
	
	//When called Calculates whether the number is prime
	public static Boolean isPrime(int num)
	{
		//Sets div, Pnum, prime and NewP as int variables
		int  div, Pnum, prime, NewP;
		
		//Sets isPrime as a boolean variable
		Boolean isPrime;
		
		//Gives div the value of 1
		div = 1;
		
		//Gives prime the value of 0
		prime = 0;
		
		//Starts a do-while loop
		do
		{
			//Divides the num by the div and finds the remainder
			Pnum = num % div;
			
			//Adds 1 to div
			div += 1;
			
			//Checks to see when the remainder is 0
			switch(Pnum)
			{
				case 0:
				{
					//Adds 1 to prime
					prime += 1;
					
				}
			}
			//Allows prime to leave the loop without becoming 0 		
			NewP = prime;
			
		//Ends the loop when div is larger than the num
		} while (div <= num);
		
		//returns a true or false value
		isPrime = (NewP == 2);
		return isPrime;
	}
	
	public static void main(String[] args)
	{
		//Scans for users input
		Scanner user = new Scanner(System.in);
		
		//Prompts the user for a number
		System.out.println("Enter number:");
		
		//Stores users input
		int num = user.nextInt();
		
		//Prints the text below
		System.out.println("=========================== ");
		
		//Prints the text below
		System.out.println("Is it prime? \n \n" );
		
		//Prints the text below
		System.out.print("\t   |   |\n" 
		+ "\t   |   |\n" 
		+ "\t   |   |\n"
		+ "\t   |   |\n"
		+ "\t   |   |\n"
		+ "\t   |   |\n"
		+ "\t   |   |\n"
		+ "\t   |   |\n");
		
		//Prints the text below
		System.out.println("\\==========================/ ");
		System.out.println(" \\========================/ ");
		System.out.println("  \\======================/ ");
		System.out.println("   \\====================/ ");
		System.out.println("    \\==================/ ");
		System.out.println("     \\================/ ");
		System.out.println("      \\==============/ ");
		System.out.println("       \\============/ ");
		System.out.println("        \\==========/ ");
		System.out.println("         \\========/ ");
		System.out.println("          \\======/ ");
		System.out.println("           \\====/ ");
		System.out.println("            \\==/ ");
		System.out.println("             \\/ \n");
		
		//Calls the isPrime function and displays it
		System.out.println("\t   " + isPrime(num));
	}

}
/* Screen Dump

Enter number:
13
=========================== 
Is it prime? 
 

	   		|   |
	   		|   |
	   		|   |
	   		|   |
	   		|   |
	   		|   |
	   		|   |
	   		|   |
\==========================/ 
 \========================/ 
  \======================/ 
   \====================/ 
    \==================/ 
     \================/ 
      \==============/ 
       \============/ 
        \==========/ 
         \========/ 
          \======/ 
           \====/ 
            \==/ 
             \/ 

	   		true
*/ 