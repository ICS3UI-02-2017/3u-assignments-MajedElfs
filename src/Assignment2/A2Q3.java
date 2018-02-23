/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author hadim9637
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Making a city
        City moongale = new City();

        //Making a robot
        RobotSE majed = new RobotSE(moongale, -19, 16, Direction.EAST);

        //Making robot able to locate where it is in the city

        //Making robot be able to get to street 0
        while (majed.getStreet() > 0) {
            majed.move();
            if (majed.getDirection() != Direction.NORTH) {
                majed.turnLeft();
            }


        }
        //Making robot be able to get to avenue 0
        while (majed.getAvenue() > 0) {

            if (majed.getDirection() != Direction.WEST) {
                majed.turnLeft();
            }
            majed.move();
        }
        //Making robot be able to get to street 0 if the robot is in the negatives
        while (majed.getStreet() < 0) {
            majed.move();
            if (majed.getDirection() != Direction.SOUTH) {
                majed.turnLeft();
            }


        }
        //Making robot be able to get to avenue 0 if the robot is in the negatives
        while (majed.getAvenue() < 0) {

            if (majed.getDirection() != Direction.EAST) {
                majed.turnLeft();

            }
            majed.move();

        }
    }
}
