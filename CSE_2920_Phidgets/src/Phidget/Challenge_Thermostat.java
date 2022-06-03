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
	      
	      double setTemp = 21;
	      double temp;
	      boolean greenbutton_pressed_last_run, redbutton_pressed_last_run;
	      int Count = 0;
	      //Use your Phidgets | This code will print humidity and temperature read by the sensor every 150ms.
	      while(true)
	      {
	    	  
	    	  
	    	  temp = temperatureSensor.getTemperature(); 
	    	  
	    	  if(greenButton.getState() == true)
	    	  {
	    		 setTemp += 1;
	    	  }
	    	  
	    	  else if(redButton.getState() == true)
	    	  {
	    		 setTemp -= 1;
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
	    	  Count += 1;
	    	  
	    	  while(Count == 1000)
	    	  {
	    		 
	    		  System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" + "\t" + "Set temperature " + setTemp + " °C");
	          
	    		  Count = 0;
	    	  }
	    	  Thread.sleep(10);
	       }
	      
	      
		
	     
   	  
   	 

	}

}
