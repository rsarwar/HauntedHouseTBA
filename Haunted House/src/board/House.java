package board;

import rooms.Room;
import people.Person;

public class House {
	
	private Room[][] map;
	private int[] map2 = new int[2];
	
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
				map2[0]=x;
				map2[1]=y;
				if(player1.getLocation()== map2)
				{
					System.out.print("[x]");
				}
				System.out.print("[ ]");
		
			}
		}
		System.out.println("");
		System.out.println("This is the lovely house. You are at point x.");
		System.out.println(player1.getLocation());
		System.out.println(map2[1]);
	}

	public Room[][] getMap() {
		return map;
	}

	public void setMap(Room[][] map) {
		this.map = map;
	}

}
