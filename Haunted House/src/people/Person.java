package people;

import rooms.Room;
import java.util.Scanner;

public class Person
{
	private String firstName;
	private String[] inventory;
	private int scaredMeter;
	private String costume;
	private int[] location;
	
	
	public Person(String firstName)
	{
		this.firstName = firstName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}

	public void setRoom (Room room) {
		/*this.location[0] = room.x;
		this.location[1] = room.y;*/
	}
	
	public String print() {
		
		return "x";
	}
	public void printRoom()
	{

		System.out.println("");
		System.out.println("");
		System.out.println("[               ]");
		System.out.println("[               ]");
		System.out.println("This is the current room you're in.");
	}
	public String chooseMove()
	{
		Scanner in = new Scanner(System.in);
        String statement = "";
		statement = in.nextLine();
		return statement;
	}
	/*
	public String[] setRoom(Person p)
	{
		return this.location = p.location;
	}
	*/

}
