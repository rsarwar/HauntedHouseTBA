package board;

import rooms.Room;

public class Board {


    private Room[][] houseMap;



    public Board(Room[][] houseMap)
    {
        this.houseMap = houseMap;
    }

    public void printMap()
    {


        for(Room[] row : houseMap)
        {
            for (Room room : row)
            {
                room.print();
            }
            System.out.println();
        }
    }
    public Room[][] gethouseMap() {
        return houseMap;
    }

    public void sethouseMap(Room[][] houseMap) {
        this.houseMap = houseMap;
    }


}
