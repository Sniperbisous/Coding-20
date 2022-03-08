
package Chapter_4;

import java.util.Scanner;

public class Grade_Exercise_5 
{

	public static void main(String[] args) 
	{
		//Scans for users input
		Scanner user = new Scanner(System.in);
				
		//Sets pri_per and copies as a double variable
		int input_per; 
		char output_let;
						
		//Prompts user for the amount of copies to be printed
		System.out.println("What is the percentage: \n %");
						
		//Stores users input amount
		input_per = user.nextInt();
		
		//Calculates what output_let is based on which range the input percentage fall into 
		if (copies <= 100 && copies >= 90)
				{
					
			output_let = A;
						
				}
				
		else if (copies <= 89 && copies >= 80)
			{
			
				pri_per = 0.28;
					
			}
				
		else if (copies <= 79 && copies >= 70)
			{
			
				pri_per = 0.27;
				
			}
				
		else if (copies <= 69 && copies >= 60)
			{

				pri_per = 0.26;
			
			}
		
		else 
			{

				pri_per = 0.25;
			
			}
	}

}
