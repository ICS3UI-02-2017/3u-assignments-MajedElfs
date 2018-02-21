/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author hadim9637
 */
public class ChallengeQuestion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Making a city
        City moongale = new City();

        //Making a shovel bot
        RobotSE majed = new RobotSE(moongale, 0, 2, Direction.SOUTH);
        //Making another shovel bot
        RobotSE cleany = new RobotSE(moongale, -1, 2, Direction.SOUTH);

        //Making the road
        new Wall(moongale, 0, 0, Direction.WEST);
        new Wall(moongale, 1, 0, Direction.WEST);
        new Wall(moongale, 2, 0, Direction.WEST);
        new Wall(moongale, 3, 0, Direction.WEST);
        new Wall(moongale, 4, 0, Direction.WEST);
        new Wall(moongale, 5, 0, Direction.WEST);
        new Wall(moongale, 6, 0, Direction.WEST);
        new Wall(moongale, 7, 0, Direction.WEST);
        new Wall(moongale, 8, 0, Direction.WEST);
        new Wall(moongale, 9, 0, Direction.WEST);
        new Wall(moongale, 0, 1, Direction.EAST);
        new Wall(moongale, 1, 1, Direction.EAST);
        new Wall(moongale, 2, 1, Direction.EAST);
        new Wall(moongale, 3, 1, Direction.EAST);
        new Wall(moongale, 4, 1, Direction.EAST);
        new Wall(moongale, 5, 1, Direction.EAST);
        new Wall(moongale, 6, 1, Direction.EAST);
        new Wall(moongale, 7, 1, Direction.EAST);
        new Wall(moongale, 8, 1, Direction.EAST);
        new Wall(moongale, 9, 1, Direction.EAST);

        //Making the sidewalk and the top driveway
        new Wall(moongale, 0, 2, Direction.EAST);
        new Wall(moongale, 3, 2, Direction.EAST);
        new Wall(moongale, 5, 2, Direction.EAST);
        new Wall(moongale, 6, 2, Direction.EAST);
        new Wall(moongale, 9, 2, Direction.EAST);
        new Wall(moongale, 9, 2, Direction.SOUTH);
        new Wall(moongale, 1, 3, Direction.NORTH);
        new Wall(moongale, 1, 4, Direction.NORTH);
        new Wall(moongale, 1, 5, Direction.NORTH);
        new Wall(moongale, 1, 6, Direction.NORTH);
        new Wall(moongale, 1, 6, Direction.EAST);
        new Wall(moongale, 2, 6, Direction.EAST);
        new Wall(moongale, 2, 6, Direction.SOUTH);
        new Wall(moongale, 2, 5, Direction.SOUTH);
        new Wall(moongale, 2, 4, Direction.SOUTH);
        new Wall(moongale, 2, 3, Direction.SOUTH);

        //Making the middle driveway
        new Wall(moongale, 4, 3, Direction.NORTH);
        new Wall(moongale, 4, 4, Direction.NORTH);
        new Wall(moongale, 4, 5, Direction.NORTH);
        new Wall(moongale, 4, 5, Direction.EAST);
        new Wall(moongale, 4, 3, Direction.SOUTH);
        new Wall(moongale, 4, 4, Direction.SOUTH);
        new Wall(moongale, 4, 5, Direction.SOUTH);



        //Making the bottom driveway
        new Wall(moongale, 7, 3, Direction.NORTH);
        new Wall(moongale, 7, 4, Direction.NORTH);
        new Wall(moongale, 7, 5, Direction.NORTH);
        new Wall(moongale, 7, 6, Direction.NORTH);
        new Wall(moongale, 7, 6, Direction.EAST);
        new Wall(moongale, 8, 3, Direction.SOUTH);
        new Wall(moongale, 8, 4, Direction.SOUTH);
        new Wall(moongale, 8, 5, Direction.SOUTH);
        new Wall(moongale, 8, 6, Direction.SOUTH);
        new Wall(moongale, 8, 6, Direction.EAST);

        //Making snow on the sidewalk and driveways
        new Thing(moongale, 1, 3);
        new Thing(moongale, 1, 5);
        new Thing(moongale, 2, 3);
        new Thing(moongale, 2, 6);
        new Thing(moongale, 3, 2);
        new Thing(moongale, 4, 4);
        new Thing(moongale, 4, 5);
        new Thing(moongale, 5, 2);
        new Thing(moongale, 6, 2);
        new Thing(moongale, 7, 3);
        new Thing(moongale, 7, 5);
        new Thing(moongale, 7, 6);
        new Thing(moongale, 8, 4);
        new Thing(moongale, 8, 5);
        new Thing(moongale, 8, 6);
        new Thing(moongale, 2, 2);
        new Thing(moongale, 8, 2);


        //Making the first shovel bot be able to detect where snow is and taking them to the sidewalk
        majed.move();
        majed.turnLeft();
        while (majed.frontIsClear()) {
            majed.move();
            if (majed.canPickThing() == true) {
                majed.pickThing();
                while (majed.getAvenue() == 2 && !majed.frontIsClear()) {
                    majed.turnLeft(2);
                    majed.move();
                }
                while (!majed.frontIsClear()) {
                    majed.turnRight();
                    if (majed.getAvenue() == 2 && majed.countThingsInBackpack() > 0) {
                        majed.putAllThings();

                    }
                }
            }
        }




        //Making the second shovel bot pick up the snow on the sidewalk and drop it at the end
    }
}