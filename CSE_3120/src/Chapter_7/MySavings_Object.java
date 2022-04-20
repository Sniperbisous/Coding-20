/*
Program: MySavings_Object.java         Last Date of this Revision: April 20, 2022   




Purpose: To prompt the user for their amount of each coin and then calculate the total dollar amount. 

Author: Aiden Storer 
School: CHHS
Course: Computer Science 20
 

*/
package Chapter_7;

import java.util.Scanner;

public class MySavings_Object 
{
	public double total;
	
	public MySavings_Object()
	{
		total = 0;
	}
	
	public void addPenny()
	{
		total = total + 0.01;
	}
	
	public void addNickel()
	{
		total = total + 0.05;
	}
	
	public void addDime()
	{
		total = total + 0.10;
	}
	
	public void addQuarter()
	{
		total = total + 0.25;
	}
	
	public void remove(double remv)
	{
		total = total - remv;
	}
	
	
	public double showTotal()
	{
		return total;
	}
	
	public String toString()
	{
		String S_Total;
		total = Math.round(total * 100.00)/100.00;
		S_Total = ("Your bank account has a total of: $" + total);
		return S_Total;
		
	}
	public static void main(String[] args) 
	{
		
	}

}
/* Screen Dump
 
 
 
*/ 