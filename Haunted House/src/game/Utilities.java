package game;

import java.util.Scanner;
import people.Person; 
import board.House;

public class Utilities {
	
	public static Person createPerson(String fname, int[] location)
	{
		//Scanner in = new Scanner(System.in);
		
		return new Person(fname, location);
		
	}
	
	public static void movePlayer(House boo, Person player, String move)
	{
		int[] x = player.getLocation();
		
		if(move.equals("N"))
		{
			x[1] = x[1] - 1;
			player.location = x;
		}
		
		if(move.equals("S"))
		{
			x[1] = x[1] + 1;
			player.location = x;
		}
		
		
	}

}
