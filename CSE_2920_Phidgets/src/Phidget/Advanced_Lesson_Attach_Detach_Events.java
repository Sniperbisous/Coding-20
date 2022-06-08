package Phidget;

//Add Phidgets Library
import com.phidget22.*;

public class Advanced_Lesson_Attach_Detach_Events 
{

	public static void main(String[] args)throws Exception {
	       
        //Create
       TemperatureSensor temperatureSensor = new TemperatureSensor();
       DigitalInput redButton = new DigitalInput();
       DigitalInput greenButton = new DigitalInput();
       DigitalOutput redLED = new DigitalOutput();
       DigitalOutput greenLED = new DigitalOutput();
       
       redButton.setHubPort(0);
       redButton.setIsHubPortDevice(true);
       greenButton.setHubPort(5);
       greenButton.setIsHubPortDevice(true);
       redLED.setHubPort(1);
       redLED.setIsHubPortDevice(true);
       greenLED.setHubPort(4); 
       greenLED.setIsHubPortDevice(true);

       

       //Attach Event 
       temperatureSensor.addAttachListener(new AttachListener() 
       {
           public void onAttach(AttachEvent e) 
           {
               System.out.println("Temperature Sensor: Attach!");
           }
       });

       //Detach Event 
       temperatureSensor.addDetachListener(new DetachListener() 
       {
           public void onDetach(DetachEvent e) 
           {
               System.out.println("Temperature Sensor: Detach!");
           }
       });
       
       
       //Attach Event 
       redButton.addAttachListener(new AttachListener() 
       {
           public void onAttach(AttachEvent e) 
           {
               System.out.println("Red Button: Attach!");
           }
       });
       
       
     //Detach Event 
       redButton.addDetachListener(new DetachListener() 
       {
           public void onDetach(DetachEvent e) 
           {
               System.out.println("Red Button: Detach!");
           }
       });
       
       
       //Attach Event 
       greenButton.addAttachListener(new AttachListener() 
       {
           public void onAttach(AttachEvent e) 
           {
               System.out.println("Green Button: Attach!");
           }
       });
       
       
     //Detach Event 
       greenButton.addDetachListener(new DetachListener() 
       {
           public void onDetach(DetachEvent e) 
           {
               System.out.println("Green Button: Detach!");
           }
       });
       
       
       
       //Attach Event 
       redLED.addAttachListener(new AttachListener() 
       {
           public void onAttach(AttachEvent e) 
           {
               System.out.println("Red LED: Attach!");
           }
       });
       
       
     //Detach Event 
       redLED.addDetachListener(new DetachListener() 
       {
           public void onDetach(DetachEvent e) 
           {
               System.out.println("Red LED: Detach!");
           }
       });
       
       
       //Attach Event 
       greenLED.addAttachListener(new AttachListener() 
       {
           public void onAttach(AttachEvent e) 
           {
               System.out.println("Green LED: Attach!");
           }
       });
       
       
     //Detach Event 
       greenLED.addDetachListener(new DetachListener() 
       {
           public void onDetach(DetachEvent e) 
           {
               System.out.println("Green LED: Detach!");
           }
       });
       
       //Data Event 
       temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() 
       {
           public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) 
           {
               //Print temperature
               System.out.println("Temperature: " + e.getTemperature() + "°C");
           }
       });

       //Open
       temperatureSensor.open(1000);
       greenLED.open(1000);
       redLED.open(1000);
       greenButton.open(1000);
       redButton.open(1000);

       //Keep program running
       while (true) 
       {
           Thread.sleep(150);
       }
   }

}
