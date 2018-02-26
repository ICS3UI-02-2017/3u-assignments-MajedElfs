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
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Making a city
        City moongale = new City();

        //Making a robot
        RobotSE majed = new RobotSE(moongale, 3, 3, Direction.SOUTH);

        //Creating squares for robot to travel around
        //Top left square
        new Wall(moongale, 1, 1, Direction.NORTH);
        new Wall(moongale, 1, 1, Direction.WEST);
        new Wall(moongale, 1, 2, Direction.NORTH);
        new Wall(moongale, 1, 2, Direction.EAST);
        new Wall(moongale, 2, 2, Direction.SOUTH);
        new Wall(moongale, 2, 2, Direction.EAST);
        new Wall(moongale, 2, 1, Direction.SOUTH);
        new Wall(moongale, 2, 1, Direction.WEST);
        //Top right square
        new Wall(moongale, 1, 4, Direction.NORTH);
        new Wall(moongale, 1, 4, Direction.WEST);
        new Wall(moongale, 1, 5, Direction.NORTH);
        new Wall(moongale, 1, 5, Direction.EAST);
        new Wall(moongale, 2, 5, Direction.SOUTH);
        new Wall(moongale, 2, 5, Direction.EAST);
        new Wall(moongale, 2, 4, Direction.SOUTH);
        new Wall(moongale, 2, 4, Direction.WEST);
        //Bottom left square
        new Wall(moongale, 4, 1, Direction.NORTH);
        new Wall(moongale, 4, 1, Direction.WEST);
        new Wall(moongale, 4, 2, Direction.NORTH);
        new Wall(moongale, 4, 2, Direction.EAST);
        new Wall(moongale, 5, 2, Direction.SOUTH);
        new Wall(moongale, 5, 2, Direction.EAST);
        new Wall(moongale, 5, 1, Direction.SOUTH);
        new Wall(moongale, 5, 1, Direction.WEST);
        //Bottom right square
        new Wall(moongale, 4, 4, Direction.NORTH);
        new Wall(moongale, 4, 4, Direction.WEST);
        new Wall(moongale, 4, 5, Direction.NORTH);
        new Wall(moongale, 4, 5, Direction.EAST);
        new Wall(moongale, 5, 5, Direction.SOUTH);
        new Wall(moongale, 5, 5, Direction.EAST);
        new Wall(moongale, 5, 4, Direction.SOUTH);
        new Wall(moongale, 5, 4, Direction.WEST);

        //Making new variables
        int numberOfMoves = 4;
        //Making robot able to move in U-turn movements
        while (numberOfMoves > 0) {
            majed.move(3);
            majed.turnLeft();
            majed.move(3);
            majed.turnLeft();
            majed.move(3);
            majed.turnLeft();
            numberOfMoves = numberOfMoves - 1;
            //At ever end of the U-turn, robot will move 3 more steps
            if (majed.getAvenue() == 6 && majed.getStreet() == 3) {
                majed.move(3);
            }
            if (majed.getAvenue() == 3 && majed.getStreet() == 6) {
                majed.move(3);
            }
            if (majed.getAvenue() == 0 && majed.getStreet() == 3) {
                majed.move(3);
            }
            //When robot runs out of moves, move 3 steps
            if (numberOfMoves == 0) {
                majed.move(3);
            }


        }
    }
}
