/*
Program: Review_Reverse_Functions.java         Last Date of this Revision: May 10, 2022   




Purpose: To create, set and return values of the array Count to the class Review_Reverse_GUI.java

Author: Aiden Storer 
School: CHHS
Course: Computer Science 20
 
*/
package Chapter_9;

public class Review_Reverse_Functions 
{
	
private int[] Count = new int[10];
	
	//Creates a constructor to set all the values of the count array
	public Review_Reverse_Functions()
	{
		//loops and sets all element values in the Count array
		for(int i = 0; i < 10; i++)
		{
			Count[i] = i;
		}
	}
	
	//Returns the arrays values in a reverse order as a string 
	public String toString() 
	{
		//Initializes the Count_down variable 
		String Count_down = " ";
		
		//Starts a loop to determine the values of the array from back to front
		for(int i = 9; i >= 0; i--)
		{
			//Adds each value to the string 
			Count_down = (Count_down + Count[i] + "  ");
			
		}
		
		//Returns the final string of all the numbers
		return Count_down;
	}
	
	public static void main(String[] args) 
	{
		
		
	}

}
