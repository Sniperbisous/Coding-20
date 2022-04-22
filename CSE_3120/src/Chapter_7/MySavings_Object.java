/*
Program: MySavings_Object.java         Last Date of this Revision: April 22, 2022 




Purpose: Provides the Ex1_MySaving_gui.java functions to call and run.

Author: Aiden Storer 
School: CHHS
Course: Computer Science 20
 

*/
package Chapter_7;

import java.util.Scanner;

public class MySavings_Object 
{
	//Sets total as a double
	public double total;
	
	public MySavings_Object()
	{
		//Sets total as 0
		total = 0;
	}
	
	public void addPenny()
	{
		//Adds 0.01 to the total
		total = total + 0.01;
	}
	
	public void addNickel()
	{
		//Adds 0.05 to the total
		total = total + 0.05;
	}
	
	public void addDime()
	{
		//Adds 0.10 to the total
		total = total + 0.10;
	}
	
	public void addQuarter()
	{
		//Adds 0.25 to the total
		total = total + 0.25;
	}
	
	public void remove(double remv)
	{
		//Removes any amount from the total
		total = total - remv;
	}
	
	
	public double showTotal()
	{
		//Returns the total value
		return total;
	}
	
	public String toString()
	{
		//Sets S_Total
		String S_Total;
		
		//Rounds the total to 2 decimal points
		total = Math.round(total * 100.00)/100.00;
		
		//Assigns the sentence "Your bank account has a total of: $" and the total variable to S_Total
		S_Total = ("Your bank account has a total of: $" + total);
		
		//Returns S_Total
		return S_Total;
		
	}
	public static void main(String[] args) 
	{
		
	}

}
