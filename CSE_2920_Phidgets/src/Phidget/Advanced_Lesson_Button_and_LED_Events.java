package Phidget;

//Add Phidgets Library
import com.phidget22.*;

public class Advanced_Lesson_Button_and_LED_Events 
{
 //Turn on/off LEDs with Global Variables
		    static boolean turnRedLEDOn = false;
		    static boolean turnGreenLEDOn = false;
		    static int red_clicks = 0;
		    static int green_clicks = 0;
		    
	public static void main(String[] args) throws Exception 
	{
	
		        //Create
		        DigitalInput redButton = new DigitalInput();
		        DigitalInput greenButton = new DigitalInput();
		        DigitalOutput redLED = new DigitalOutput();
		        DigitalOutput greenLED = new DigitalOutput();

		        //Address
		        redButton.setHubPort(0);
		        redButton.setIsHubPortDevice(true);
		        greenButton.setHubPort(5);
		        greenButton.setIsHubPortDevice(true);
		        redLED.setHubPort(1);
		        redLED.setIsHubPortDevice(true);
		        greenLED.setHubPort(4); 
		        greenLED.setIsHubPortDevice(true);
		        
		        int Clicks = 0;
		        int Clicks_tug = 0;
		  
		        
		        //Event | Event code runs when data input from the sensor changes. The following event is a state change event. The code will listen to the button (Digital Input Object) and only run the contain code when the button is pressed or released (state changes).
		        redButton.addStateChangeListener(new DigitalInputStateChangeListener() 
		        {
		        	
		        	
		            public void onStateChange(DigitalInputStateChangeEvent e) 
		            {
		            	 
		            	 
		            	if (e.getState() == true)
		            	{
		            	red_clicks += 1;
		            	}
		            	
		            	turnGreenLEDOn = e.getState();
		            }
		          
		        });
		         

		        //Event | Event code runs when data input from the sensor changes. The following event is a state change event. It will listen to the button (Digital Input Object) and only run the contain code when the button is pressed or released (state changes).
		        greenButton.addStateChangeListener(new DigitalInputStateChangeListener() 
		        {
		            public void onStateChange(DigitalInputStateChangeEvent e) 
		            {
		            	
		              
		                if (e.getState() == true)
		                {
		                	green_clicks += 1;
		                }
		                
		                 //Record button state to turn on/off the red LED
		                turnRedLEDOn = e.getState();
		            }
		        });

		        //Open
		        redLED.open(1000);
		        greenLED.open(1000);
		        redButton.open(1000);
		        greenButton.open(1000);
		        
		       
		        //Use your Phidgets | In the button events you recorded the Button State. Here we will use that data to turn on/off the LEDs
		        while(Clicks_tug < 10 && Clicks_tug > (-10)) 
		        {
		        	int Last_clicks = Clicks;
		        	Clicks =  (red_clicks + green_clicks);
		        	Clicks_tug =  (red_clicks - green_clicks);
		        	
		            //turn red LED on based on red button input
		            redLED.setState(turnRedLEDOn);
		            
		            //turn green LED on based on green button input
		            greenLED.setState(turnGreenLEDOn);
		            
		            if (Last_clicks != Clicks)
		            {
		            System.out.println("Game Score: " + Clicks_tug + "\t(Total clicks  " + Clicks + ")");
		            }
		            
		            //sleep for 10 milliseconds 
		            Thread.sleep(10);
		      }
		        
		        redLED.setState(true);
		        greenLED.setState(true);
		        
		        //sleep for 150 milliseconds 
	            Thread.sleep(1000);
	            
	            redLED.setState(false);
		        greenLED.setState(false);
		        
		        //sleep for 150 milliseconds 
	            Thread.sleep(1000);
		        
		       
		        	if(Clicks_tug > 0)
		        	{
		        		redLED.setState(true);
		        		System.out.println("Red Wins");
		        	}
		        	
		        	else
		        	{
		        		greenLED.setState(true);
		        		System.out.println("Green Wins");
		        	}
		        
		        
	}
}
	
		
		  

