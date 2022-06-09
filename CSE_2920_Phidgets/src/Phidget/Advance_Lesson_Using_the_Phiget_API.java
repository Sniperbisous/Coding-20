package Phidget;
import com.phidget22.*;

public class Advance_Lesson_Using_the_Phiget_API 
{
	
	public static void main(String[] args) 
	{
		try {
			HumiditySensor ch = new HumiditySensor();
			ch.open(Phidget.DEFAULT_TIMEOUT);

			boolean Attached = ch.getAttached();
		
			ch.close();
			
			java.lang.String LibraryVersion = Phidget.getLibraryVersion();
			
			System.out.println("Status: " + Attached);
			System.out.println("LibraryVersion: " + LibraryVersion);
		}
		
		catch (PhidgetException ex) 
		{
			System.out.println("Failure: " + ex);
		}

	}

}
