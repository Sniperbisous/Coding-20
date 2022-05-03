
package Class_Example_4;



public class Example_arrays {

	public static void main(String[] args) 
	{
		int[] outcomes = new int[10];
		int outcome;
		
		for(int i = 0; i < 100; i++)
		{
			outcome = (int)(10 * Math.random());
			outcomes[outcome] += 1;
		}
		
		
		//Display what is in the array
		for(int i = 0; i < 10; i++)
		{
			System.out.print(outcomes[i]);
			System.out.print(" ");
		}

	}

}
