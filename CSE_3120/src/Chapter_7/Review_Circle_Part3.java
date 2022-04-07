/*
Program: Review_Circle_Part3.java         Last Date of this Revision: April 7, 2022 






Purpose: To create an object connected to Circle.java and print "The formula for the area of a circle is:" + the return of the function displayAreaFormula()

Author: Aiden Storer 
School: CHHS
Course: Computer Science 20
 

*/
package Chapter_7;

public class Review_Circle_Part3 
{

	public static void main(String[] args) 
	{
		//Creates a new object connected to Circle.java named point with the input of 2
		Circle point = new Circle();
		
		//Prints "Circle radius:" and the getRadius() return of function from the object point
		System.out.println("The formula for the area of a circle is: " + point.displayAreaFormula());
	}

}
/* Screen Dump

The formula for the area of a circle is: Pi * (radius * radius)

*/