package game;

import java.util.Scanner;
import people.Person; 
import board.House;
import people.Monster;

public class Utilities {
	
	public static Person createPerson(String fname, int[] location)
	{
		//Scanner in = new Scanner(System.in);
		
		return new Person(fname, location);
		
	}
	public static Monster createMonster(String type, int[] location)
	{
		return new Monster(type, location);
	}
	public static void movePlayer(House boo, Person player, String move)
	{
		int[] x = player.getLocation();
		
		if(move.toLowerCase().equals("w"))
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
		
		if(move.toLowerCase().equals("n"))
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
		
		if(move.toLowerCase().equals("s"))
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
		
		if(move.toLowerCase().equals("e"))
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
