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
		
		if(move.equals("W"))
		{
			x[1] = x[1] - 1;
			if(x[1] > 3 || x[1] <0)
			{
				player.location[1] = player.location[1];
			}
			else
			{
				player.location[1] = x[1];
			}
			
		}
		
		if(move.equals("N"))
		{
			x[0] = x[0] - 1;
			if(x[0] > 3 || x[0] <0)
			{
				player.location[0] = player.location[0];
				System.out.println("You cannot move that way.");
			}
			else
			{
				player.location[0] = x[0];
			}
		}
		
		if(move.equals("S"))
		{
			x[0] = x[0] + 1;
			if(x[0] > 3 || x[0] <0)
			{
				player.location[0] = player.location[0];
				System.out.println("You cannot move that way.");
			}
			else
			{
				player.location[0] = x[0];
			}
		}
		
		if(move.equals("E"))
		{
			x[1] = x[1] + 1;
			if(x[1] > 3 || x[1] <0)
			{
				player.location[1] = player.location[1];
				System.out.println("You cannot move that way.");
			}
			else
			{
				player.location[1] = x[1];
			}
		}
		//System.out.println(player.location[0]);
		//System.out.println(player.location[1]);
		
	}

}
