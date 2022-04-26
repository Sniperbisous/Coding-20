package Chapter_7;

import java.util.Scanner;

public class Ex8_Adder_main 
{

	public static void main(String[] args) 
	{
		//Scans for users input
		Scanner user = new Scanner(System.in);
		
		int awnser, rand_n1, rand_n2, input_awn, n1, n2, attempts;
		//input_awn = 0;
		awnser = 0;
		Ex8_Adder_Functions Attempt = new Ex8_Adder_Functions();
		Ex8_Adder_Functions Attempt1 = new Ex8_Adder_Functions();
		
		  do 
		{
			 attempts = 0;
			 
			 n1 = Attempt.get_New_num_1(); 
			 n2 = Attempt.get_New_num_2(); 
			 
			   
			  do{
				  attempts += 1;
				  System.out.print(n1 + " + " + n2 + " = ");
			
				  //Stores users input
				  input_awn = user.nextInt();
			 
			
				  System.out.println("your answer is " + Attempt.get_answer(n1, n2, input_awn));
				  
				  System.out.println("test:attempts " + attempts);
				  
			  }while (input_awn != (n1 + n2) && input_awn != 999 && attempts < 3);
			
			  if(Attempt.get_answer(n1, n2, input_awn) != Attempt.get_answer(1, 1, 2))
			  {
				  attempts += 1;
			  }
			  
			  
			Attempt.Attempt(attempts);
			
			System.out.println(Attempt.get_Total());
			
		}
		while(input_awn != 999);
		
		


	}

}
