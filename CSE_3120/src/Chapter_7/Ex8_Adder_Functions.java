package Chapter_7;

public class Ex8_Adder_Functions 
	{
	private int total_correct;
	private int attempt;
	private int rand_n1; 
	private int rand_n2;
		public  Ex8_Adder_Functions()
		{
			total_correct = 0;
		}
		
		public int get_New_num_1()
		{
			int rand_n1;
			rand_n1 = (int)(20 * Math.random() + 0.04); 
			return(rand_n1);
		}
		
		public int get_New_num_2()
		{
			
			rand_n2 = (int)(20 * Math.random() + 0.04); 
			return(rand_n2);
		}
		
		public String get_answer(int f, int s, int a)
		{
			String dis;
			int answer = (f + s);
			boolean true_false = (a == answer); 
			if (a == answer)
			{
				dis = "Your answer is true. Here is another question.";
			}
			
			else 
			{
				dis = "Your answer is false. Enter another answer.";
			}
			return (dis);
			
		}
		
		public void Attempt(int a)
		{
			attempt = a;
			
			switch(a)
			{
				case 1: 
				{
					total_correct += 5;
					break;
				}
				
				case 2: 
				{
					total_correct += 3;
					break;
				}
				
				case 3: 
				{
					total_correct += 1;
					break;
				}
				case 4: 
				{
					total_correct += 0;
					break;
				}
					
			}
		}
		public int get_Total()
		{
			return (total_correct);
			
		}
	}
