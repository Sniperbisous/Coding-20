package Phidget;

//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class Practice_Hot_or_Cold 
{

	public static void main(String[] args) throws Exception
	{
		//Create | Here you've created a HumiditySensor and a TemperatureSensor object for your Humidity Phidget. This allows you to access both temperature and humidity data from your Phidget
	      TemperatureSensor temperatureSensor = new TemperatureSensor();
	      DigitalOutput greenLED = new DigitalOutput();
	      DigitalOutput redLED = new DigitalOutput(); 
	      
	    //Address | Address your four objects which lets your program know where to find them.
	      redLED.setHubPort(1);
		  redLED.setIsHubPortDevice(true);
		  greenLED.setHubPort(4);
		  greenLED.setIsHubPortDevice(true);
		  
	      //Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000 to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception occur.
	      temperatureSensor.open(1000);
	      redLED.open(100);
	      greenLED.open(100);
	      
	     

	      //Use your Phidgets | This code will print humidity and temperature read by the sensor every 150ms.
	      while(true)
	      {
	    	 
	    	  
	    	  if (temperatureSensor.getTemperature() > 20 && temperatureSensor.getTemperature() < 24)
	    	  {
	    		  greenLED.setState(true);
	    		  redLED.setState(false);
	    	  }
	    	  
	    	  else 
	    	  {
	    		  greenLED.setState(false);
	    		  redLED.setState(true);
	    	  }
	    	  
	          System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
	          
	          Thread.sleep(100);
	       }

	}

}
