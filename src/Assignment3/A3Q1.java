/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author hadim9637
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Making a city
        City moongale = new City();

        //Making a robot
        RobotSE majed = new RobotSE(moongale, 0, 0, Direction.SOUTH);


        //Making walls
        new Wall(moongale, 1, 1, Direction.NORTH);
        new Wall(moongale, 1, 2, Direction.NORTH);
        new Wall(moongale, 1, 1, Direction.WEST);
        new Wall(moongale, 2, 1, Direction.WEST);
        new Wall(moongale, 2, 1, Direction.SOUTH);
        new Wall(moongale, 2, 2, Direction.SOUTH);
        new Wall(moongale, 2, 2, Direction.EAST);
        new Wall(moongale, 1, 2, Direction.EAST);
        
        //Creating a variable
        int numberOfMoves = 8;
        //Checking if there are moves still left
        while (numberOfMoves >0){
            //Making the robot move and turn left if any moves are left
            majed.move(3);
            majed.turnLeft();
            //Subtracting 1 from the variable numberOfMoves each time until 0
            numberOfMoves = numberOfMoves - 1;
        }
    }
}
