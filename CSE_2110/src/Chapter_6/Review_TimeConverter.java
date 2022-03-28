


package Chapter_6;

import java.util.Scanner;

public class Review_TimeConverter 
{

	public static int min_to_hour()
	{
		System.out.println("\n" + "Minutes to hours ");
		System.out.println("*************************** ");
		int min, h;
		
		//Scans for users input
		Scanner user = new Scanner(System.in);
		
		System.out.println("Input number of min: ");
		//Stores the user input
		min = user.nextInt();
		
		h = min / 60;
		return h;
	}
	
	public static int hour_to_min()
	{
		System.out.println("\n" + "Hours to minutes");
		System.out.println("*************************** ");
		int min, h;
		
		//Scans for users input
		Scanner user = new Scanner(System.in);
		
		System.out.println("Input number of hours: ");
		
		//Stores the user input
		h = user.nextInt();
		
		min = h * 60;
		return min;
	}
	
	public static int days_to_hours()
	{
		System.out.println("\n" + "Days to hours");
		System.out.println("*************************** ");
		
		int day, h;
		
		//Scans for users input
		Scanner user = new Scanner(System.in);
		System.out.println("Input number of days: ");
		
		//Stores the user input
		day = user.nextInt();
		
		h = day * 24;
		return h;
	}
	
	public static int hours_to_days()
	{
		System.out.println("\n" + "Hours to days");
		System.out.println("*************************** ");
		
		int day, h;
		
		//Scans for users input
		Scanner user = new Scanner(System.in);
		System.out.println("Input number of hours: ");
		
		//Stores the user input
		h = user.nextInt();
		
		day = h / 24;
		return day;
	}
	
	
	public static void main(String[] args) 
	{
		int min, h, d, choice;
		
		//Scans for users input
		Scanner choices = new Scanner(System.in);
		
		System.out.println("1. Min to hours" + "\n2. Hours to min" + "\n3. days to hours" + "\n4. hours to days");
		choice = choices.nextInt();
		
		
		switch(choice)
		{
		
		case 1:
			{
				
				System.out.println("The approximate number of hours is " + min_to_hour());
				break;
			}
		case 2:
			{
				
				System.out.println("The approximate number of minutes is " + hour_to_min());
				break;
			}
		case 3:
			{
				
				System.out.println("The approximate number of hours is " + days_to_hours());
				break;
			}
		case 4:
			{
				
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