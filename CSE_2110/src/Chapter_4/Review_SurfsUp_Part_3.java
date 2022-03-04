/*

Program: Review_SurfsUp_Part_3.java          Last Date of this Revision: March 4, 2022

Purpose: To display "Great day for surfing!" when the input wave high is higher than 6, "Go body boarding!" when it is less than 6 and higher than 3, "Go for a swim." when it is less than 
3 but above 0 and "Whoa! What kind of surf is that?" if all other conditions prove false.
when it is less than 3.

Author: Aiden Storer 
School: CHHS
Course: Computer Science 20
 

*/
package Chapter_4;

import java.util.Scanner;

public class Review_SurfsUp_Part_3
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
				
		//If it is false it will then check to see the wave height and if it is between 3-6 it will display "Go body boarding!" if true
		else if(wave_h >= 3 && wave_h < 6)  
			{
				System.out.println("Go body boarding!");
			}
				
		//If the wave height is less than 3 but higher than 0 it displays "Go for a swim." 
		else if(wave_h < 3 && wave_h > 0)
			{
				System.out.println("Go for a swim.");
			}
		
		//If all previous conditions prove false displays "Whoa! What kind of surf is that?" 
		else 
			{
				System.out.println("Whoa! What kind of surf is that?");
			}
	}

}
/* Screen Dump

How high is your wave in feet:
6
Great day for surfing!


How high is your wave in feet:
4
Go body boarding!


How high is your wave in feet:
2
Go for a swim.


How high is your wave in feet:
0
Whoa! What kind of surf is that?
 */ 