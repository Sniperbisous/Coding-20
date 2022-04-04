package Chapter_7;

public class Circle 
{
	//creates variable radius
	private double radius;
	
	//creates and assigns the variable pi the value of 3.14159
	private double pi = 3.14159;
	
	//creates a 
	public Circle()
	{
		radius = 1;	
	}
	
	public Circle(double r)
	{
		radius = r;	
	}
	
	public void setRadius(double newRadius)
	{
		radius = newRadius;
	}
	
	public double getRadius()
	{
		return(radius);
	}
	
	public double circumference()
	{
		double Circumference;
		Circumference = (2 * pi) * radius;
		return(Circumference);
	}
	public static void main(String[] args) 
	{
		

	}

}
