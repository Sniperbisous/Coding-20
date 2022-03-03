/*

Program: Review_SurfsUp_Part_1.java          Last Date of this Revision: March 2, 2022


Purpose: Displays "Great day for surfing!" when the wave is higher than 6 ft.

Author: Aiden Storer 
School: CHHS
Course: Computer Science 20
 

*/

package Chapter_4;

import java.util.Scanner;

public class Review_SurfsUp_Part_1 
{

	public static void main(String[] args) 
	{
		
			//Scans for users input
			Scanner wave = new Scanner(System.in);
				
			//Classifies users input as int
			int wave_h;
				
			//Displays "How high is your wave in feet:"
			System.out.println("How high is your wave in feet:");
				
			//Stores users input
			wave_h = wave.nextInt();
				
			//Calculates if the height of the wave above 6 ft and displays "Great day for surfing!" if it is true
			if(wave_h >= 6)
				{
					System.out.println("Great day for surfing!");

				}
		
		
		
	}

}

/* Screen Dump

How high is your wave in feet:
6
Great day for surfing!
 
 */ 