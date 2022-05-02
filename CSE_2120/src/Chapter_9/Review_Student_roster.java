package Chapter_9;

import java.util.Scanner;

public class Review_Student_roster {

	public static void main(String[] args) 
	{
		//Scans for users input 
		Scanner user = new Scanner(System.in);
		int num_student = user.nextInt();
		String[] roster = new String[num_student];
		for (int i = 0; i <= num_student; i++)
		{
			String name = user.next();
			roster[i] = name;
		}
		
		

	}

}
