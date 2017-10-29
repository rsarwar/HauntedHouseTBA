package people;

public class Person
{
	private String firstName;
	private String[] inventory;
	private int scaredMeter;
	private String costume;
	
	
	public Person(String firstName)
	{
		this.firstName = firstName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
}
