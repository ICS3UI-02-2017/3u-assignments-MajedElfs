/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author hadim9637
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Making a city
        City moongale = new City();

        //Making a robot
        RobotSE majed = new RobotSE(moongale, 1, 1, Direction.EAST, 20);

        //Making a new variable
        int numberOfMoves = 4;
        //Checking if there are any moves left
        while (numberOfMoves > 0) {
            //Making robot do one row of seeds then turn around and turn left then repeat
            majed.putThing();
            majed.move();
            majed.putThing();
            majed.move();
            majed.putThing();
            majed.move();
            majed.putThing();
            majed.move();
            majed.putThing();
            majed.turnAround();
            majed.move(4);
            majed.turnLeft();
            majed.move();
            majed.turnLeft();
            numberOfMoves = numberOfMoves - 1;

        }

    }
}
