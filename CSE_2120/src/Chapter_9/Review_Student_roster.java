/*
Program: Review_Student_roster.java         Last Date of this Revision: May 3, 2022   




Purpose: To create an array to store the amount of names of students inputed by the user and then display them. 

Author: Aiden Storer 
School: CHHS
Course: Computer Science 20
 
*/
package Chapter_9;


import java.util.Scanner;

public class Review_Student_roster 
{

	public static void main(String[] args) 
	{
		//Scans for users input 
		Scanner user = new Scanner(System.in);
		
		//Scans and stores amount of students in the array
		System.out.print("How many students do you have: ");
		int num_student = Integer.parseInt(user.nextLine());
		System.out.println("");
		
		//Creates the array 
		String[] roster = new String[num_student];
		
		//Fills out the array by looping every slot
		for (int i = 0; i < num_student; i++)
		{
			//Scans and stores the name of each student
			System.out.print("What is the name of student " + (i + 1) + ": ");
			String name = user.nextLine();
			System.out.println("");
			
			//Sets the name in each slot of the array
			roster[i] = name;
		}
		
		//Displays a line and "Students:"
		System.out.println("==================================================");
		System.out.println("Students:");
		
		//Displays each slot of the array
		for (int i = 0; i < num_student; i++)
		{
			//Creates a int variable to track which slot is being displayed
			int position = i + 1;
			
			//Displays each slot in the array
			System.out.println("");
			System.out.println(position + ". " + roster[i]); 
		}
	}
}
/* Screen Dump

How many students do you have: 2

What is the name of student 1: Aiden Storer

What is the name of student 2: Nat E

==================================================
Students:

1. Aiden Storer

2. Nat E


*/