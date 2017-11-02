package people;

import rooms.Room;
import java.util.Scanner;

public class Person
{
	private String firstName;
	private String[] inventory;
	private int scaredMeter;
	private String costume;
	public int[] location = new int[2];
	
	
	
	public Person(String firstName, int[] location)
	{
		this.firstName = firstName;
		this.location = location;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public int[] getLocation()
	{
		return location;
	}

	public void setRoom (Room room) {
		this.location[0] = room.getX();
		this.location[1] = room.getY();
		//System.out.println("");
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
