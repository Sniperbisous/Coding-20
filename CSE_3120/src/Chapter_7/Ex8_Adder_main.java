package Chapter_7;

import java.util.Scanner;

public class Ex8_Adder_main 
{

	public static void main(String[] args) 
	{
		int awnser, rand_n1, rand_n2, input_awn, n1, n2;
		
		awnser = 0;
		Ex8_Adder_Functions Attempt = new Ex8_Adder_Functions();
		
		  do 
		{
			 //Scans for users input
			 Scanner user = new Scanner(System.in);
			 
			 n1 = Attempt.New_num_1(); 
			 n2 = Attempt.New_num_2(); 
			 
			 System.out.print(n1 + " + " + n2 + " = ");
			
			 //Stores users input
			input_awn = user.nextInt();
			
			System.out.println("your answer is " + Attempt.answer(n1, n2, input_awn));
			
			
			
			
		}
		while(awnser != 999);
		
		


	}

}
