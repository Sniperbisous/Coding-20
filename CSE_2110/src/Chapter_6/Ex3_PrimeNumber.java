

package Chapter_6;

import java.util.Scanner;

public class Ex3_PrimeNumber 
{
	
	//When called Calculates whether the number is prime
	public static Boolean isPrime(int num)
	{
		//Sets div, Pnum, prime and NewP as int variables
		int  div, Pnum, prime, NewP;
		
		//Sets isPrime as a boolean variable
		Boolean isPrime;
		
		//Gives div the value of 1
		div = 1;
		
		//Gives prime the value of 0
		prime = 0;
		
		//Starts a do-while loop
		do
		{
			System.out.println("=========================== ");
			Pnum = num % div;
			System.out.println("divder " + div);
			div += 1;
			System.out.println("remaining result " + Pnum);
			switch(Pnum)
			{
				case 0:
				{
					prime += 1;
					System.out.println(" +1" );
				}
			}
			System.out.println("0 remaining counter: " + prime);
			NewP = prime;
		} while (div <= num);
		
		
		isPrime = (NewP == 2);
		return isPrime;
	}
	
	public static void main(String[] args)
	{
	//Scans for users input
	Scanner user = new Scanner(System.in);
	System.out.println("enter number");
		int num = user.nextInt();
		System.out.println("Is it prime? " + isPrime(num));
	}

}
