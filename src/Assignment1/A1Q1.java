/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author hadim9637
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Making a city
        City moongale = new City();

        //Making a robot
        RobotSE elf = new RobotSE(moongale, 0, 0, Direction.SOUTH);


        //Making walls
        new Wall(moongale, 1, 1, Direction.NORTH);
        new Wall(moongale, 1, 2, Direction.NORTH);
        new Wall(moongale, 1, 1, Direction.WEST);
        new Wall(moongale, 2, 1, Direction.WEST);
        new Wall(moongale, 2, 1, Direction.SOUTH);
        new Wall(moongale, 2, 2, Direction.SOUTH);
        new Wall(moongale, 2, 2, Direction.EAST);
        new Wall(moongale, 1, 2, Direction.EAST);

        //Making the robot move counter clockwise
        elf.move(3);
        elf.turnLeft();
        elf.move(3);
        elf.turnLeft();
        elf.move(3);
        elf.turnLeft();
        elf.move(3);
        elf.turnLeft();

    }
}
