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
        DigitalInput greenButton = new DigitalInput();


        //Address
        redButton.setIsHubPortDevice(true);
        greenButton.setIsHubPortDevice(true);
        redButton.setHubPort(0);
        greenButton.setHubPort(5);
        

        //Event | Event code runs when data input from the sensor changes. The following event is a state change event. The code will listen to the button (Digital Input Object) and only run the contain code when the button is pressed or released (state changes).
        redButton.addStateChangeListener(new DigitalInputStateChangeListener() 
        {
            public void onStateChange(DigitalInputStateChangeEvent e) 
            {
            	if (e.getState() == true)
            	{
                System.out.println("Red State: " + "pressed" );
            	}
            	
            	else 
            	{
                System.out.println("Red State: " + "not pressed");
            	}
            }
        });
        
        greenButton.addStateChangeListener(new DigitalInputStateChangeListener() 
        {
            public void onStateChange(DigitalInputStateChangeEvent g ) 
            {
            	if (g.getState() == true)
            	{
                System.out.println("Green State: " + "pressed");
            	}
            	
            	else 
            	{
                System.out.println("Green State: " + "not pressed");
            	}
            }
        });

        //Open
        redButton.open(1000);
        greenButton.open(1000);

        //Keep program running
        while(true) 
        {
            Thread.sleep(1000);
        }
    }
}
  
		

	


