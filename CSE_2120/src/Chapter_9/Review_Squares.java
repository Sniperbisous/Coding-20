/*
Program: review_Squares.java         Last Date of this Revision: May 9, 2022   




Purpose: To create an array of all the squares of 0-4, then display each in order.

Author: Aiden Storer 
School: CHHS
Course: Computer Science 20
 
*/
package Chapter_9;

public class Review_Squares 
{

	public static void main(String[] args) 
	{
		//Creates a new array that contains 5 elements
		int[] squares = new int[5];
		
		//Creates a loop to store and display the square of each number from 0-4
		for (int i = 0; i < 5; i++)
		{
			//Squares the element and stores it 
			squares[i] = (i * i);
			
			//Counts how many elements have passed 
			int element = i + 1;
			
			//Prints the stored value along side which element it belongs to
			System.out.println("Element " + element + " = " + squares[i]);
		}
		

	}

}
/* Screen Dump
 
Element 1 = 0
Element 2 = 1
Element 3 = 4
Element 4 = 9
Element 5 = 16

*/