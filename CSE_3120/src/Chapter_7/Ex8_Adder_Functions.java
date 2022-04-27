package Chapter_7;

public class Ex8_Adder_Functions 
	{
	private int total_Points;
	private int attempt;
	private int rand_n1; 
	private int rand_n2;
	
		//Sets the amount of total_correct to 0 when called
		public  Ex8_Adder_Functions()
		{ 
			total_Points = 0;
		}
		
		//Provides a random number between 0-20 when called
		public int get_New_num_1()
		{
			rand_n1 = (int)(20 * Math.random() + 0.04); 
			return(rand_n1);
		}
		
		//Provides a random number between 0-20 when called
		public int get_New_num_2()
		{
			rand_n2 = (int)(20 * Math.random() + 0.04); 
			return(rand_n2);
		}
		
		//Returns 1 of 2 possible strings depending on the inputed values
		public String get_answer(int f, int s, int a)
		{
			String dis;
			int answer = (f + s);
			
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
		
		//Sets the amount of points earned based on the inputed amount of attempts
		public void set_points(int a)
		{
			attempt = a;
			
			switch(a)
			{
				case 1: 
				{
					total_Points += 5;
					break;
				}
				
				case 2: 
				{
					total_Points += 3;
					break;
				}
				
				case 3: 
				{
					total_Points += 1;
					break;
				}
				case 4: 
				{
					total_Points += 0;
					break;
				}
					
			}
		}
		
		//Returns the total_correct value
		public int get_Total()
		{
			return (total_Points);
			
		}
	}
