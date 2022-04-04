package Class_Example_1;

public class Rectangle 
{
	private double length, width;
	
	public Rectangle () //constructor method
		{
		length = 1;	//default length
		width = 1;	//default width
		}
	
	public Rectangle(double l, double w) //constructor method 2
		{
		length = l;	//default length
		width = w;	//default width
		}
	
	public void setLength(double newLength)
		{
		length = newLength;
		}
	
	public void setWidth(double newWidth)
		{
		width = newWidth;
		}
	
	public double getLength()
		{
		return(length);
		}
		
	public double getWidth()
		{
		return(width);
		}
	
	
	public static void main(String[] args) 
	{
		

	}

}
