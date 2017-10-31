package board;

import rooms.Room;
import people.Person;

public class House {
	
	private Room[][] map;
	
	public House(Room[][] map)
	{
		this.map = map;
	}
	
	public void printMap(Person player1)
	{
		for(int x = 0; x < map.length; x++)
		{
			System.out.println("");
			for(int y = 0; y < map.length; y++)
			{
				/*if(player1.getLocation())
				{
					
				}*/
				System.out.print("[ ]");
		
			}
		}
		System.out.println("");
		System.out.println("This is the lovely house. You are at point x.");
	}

	public Room[][] getMap() {
		return map;
	}

	public void setMap(Room[][] map) {
		this.map = map;
	}

}
