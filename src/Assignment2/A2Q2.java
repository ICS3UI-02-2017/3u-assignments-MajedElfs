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
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Making a city
        City moongale = new City();

        //Making a robot
        RobotSE majed = new RobotSE(moongale, 3, 0, Direction.EAST);

        //Making the racing ground
        new Wall(moongale, 3, 0, Direction.SOUTH);
        new Wall(moongale, 3, 1, Direction.SOUTH);
        new Wall(moongale, 3, 2, Direction.SOUTH);
        new Wall(moongale, 3, 3, Direction.SOUTH);
        new Wall(moongale, 3, 4, Direction.SOUTH);
        new Wall(moongale, 3, 5, Direction.SOUTH);
        new Wall(moongale, 3, 6, Direction.SOUTH);
        new Wall(moongale, 3, 7, Direction.SOUTH);
        new Wall(moongale, 3, 8, Direction.SOUTH);
        new Wall(moongale, 3, 9, Direction.SOUTH);

        //Making the hurdles
        new Wall(moongale, 3, 1, Direction.EAST);
        new Wall(moongale, 3, 4, Direction.EAST);
        new Wall(moongale, 3, 5, Direction.EAST);
        new Wall(moongale, 3, 7, Direction.EAST);

        //Making the finish line with a Thing
        new Thing(moongale, 3, 9);

        //Making the robot move forward but go around hurdles
        //Also making the robot stop when it reached the Thing

        while (!majed.canPickThing()) {

            if (!majed.frontIsClear()) {
                majed.turnLeft();
                majed.move();
                majed.turnRight();
                majed.move();
                majed.turnRight();
                majed.move();
                majed.turnLeft();
            } else {
                majed.move();
            }
        }

    }
}
