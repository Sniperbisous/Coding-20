package Phidget;

//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;
		
public class Lesson_3_Button_LED 
{

	public static void main(String[] args) throws Exception
	{

		 //Create | Create objects for your buttons and LEDs.
		  DigitalInput redButton = new DigitalInput();
		  DigitalOutput redLED = new DigitalOutput();
		  DigitalInput greenButton = new DigitalInput();
		  DigitalOutput greenLED = new DigitalOutput();

		  //Address | Address your four objects which lets your program know where to find them.
		  redButton.setHubPort(0);
		  redButton.setIsHubPortDevice(true);
		  redLED.setHubPort(1);
		  redLED.setIsHubPortDevice(true);
		  greenButton.setHubPort(5);
		  greenButton.setIsHubPortDevice(true);
		  greenLED.setHubPort(4);
		  greenLED.setIsHubPortDevice(true);

		  //Open | Connect your program to your physical devices.
		  redButton.open(1000);
		  redLED.open(100);
		  greenButton.open(1000);
		  greenLED.open(100);

		  //Use your Phidgets | This code will turn on the LED when the matching button is pressed and turns off the LED when the matching button is released. The sleep function slows down the loop so the button state is only checked every 150ms.
		  
		 
		  int redButton_click_up = 0;
		  int redButton_click_down = 0;
		  int greenButton_click_up = 0;
		  int greenButton_click_down = 0;
		  int red_clicks = 0; 
		  int green_clicks = 0;
		  int clicks = 1;
		  int Clicks_past_amount = 0;
		  while(true){
			  
		         if(redButton.getState() == true)
		         {
		           
		           redButton_click_up += 2;
		           redButton_click_down += 1;
		          greenLED.setState(false);
		           
		         } 
		         
		         else 
		         {
		            greenLED.setState(true);
		            
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
		         
		         
		        Thread.sleep(10);
		  }
	}
		  
}

