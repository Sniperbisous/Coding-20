/*
Program: Review_NumberSum.java         Last Date of this Revision: March 15, 2022



Purpose: Displays the even numbers between 1 and 20 

Author: Aiden Storer 
School: CHHS
Course: Computer Science 20
 

*/
package Chapter_5;

import java.util.Scanner;

public class Review_NumberSum 
{

	public static void main(String[] args) 
	{
		
		//Sets numMax, num and sum as a int variable
		int numMax, num, sum;
	
		//Sets num as 1
		num = 1;
		
		//Sets sum as 0
		sum = 0;
	
		//Scans for users input
		Scanner user = new Scanner(System.in);
	
		//Prompts for the users input and stores it
		System.out.println("Input the max number: ");
		numMax = user.nextInt();
		
		//loops till num is larger than numMax
		while(num <= numMax)
		
		{
			//prints num and a line
			System.out.println("=============");
			System.out.println(num);
			
			//Adds num to the sum and adds 1 to num
			sum += num;
			num += 1;			
			
		}
		
		//Displays the sum 
		System.out.println("The sum of the numbers is: "+ sum);
		
	}

}
/* Screen Dump

Input the max number: 
4
=============
1
=============
2
=============
3
=============
4
The sum of the numbers is: 10

*/ 