package Phidget;

import com.phidget22.*;

public class Advanced_Lesson_Using_the_sensor_API 
{
	static double MinHumidity, MaxHumidity;
	static int  MaxDataInterval, MinDataInterval;
	public static void main(String[] args) throws PhidgetException, InterruptedException
	{
		try {
			
			
			HumiditySensor ch = new HumiditySensor();
			TemperatureSensor Tp = new TemperatureSensor();
			Tp.open(Phidget.DEFAULT_TIMEOUT);
			ch.open(Phidget.DEFAULT_TIMEOUT);

			MinHumidity = ch.getMinHumidity();
			MaxHumidity = ch.getMaxHumidity();
			MinDataInterval = Tp.getMinDataInterval();
			MaxDataInterval = Tp.getMaxDataInterval();

			
			
			ch.close();
			Tp.close();

			System.out.println("Range of Humidity sensor: " + MinHumidity + " - " + MaxHumidity + " %RH");
			System.out.println("Range of Tempature sensor data interval: " + MinDataInterval + " - " + MaxDataInterval + " ms");
		}
		
		catch (PhidgetException ex) 
		{
			System.out.println("Failure: " + ex);
		}
		
		try
		{
			 //Create
	        HumiditySensor humiditySensor = new HumiditySensor();
	        TemperatureSensor temperatureSensor = new TemperatureSensor();
	        
	       
	      
	        
	        //Temperature Event 
	        temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() {
	            public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) {
	                System.out.println("Temperature: " + e.getTemperature() + "°C");
	            }
	        });

	        //Open
	        humiditySensor.open(1000);
	        temperatureSensor.open(1000);
	        
	        temperatureSensor.setTemperatureChangeTrigger(1);
	        
	      
	        //Keep program running
	        while (true) {
	            Thread.sleep(150);
	        }
	        
	        
		}
		catch (PhidgetException ex) 
			{
				System.out.println("Failure: " + ex);
			}
	}

}




