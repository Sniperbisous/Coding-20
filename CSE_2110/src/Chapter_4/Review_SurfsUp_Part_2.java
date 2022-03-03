/*

Program: Review_SurfsUp_Part_2.java          Last Date of this Revision: March 3, 2022

Purpose: To display "Great day for surfing!" when the input wave high is higher than 6 and "Go body boarding!" when it is less than 6

Author: Aiden Storer 
School: CHHS
Course: Computer Science 20
 

*/
package Chapter_4;

import java.util.Scanner;

public class Review_SurfsUp_Part_2 
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
		
		//And go body boarding if false
		else 
		{
			System.out.println("Go body boarding!");
		}
		
	}

}

/* Screen Dump

How high is your wave in feet:
6
Great day for surfing!


How high is your wave in feet:
2
Go body boarding!
 */ 