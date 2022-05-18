package Phidget;

import com.phidget22.DigitalInput;
import com.phidget22.PhidgetException;

public class Lesson_2_button 
{

	public static void main(String[] args) throws Exception
	{
		 //Create 
	      DigitalInput redButton = new DigitalInput();
	      DigitalInput greenButton = new DigitalInput();

	      //Address 
	      redButton.setHubPort(0);
	      redButton.setIsHubPortDevice(true); 
	      greenButton.setHubPort(5);
	      greenButton.setIsHubPortDevice(true);

	      //Open 
	      redButton.open(1000); 
	      greenButton.open(1000);

	      //Use your Phidgets 
	      while(true)
	      {
	    	  if(redButton.getState() == true || greenButton.getState() == true)
	    	  {
	          System.out.println("Red Button State: " + redButton.getState() + "\t \t" + "Green Button State: " + greenButton.getState());
	          Thread.sleep(150);
	    	  }
	      }
	}

}
