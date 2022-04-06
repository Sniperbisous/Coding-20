/*
Program: Review_Circle_Part4.java         Last Date of this Revision: April , 2022 




Purpose:  

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
		
		Boolean equals = point1.equals(point2, 2);
		System.out.print(equals);
		

	}

}
