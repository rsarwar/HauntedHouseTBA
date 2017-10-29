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

        
        
        //This section is all for initializing the player
        Scanner in = new Scanner(System.in);
        String statement = "";
        
        System.out.println("Hello trick or treater, what is your name?");
		statement = in.nextLine();
        
        Person player1 = Utilities.createPerson(statement);
        
        boolean gameOn = true;
        while(gameOn)
        {
            System.out.println("Welcome to the Halls of boo, " + player1.getFirstName()+". As you navigate through this house, you need to collect as much candy as you can. Beware of spooky creatures lurking around, though! If they catch you, it's game over! ");
            map[0][0].addOccupant(player1);

            //boo.printMap();
            //player1.printRoom();
           // String move = player1.chooseMove();
            //Utilities.movePlayer(boo, player1,move);
            //gameOn = false;
        }
    }
}