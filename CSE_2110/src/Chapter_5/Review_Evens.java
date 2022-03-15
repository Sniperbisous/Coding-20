/*
Program: Review_Evens.java         Last Date of this Revision: March 15, 2022



Purpose: Displays the even numbers between 1 and 20 

Author: Aiden Storer 
School: CHHS
Course: Computer Science 20
 

*/

package Chapter_5;

public class Review_Evens 
{

	public static void main(String[] args) 
	{
		//Sets num as an int
		int num;
		
		//Sets num to 0
		num = 0;
	
		
		do 
			{
		//increases num by 2
			 num += 2;
			 
		//displays num 
			 System.out.println("\t" + num + "\t|");
			 
			}
		//loops above code till num = 20
		while(num != 20);
		
		//displays a line 
		System.out.println("~~~~~~~~~~~~~~~~");
	}

}
/* Screen Dump

		2		|
		4		|
		6		|
		8		|
		10		|
		12		|
		14		|
		16		|
		18		|
		20		|
~~~~~~~~~~~~~~~~

 */ 