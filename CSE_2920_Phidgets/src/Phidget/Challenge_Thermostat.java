package Phidget;

import com.phidget22.DigitalInput;
import com.phidget22.DigitalOutput;
import com.phidget22.TemperatureSensor;

public class Challenge_Thermostat 
{

	public static void main(String[] args) throws Exception
	{
		//Create | Here you've created a HumiditySensor and a TemperatureSensor object for your Humidity Phidget. This allows you to access both temperature and humidity data from your Phidget
	      TemperatureSensor temperatureSensor = new TemperatureSensor();
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
		  
	      //Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000 to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception occur.
	      temperatureSensor.open(1000);
	      redButton.open(1000);
		  redLED.open(100);
		  greenButton.open(1000);
		  greenLED.open(100);
	      
		  int redButton_click_up = 0;
		  int redButton_click_down = 0;
		  int greenButton_click_up = 0;
		  int greenButton_click_down = 0;
		  int red_clicks = 0; 
		  int green_clicks = 0;
		  int clicks = 0;
		  int Clicks_past_amount = 0;
	      double setTemp = 21;
	      double temp;
	      boolean greenbutton_pressed_last_run, redbutton_pressed_last_run;
	      int Count = 0;
	      
	      System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" + "\t" + "Set temperature " + setTemp + " °C");
	        
	      //Use your Phidgets | This code will print humidity and temperature read by the sensor every 150ms.
	      while(true)
	      {
	    	  temp = temperatureSensor.getTemperature(); 
	    	  
	    	  if(redButton.getState() == true)
		         {
		           
		           redButton_click_up += 2;
		           redButton_click_down += 1;
		         } 
		         
		         else 
		         {
		          
		            red_clicks = (redButton_click_up - redButton_click_down);
		            if (red_clicks > 0)
		            {
		            	setTemp -= 1;
		            }
		            redButton_click_up = 0;
		        	redButton_click_down = 0;
		        	
		         }

		         if(greenButton.getState() == true)
		         {
		        	 
		        	 greenButton_click_up += 2;
			         greenButton_click_down += 1;
		        	 
		         }
		         
		         else 
		         {
		            
		            green_clicks = (greenButton_click_up - greenButton_click_down);
		            if (green_clicks > 0)
		            {
		            	 setTemp += 1;
		            }

		            greenButton_click_up = 0;
		        	greenButton_click_down = 0;
		         }
	    	  
	    	  
	    	  if (temp < (setTemp + 2) && temp > (setTemp - 2))
	    	  {
	    		  greenLED.setState(true);
	    		  redLED.setState(false);
	    	  }
	    	  
	    	  else 
	    	  {
	    		  greenLED.setState(false);
	    		  redLED.setState(true);
	    	  }
	    	  Count += 10;
	    	  
	    	  while(Count == 6500)
	    	  {
	    		 
	    		  System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" + "\t" + "Set temperature " + setTemp + " °C");
	          
	    		  Count = 0;
	    	  }
	    	  Thread.sleep(10);
	       }
	}

}
