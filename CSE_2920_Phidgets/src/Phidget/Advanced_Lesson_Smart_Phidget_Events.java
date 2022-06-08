package Phidget;

//Add Phidgets Library
import com.phidget22.*;

public class Advanced_Lesson_Smart_Phidget_Events 
{
	public static double Humid, Temp, Past_Humid, Past_Temp;
	public static String temp;
	
	public static void main(String[] args) throws Exception
	{
		//Create
        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Humidity Event 
        humiditySensor.addHumidityChangeListener(new HumiditySensorHumidityChangeListener() {
            public void onHumidityChange(HumiditySensorHumidityChangeEvent e) 
            {
               Humid = e.getHumidity();
            }
        });
        
        //Temperature Event 
        temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() {
            public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) 
            {
            	
                 Temp = e.getTemperature();
                 if (Temp > 21)
                	{
                	 	temp = 	("Temperature: " + Temp + "°C");
                	}
                 else
                 {
                	 temp =	("Room is too cold");
                 }
            }
        });

        //Open
        humiditySensor.open(1000);
        temperatureSensor.open(1000);

        //Keep program running
        while (true) 
        {
        	if (Humid != Past_Humid || Temp != Past_Temp)
        	{
        		System.out.println("Humidity: " + Humid + "%RH\t" + temp);
        	}
        	
        	
        	Past_Humid = Humid;
        	Past_Temp = Temp;
        	
            Thread.sleep(150);

        }

	}
}
