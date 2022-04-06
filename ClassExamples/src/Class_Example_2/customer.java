package Class_Example_2;

public class customer 
{
	private String firstName;
	private String lastName; 
	private String gender;
	private String age;
	private String Address;
	
	//constructor Method
	public customer(String fn, String ln, String add)
	{
		firstName = fn;
		lastName = ln;
		Address = add;
	}
	
	//Accessor Methods
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String getAddress()
	{
		return Address;
	}
	
	
	
	//Modifier Methods
	public void setFirstName(String fn)
	{
		firstName = fn;
	}
	
	public void setLastName(String ln)
	{
		lastName = ln;
	}
	
	public void setAddress(String ad)
	{
		Address = ad;
	}
	
	
	
	
	
	/* 
	 * public static void main(String[] args) 
	 
	{
		// TODO Auto-generated method stub

	}
	 */
}
