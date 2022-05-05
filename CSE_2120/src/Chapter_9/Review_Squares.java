package Chapter_9;

public class Review_Squares 
{

	public static void main(String[] args) 
	{
		int[] squares = new int[5];
		
		for (int i = 0; i < 5; i++)
		{
			squares[i] = (i * i);
			int element = i + 1;
			System.out.println("element " + element + " = " + squares[i]);
		}
		

	}

}
