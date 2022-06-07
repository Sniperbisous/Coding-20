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
		        int Red_Clicks = 0;
		        int Green_Clicks = 0;
		        
				  int greenButton_click_up = 0;
				  int greenButton_click_down = 0;
				  
				  int green_clicks = 0;
				  int click = 0;
				  int Clicks_past_amount = 0;
		        
		        //Event | Event code runs when data input from the sensor changes. The following event is a state change event. The code will listen to the button (Digital Input Object) and only run the contain code when the button is pressed or released (state changes).
		        redButton.addStateChangeListener(new DigitalInputStateChangeListener() 
		        {
		        	
		        	
		            public void onStateChange(DigitalInputStateChangeEvent e) 
		            {
		            	
		            	if (e.getState() == true)
		            	{
		            	red_clicks += 1;
		            	}
		            	
		            	
		            	
		            	
		            	//int redButton_click_up = 0;
		            	//int redButton_click_down = 0;
		            	/*
		            	 * 
		            	 * boolean red_button_state, last_red_button_state;
		            	 if(e.getState() == true)
		            	 {
		            		 red_button_state = true;
		            		// redButton_click_up += 2;
		            		 //redButton_click_down += 1;
		            		 last_red_button_state = true;
		            	 } 
		         
		            	 else 
		            	 {
		            		//greenLED.setState(true);
		            		 red_button_state = false;
		            		 
		            		 if (last_red_button_state =! red_button_state)
		            		 {
		            			 red_clicks = 1;
		            		 }
		            	}
		            		 */
		                //Record button state to turn on/off the red LED
		                turnRedLEDOn = e.getState();
		            	 
		            }
		          
		        });
		         

		        //Event | Event code runs when data input from the sensor changes. The following event is a state change event. It will listen to the button (Digital Input Object) and only run the contain code when the button is pressed or released (state changes).
		        greenButton.addStateChangeListener(new DigitalInputStateChangeListener() 
		        {
		            public void onStateChange(DigitalInputStateChangeEvent e) 
		            {
		            	int Green_Clicks = 1;
		                //Record button state to turn on/off the green LED
		                turnGreenLEDOn = e.getState();
		                
		            }
		        });

		        //Open
		        redLED.open(1000);
		        greenLED.open(1000);
		        redButton.open(1000);
		        greenButton.open(1000);
		        
		       /* int redButton_click_up = 0;
		  		  int redButton_click_down = 0;
		  		  int greenButton_click_up = 0;
		  		  int greenButton_click_down = 0;
		  		  int red_clicks = 0; 
		  		  int green_clicks = 0;
		  		  int clicks = 0;
		  		  int Clicks_past_amount = 0;
		  		*/
		        //Use your Phidgets | In the button events you recorded the Button State. Here we will use that data to turn on/off the LEDs
		        while(true) 
		        {

		  			  /*
		  		         if(redLED.getState() == true)
		  		         {
		  		           
		  		           redButton_click_up += 2;
		  		           redButton_click_down += 1;
		  		         } 
		  		         
		  		         else 
		  		         {
		  		            
		  		            
		  		            red_clicks = (redButton_click_up - redButton_click_down);
		  		            if (red_clicks > 0)
		  		            {
		  		            	clicks += 1;
		  		            }
		  		            
		  		            else 
		  		            {
		  		            	clicks += 0;	
		  		            }
		  		            redButton_click_up = 0;
		  		        	redButton_click_down = 0;
		  		        	
		  		        	
		  		         }

		  		         if(greenLED.getState() == true)
		  		         {
		  		        	 
		  		        	 greenButton_click_up += 2;
		  			         greenButton_click_down += 1;
		  		        	 
		  		         }
		  		         
		  		         else 
		  		         {
		  		             
		  		            
		  		            green_clicks = (greenButton_click_up - greenButton_click_down);
		  		            if (green_clicks > 0)
		  		            {
		  		            	clicks += 1;
		  		            }
		  		            
		  		            else 
		  		            {
		  		            	clicks -= 0;	
		  		            }
		  		            
		  		            greenButton_click_up = 0;
		  		        	greenButton_click_down = 0;
		  		         }
		  		         
		  		         greenLED.setState(false);
		  		         */
		        	/*
		        	 * click = red_clicks;
		        	
		        	
		  		         if((redLED.getState() == false && click != Clicks_past_amount) || (greenLED.getState() == false && click != Clicks_past_amount))
		  		         {
		  		         System.out.println("Clicks: " + click);
		  		         Clicks_past_amount = click;
		  		         }
		  		         
		  		        Thread.sleep(10);
		        	 */

		        	
		        	Clicks = Clicks + (red_clicks + green_clicks);
		            //turn red LED on based on red button input
		            redLED.setState(turnRedLEDOn);
		            //turn green LED on based on green button input
		            greenLED.setState(turnGreenLEDOn);
		            
		            System.out.println("Clicks = " + Clicks);
		            //sleep for 150 milliseconds 
		            Thread.sleep(150);
		      }
		        
	}
}
	
		
		  
/*
 * 
 * 
 * 
		  int redButton_click_up = 0;
		  int redButton_click_down = 0;
		  int greenButton_click_up = 0;
		  int greenButton_click_down = 0;
		  int red_clicks = 0; 
		  int green_clicks = 0;
		  int clicks = 1;
		  int Clicks_past_amount = 0;
		  while(true){
			  
		        
		            
		            else 
		            {
		            	clicks += 0;	
		            }
		            redButton_click_up = 0;
		        	redButton_click_down = 0;
		        	
		        	
		         }

		         if(greenButton.getState() == true)
		         {
		        	 redLED.setState(false);
		        	 greenButton_click_up += 2;
			         greenButton_click_down += 1;
		        	 
		         }
		         
		         else 
		         {
		             redLED.setState(true);
		            
		            green_clicks = (greenButton_click_up - greenButton_click_down);
		            if (green_clicks > 0)
		            {
		            	clicks += 1;
		            }
		            
		            else 
		            {
		            	clicks += 0;	
		            }
		            
		            greenButton_click_up = 0;
		        	greenButton_click_down = 0;
		         }
		         
		         
		             
		         if((redButton.getState() == true && clicks != Clicks_past_amount) || (greenButton.getState() == true && clicks != Clicks_past_amount))
		         {
		         System.out.println("Clicks: " + clicks);
		         Clicks_past_amount = clicks;
		         }
 * 
 */
