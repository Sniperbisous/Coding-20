package Chapter_7;

public class Ex8_Adder_Functions 
	{
	private int total_correct;
	private int attempt;
	private int rand_n1, rand_n2;
	
		public  Ex8_Adder_Functions()
		{
			total_correct = 0;
		}
		
		public int New_num_1()
		{
			int rand_n1;
			rand_n1 = (int)(20 * Math.random() + 0.04); 
			return(rand_n1);
		}
		
		public int New_num_2()
		{
			
			rand_n2 = (int)(20 * Math.random() + 0.04); 
			return(rand_n2);
		}
		
		public Boolean answer(int f, int s, int a)
		{
			int answer = (f + s);
			boolean true_false = (a == answer); 
			
			return (true_false);
			
		}
		
		public void Attempt(int a)
		{
			attempt = a;
			
			switch(a)
			{
				case 1: 
				{
					total_correct =+ 5;
				}
				
				case 2: 
				{
					total_correct =+ 3;
				}
				
				case 3: 
				{
					total_correct =+ 1;
				}
			}
		}
		public int Total()
		{
			return (total_correct);
			
		}
	}
