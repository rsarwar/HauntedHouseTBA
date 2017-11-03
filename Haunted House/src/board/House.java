package board;

import rooms.Room;
import people.Person;
import people.Monster;
import java.util.Random;

public class House {
	
	private Room[][] map;
	
	public House(Room[][] map)
	{
		this.map = map;
	}
	
	public void printMap(Person player1, Monster monster)
	{
		
		for(int x = 0; x < map.length; x++)
		{
			System.out.println("");
			for(int y = 0; y < map.length; y++)
			{
				
				if(player1.getLocation()[0]==x && player1.getLocation()[1]==y)
				{
					System.out.print("[x]");
				}
				else
					{
					System.out.print("[ ]");
					}
		
			}
		}
		System.out.println("");
		System.out.println("This is the lovely house. You are at point x.");
		//toString();
		
		//System.out.println(player1.location[0]);
		//System.out.println(player1.location[1]);
	}

	public Room[][] getMap() {
		return map;
	}

	public void setMap(Room[][] map) {
		this.map = map;
	}

}
