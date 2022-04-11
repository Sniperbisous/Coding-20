package Class_Example_2;

import java.text.NumberFormat;

public class Account 
{
	private Double balance;
	private customer cust;
	
	//NumberFormat nf = NumberFormat.class getCurrencyInstant();
	public Account(String fn, String ln, String add, double bal)
	{
		cust = new customer(fn, ln, add);
		balance = bal;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void setBalance(double b)
	{
		balance = b;
	}
	
	public void deposit(double amt) 
	{
		balance = balance + amt;
	}
	
	public void withDraw(double amt)
	{
		balance = balance - amt;
	}
	
	public String toString()
	{
		String acctStr;
		
		acctStr = cust.toString();
		//acctStr = acctStr + " Current balance is " + nf.format(balance);
		return (acctStr);
	}
	public static void main(String[] args) 
	{
		

	}

}
