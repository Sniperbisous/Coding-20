/*
Program: Review_Circle_Part1.java         Last Date of this Revision: April 5, 2022 





Purpose: To call the methods in circle.java to test if they are working by inputing the radius variable as 3 then printing the results  

Author: Aiden Storer 
School: CHHS
Course: Computer Science 20
 

*/
package Chapter_7;

public class Review_Circle_Part1 
{
	
	public static void main(String[] args) 
	{
		//Creates a new object connected to Circle.java named point
		Circle point = new Circle();
		
		//Calls the function setRadius with an input of 3
		point.setRadius(3);
		
		//Prints "Circle radius:" and the getRadius() return of function from the object point
		System.out.println("Circle radius: " + point.getRadius());
		
		//Prints "Circle circumference:" and the circumference() return of function from the object point 
		System.out.println("Circle circumference: " + point.circumference());
	}

}
/* Screen Dump

Circle radius: 3.0
Circle circumference: 18.849539999999998

*/