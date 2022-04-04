/*
Program: Review_Circle_Part1.java         Last Date of this Revision: April , 2022 






Purpose:  

Author: Aiden Storer 
School: CHHS
Course: Computer Science 20
 

*/
package Chapter_7;

public class Review_Circle_Part1 
{
	
	public static void main(String[] args) 
	{
		Circle point = new Circle();
		
		point.setRadius(3);
		
		System.out.println("circle radius: " + point.getRadius());
		System.out.println("circle circumference: " + point.circumference());
	}

}
