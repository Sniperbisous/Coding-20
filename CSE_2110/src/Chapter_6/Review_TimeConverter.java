/*

Program: Review_TimeConverter.java         Last Date of this Revision: March 29, 2022 






Purpose: To prompt the user for their desired time conversion then perform the conversion based off of the selected conversion method. 

Author: Aiden Storer 
School: CHHS
Course: Computer Science 20
 

*/


package Chapter_6;

import java.util.Scanner;

public class Review_TimeConverter 
{
	//Runs all following code when min_to_hour is called
	public static int min_to_hour()
	{
		//Prints "Minutes to hours"
		System.out.println("\n" + "Minutes to hours");
		System.out.println("*************************** ");
		
		//sets min and h as int variable
		int min, h;
		
		//Scans for users input
		Scanner user = new Scanner(System.in);
		
		//Prints "Input number of min: "
		System.out.println("Input number of min: ");
		
		//Stores the user input
		min = user.nextInt();
		
		//Calculates h from min
		h = min / 60;
		
		//Returns the h variable
		return h;
	}
	
	//Runs all following code when hour_to_min is called
	public static int hour_to_min()
	{
		//Prints "Hours to minutes"
		System.out.println("\n" + "Hours to minutes");
		System.out.println("*************************** ");
		
		//sets min and h as int variable
		int min, h;
		
		//Scans for users input
		Scanner user = new Scanner(System.in);
		
		System.out.println("Input number of hours: ");
		
		//Stores the user input
		h = user.nextInt();
		
		//Calculates min from h
		min = h * 60;
		
		//Returns the min variable
		return min;
	}
	
	//Runs all following code when days_to_hours is called
	public static int days_to_hours()
	{
		//Prints "Days to hours"
		System.out.println("\n" + "Days to hours");
		System.out.println("*************************** ");
		
		//sets day and h as int variable
		int day, h;
		
		//Scans for users input
		Scanner user = new Scanner(System.in);
		System.out.println("Input number of days: ");
		
		//Stores the user input
		day = user.nextInt();
		
		//Calculates h from day
		h = day * 24;
		
		//Returns the h variable
		return h;
	}
	
	//Runs all following code when hours_to_days is called
	public static int hours_to_days()
	{
		//Prints "Hours to days"
		System.out.println("\n" + "Hours to days");
		System.out.println("*************************** ");
		
		//sets day and h as int variable
		int day, h;
		
		//Scans for users input
		Scanner user = new Scanner(System.in);
		System.out.println("Input number of hours: ");
		
		//Stores the user input
		h = user.nextInt();
		
		//Calculates day from h
		day = h / 24;
		
		//Returns the day variable
		return day;
	}
	
	
	public static void main(String[] args) 
	{
		//Sets choice
		int choice;
		
		//Scans for users input
		Scanner choices = new Scanner(System.in);
		
		//Prints the choices along with its assigned number
		System.out.println("1. Min to hours" + "\n2. Hours to min" + "\n3. days to hours" + "\n4. hours to days");
		choice = choices.nextInt();
		
		
		//Selects a case based on the value of the choice variable
		switch(choice)
		{
		
		case 1:
			{
				//Prints "The approximate number of hours is" along with the resulting number of the function min_to_hour
				System.out.println("The approximate number of hours is " + min_to_hour());
				break;
			}
		case 2:
			{
				//Prints "The approximate number of minutes is" along with the resulting number of the function hour_to_min
				System.out.println("The approximate number of minutes is " + hour_to_min());
				break;
			}
		case 3:
			{
				//Prints "The approximate number of hours is" along with the resulting number of the function days_to_hours
				System.out.println("The approximate number of hours is " + days_to_hours());
				break;
			}
		case 4:
			{
				//Prints "The approximate number of days is" along with the resulting number of the function hours_to_days
				System.out.println("The approximate number of days is " + hours_to_days());
				break;
			}
		}
	}

}
/* Screen Dump
 * 
1. Min to hours
2. Hours to min
3. days to hours
4. hours to days
1

Minutes to hours 
*************************** 
Input number of min: 
120
The approximate number of hours is 2


+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


1. Min to hours
2. Hours to min
3. days to hours
4. hours to days
2

Hours to minutes
*************************** 
Input number of hours: 
16
The approximate number of minutes is 960


+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


1. Min to hours
2. Hours to min
3. days to hours
4. hours to days
3

Days to hours
*************************** 
Input number of days: 
2
The approximate number of hours is 48


+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


1. Min to hours
2. Hours to min
3. days to hours
4. hours to days
4

Hours to days
*************************** 
Input number of hours: 
48
The approximate number of days is 2


*/ 