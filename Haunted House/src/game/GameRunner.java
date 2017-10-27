package game;

import items.Item;
import rooms.*;
import people.Person;

import java.util.Scanner;

public class GameRunner {

    public static void main (String[] args)
    {
        Room[][] map = new Room[4][5];
        for (int j = 0; j<map.length; j++)
        {
        	Room[] row = map[j];
            for (int i = 0; i<row.length;i++)
            {
                boolean[] doors = {true,true,true,true};
                Person[] people = {};
                Item[] items = {};

               // row[i] = new Hallway(doors, Person, items, i, j);
            }

        }

        //House boo = new House(map);


        boolean gameOn = true;
        Person player1 = Utilities.createPerson();
        Scanner in = new Scanner(System.in);
        while(gameOn)
        {
            System.out.println("Welcome to the Halls of boo, " + player1.getFirstName());
            map[0][0].addOccupant(player1);

            //boo.printMap();
            //player1.printRoom();
           // String move = player1.chooseMove();
            //Utilities.movePlayer(boo, player1,move);
            //gameOn = false;
        }
    }
}