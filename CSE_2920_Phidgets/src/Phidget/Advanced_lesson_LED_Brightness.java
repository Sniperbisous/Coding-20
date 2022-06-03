package Phidget;
//Add Phidgets Library 
		import com.phidget22.*;
public class Advanced_lesson_LED_Brightness 
{

	public static void main(String[] args)  throws Exception
	{
	


		        //Create 
		        DigitalOutput redLED = new DigitalOutput();

		        //Address 
		        redLED.setHubPort(1);
		        redLED.setIsHubPortDevice(true);

		        //Open 
		        redLED.open(1000);

		        int power_state = 0;
		        double LED_power = 0.0;
		        while(true)
		        {
		        	switch(power_state)
		        	{
		        		case 0:
		        		{
		        			LED_power = 0.0;
		        			while(LED_power < 1.0)
		        			{
		        				redLED.setDutyCycle(LED_power);
		        				LED_power += 0.1;
		        				Thread.sleep(100);
		        			}
		        			power_state += 1;
		        			break;
		        		}
		        	
		        		case 1:
		        		{
		        			LED_power = 1.0;
		        			while(LED_power > 0.0)
		        			{
		        				redLED.setDutyCycle(LED_power);
		        				LED_power -= 0.1;
		        				Thread.sleep(100);
		        			}
		        			power_state -= 1;
		        			break;
		        		}
		        	//Use your Phidgets with Duty Cycle | Duty Cycle controls the power to your Phidget (Digital Output object). Duty Cycle values range from 0.0 - 1.0.
		        	
		        	}
		    }
	}
		  

}


