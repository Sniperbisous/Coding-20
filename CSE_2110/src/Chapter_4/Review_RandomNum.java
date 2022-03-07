/*

Program: Review_Hurricane.java         Last Date of this Revision: March , 2022



Purpose: 

Author: Aiden Storer 
School: CHHS
Course: Computer Science 20
 

*/
package Chapter_4;

import java.util.Scanner;

public class Review_RandomNum 
{

	public static void main(String[] args) 
	{
		//Classifies variable Max_n, Min_n, Ran_n as a int
		int Max_n, Min_n, Fin;
		double Ran_n;
		//Scans for users input
		Scanner Max = new Scanner(System.in);
		Scanner Min = new Scanner(System.in);
				
		//Prompts user for the Max and min of the random number window
		System.out.println("What is the max and min number?");
				
		//Stores users input
		Max_n = Max.nextInt();
		Min_n = Min.nextInt();
		
		Ran_n = Math.random();
		Fin = (int)(Ran_n * Max_n) + Min_n;
		System.out.println("Number: " + Fin );
	}

}
/* Screen Dump



 */ 