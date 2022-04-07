/*
Program: Review_Circle_Part4.java         Last Date of this Revision: April 7, 2022 




Purpose: To overwrite the original input for the functions equals and toString from Circle.java 

Author: Aiden Storer 
School: CHHS
Course: Computer Science 20
 

*/
package Chapter_7;

public class Review_Circle_Part4 
{

	public static void main(String[] args) 
	{
		//Creates a new object connected to Circle.java named point with the input of 2
		Circle point1 = new Circle();
		
		//Creates a new object connected to Circle.java named point with the input of 2
		Circle point2 = new Circle(4);
		
		//Creates a new object connected to Circle.java named point with the input of 2
		Circle point3 = new Circle(5);
		
		//Runs the equal function with the input of 2 and object point2 then stores the return as a variable that is then displayed
		Boolean equals = point1.equals(point2, 2);
		System.out.println("Are the two radiuses equal: " + equals);
		
		//Runs the toString function with the input of 2 then stores the return as a variable that is then displayed
		String toString = point1.toString(2);
		System.out.print("What is the radius: " + toString);
		
		

	}

}
/* Screen Dump

Are the two radiuses equal: false
What is the radius: Circle has radius 2.0
*/