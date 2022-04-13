/*
Program: Ex5_AddCoins.java         Last Date of this Revision: March 30, 2022  






Purpose: To prompt the user for their amount of each coin and then calculate the total dollar amount. 

Author: Aiden Storer 
School: CHHS
Course: Computer Science 20
 

*/
package Chapter_7;

public class MySavings_Object 
{
	public double total;
	
	public MySavings_Object()
	{
		total = 0;
	}
	
	public MySavings_Object(double s)
	{
		total = s;
	}
	
	public void addPenny()
	{
		total =+ 0.01;
	}
	
	public void addNickel()
	{
		total =+ 0.05;
	}
	
	public void addDime()
	{
		total =+ 0.10;
	}
	
	public void addQuarter()
	{
		total =+ 0.25;
	}
	public void removePenny()
	{
		total =- 0.01;
	}
	
	public void removeNickel()
	{
		total =- 0.05;
	}
	
	public void removeDime()
	{
		total =- 0.10;
	}
	
	public void removeQuarter()
	{
		total =- 0.25;
	}
	
	public double showTotal()
	{
		return total;
	}
	
	public String toString()
	{
		String S_Total;
		S_Total = "Your bank account has a total of: $" + total;
		return S_Total;
		
	}
	public static void main(String[] args) 
	{
		
	}

}
/* Screen Dump
 * 
Enter coins 

Quarters: 45
Dimes: 2
Nickels: 3
Pennies: 2


=========================== 
Total: $11.62

*/ 