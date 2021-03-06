/*
Program: Review_Circle_Part4.java         Last Date of this Revision: April 7, 2022 





Purpose: Create methods to be run outside of this class 

Author: Aiden Storer 
School: CHHS
Course: Computer Science 20
 

*/
package Chapter_7;

import java.util.Scanner;

public class Circle 
{
	//Creates variable radius
	private double radius;
	
	//Creates and assigns the variable pi the value of 3.14159
	private double pi = 3.14159;
	
	//Creates a constructor to assign a value to radius
	public Circle()
	{
		radius = 1;	
	}
	
	//Creates a constructor to change the assign value of radius at the start of the program
	public Circle(double r)
	{
		radius = r;	
	}
	
	//Creates a constructor to change the assign value of radius at any point
	public void setRadius(double newRadius)
	{
		radius = newRadius;
	}
	
	//Creates a method to return the value of radius
	public double getRadius()
	{
		return(radius);
	}
	
	//Creates a method to calculate and return the circumference of the provided radius
	public double circumference()
	{
		double Circumference;
		Circumference = (2 * pi) * radius;
		return(Circumference);
	}
	
	/* ===========================================================================================================================================================================
	 Part 3
	 
	Creates a method to display the area formula*/
	public String displayAreaFormula()
	{
		String Area;
		
		Area = "Pi * (radius * radius)";
		return(Area);
	}
	
	/* ===========================================================================================================================================================================
	 Part 4
	 
	Creates a method to compare the radius of two objects*/
	public boolean equals(Object c)
	{
		Circle testObj = (Circle)c;
		
		
		if (testObj.getRadius() == radius) 
		{
			return (true);	
		}
		
		else
		{
			return(false);
		}
	}
	 
	//Creates a method to compare the radius of a object and a input(overrides original equals(Object c) class)
	public boolean equals(Object c, int r)
	{
		Circle test_1 = (Circle)c;
		
		
		
		if (test_1.getRadius() == r) 
		{
			return (true);	
		}
		
		else
		{
			return(false);
		}
	}
	
	//Creates a method to print the radius as a string
	public String toString()
	{
		String circleString;
		
		circleString = "Circle has radius " + radius;
		return(circleString);
	}
	
	//Creates a method to print the inputed radius as a string(overriding toString())
	public String toString(int r)
	{
		String circleString;
		radius = r;
		circleString = "Circle has radius " + radius;
		return(circleString);
	}
	
	public static void main(String[] args) 
	{
		

	}

}
