/*

Program: Review_Hurricane.java         Last Date of this Revision: March 7, 2022



Purpose: To display a hurricanes wind speeds based off of the inputed category value  

Author: Aiden Storer 
School: CHHS
Course: Computer Science 20
 

*/
package Chapter_4;

import java.util.Scanner;

public class Review_Hurricane 
{

	public static void main(String[] args) 
	{
		//Scans for users input
		Scanner Class = new Scanner(System.in);
		
		//Classifies variable Class_in as a int
		int Class_in;
		
		//Prompts user for the hurricane category
		System.out.println("What category is your hurricane?");
		
		//Stores users input
		Class_in = Class.nextInt();
		
		
		//Selects a case based off of inputed value and displays the speeds of a hurricane of that class
		switch(Class_in)
		{
			case 1: 
				System.out.println("Category 1: 74-95 mph or 64-82 kt or 119-153 km/hr");
			
				break;
			
			case 2:
				System.out.println("Category 2: 96-110 mph or 83-95 kt or 154-177 km/hr");
			
				break;
			
			case 3:
				System.out.println("Category 3: 111-130 mph or 96-113 kt or 178-209 km/hr");
			
				break;
			
			case 4:
				System.out.println("Category 4: 131-155 mph or 114-135 kt or 210-249 km/hr");
			
				break;
			
			case 5:
				System.out.println("Category 5: Greater than 155 mph or 135 kt or 249 km/hr");
		
				break;
		}
		
	}

}
/* Screen Dump

What category is your hurricane?
1
Category 1: 74-95 mph or 64-82 kt or 119-153 km/hr
 
 
What category is your hurricane?
2
Category 2: 96-110 mph or 83-95 kt or 154-177 km/hr


What category is your hurricane?
3
Category 3: 111-130 mph or 96-113 kt or 178-209 km/hr


What category is your hurricane?
4
Category 4: 131-155 mph or 114-135 kt or 210-249 km/hr


What category is your hurricane?
5
Category 5: Greater than 155 mph or 135 kt or 249 km/hr
 */ 