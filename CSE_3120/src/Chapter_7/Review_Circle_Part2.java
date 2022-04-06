/*
Program: Review_Circle_Part2.java         Last Date of this Revision: April , 2022 




Purpose: Overwrites data in another class through the object point then runs and prints the result of other functions in point. 

Author: Aiden Storer 
School: CHHS
Course: Computer Science 20
 

*/
package Chapter_7;



public class Review_Circle_Part2 {

	public static void main(String[] args)
	{
		//Creates a new object connected to Circle.java named point with the input of 2
		Circle point = new Circle(2);
		
		//Prints "Circle radius:" and the getRadius() return of function from the object point
		System.out.println("Circle radius: " + point.getRadius());
		
		//Prints "Circle circumference:" and the circumference() return of function from the object point
		System.out.println("Circle circumference: " + point.circumference());
	}

}
/* Screen Dump
 
Circle radius: 2.0
Circle circumference: 12.56636

*/