package Phidget;

//Add Phidgets Library
import com.phidget22.*;

public class Advanced_Lesson_Button_Events 
{
 //Handle Exceptions
	public static void main(String[] args)  throws Exception
	{

       
        //Create
        DigitalInput redButton = new DigitalInput();

        //Address
        redButton.setIsHubPortDevice(true);
        redButton.setHubPort(0);

        //Event | Event code runs when data input from the sensor changes. The following event is a state change event. The code will listen to the button (Digital Input Object) and only run the contain code when the button is pressed or released (state changes).
        redButton.addStateChangeListener(new DigitalInputStateChangeListener() 
        {
            public void onStateChange(DigitalInputStateChangeEvent e) 
            {
            	if (e.getState() == true)
            	{
                System.out.println("State: " + "pressed");
            	}
            	
            	else 
            	{
                System.out.println("State: " + "not pressed");
            	}
            }
        });

        //Open
        redButton.open(1000);

        //Keep program running
        while (true) {
            Thread.sleep(150);
        }
    }
}
  
		

	

