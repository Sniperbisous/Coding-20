package Chapter_9;

public class Review_Reverse_Functions 
{
	
private int[] Count = new int[10];
	
	public Review_Reverse_Functions()
	{
		for(int i = 0; i < 10; i++)
		{
			Count[i] = i;
		}
	}
	
	public int count_num(int i)
	{
		return Count[i];
	}
	
	public String toString() 
	{
		String Count_down = " ";
		String Next_Count = "";
		for(int i = 9; i >= 0; i--)
		{
			Count_down = (Count_down + Count[i] + "  ");
			//Next_Count = Count_down;
		}
		
		return Count_down;
		
	}
	
	public static void main(String[] args) 
	{
		
		
	}

}
