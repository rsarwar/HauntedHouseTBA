package board;

import rooms.Room;

public class House {
	
	private Room[][] map;
	
	public House(Room[][] map)
	{
		this.map = map;
	}
	
	public void printMap()
	{
		for(int x = 0; x < map.length; x++)
		{
			System.out.println("");
			for(int y = 0; y < map.length; y++)
			{
				System.out.print("[ ]");
			}
		}
		System.out.println("");
		System.out.println("This is the lovely house. You are at point x.");
	}

}
