package Phidget;

//Add Phidgets Library
import com.phidget22.*;

public class Advanced_lesson_Closing_Phidgets {

	public static void main(String[] args) throws Exception
	{
        //Create
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open
        temperatureSensor.open(1000);

        //Use your Phidgets
        System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
        
        //Close your Phidgets
        temperatureSensor.close();
        
       /*
        
         //Use your Phidgets
        System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
        
       */
        
        //Open your Phidgets
        temperatureSensor.open(1000);
        
        //Use your Phidgets
        System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
        
         
    }
}
  
	
