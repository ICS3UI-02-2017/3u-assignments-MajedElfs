/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author hadim9637
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Making a city
        City moongale = new City();

        //Making a robot, and making it start at the bottom of the hill
        RobotSE elf = new RobotSE(moongale, 3, 0, Direction.EAST);

        //Making the flag (thing) start at the bottom of the hill
        Thing flag = new Thing(moongale, 3, 1);


        //Making the "hill" using walls
        new Wall(moongale, 3, 2, Direction.WEST);
        new Wall(moongale, 3, 2, Direction.NORTH);
        new Wall(moongale, 2, 3, Direction.WEST);
        new Wall(moongale, 1, 3, Direction.WEST);
        new Wall(moongale, 1, 3, Direction.NORTH);
        new Wall(moongale, 1, 3, Direction.EAST);
        new Wall(moongale, 2, 4, Direction.NORTH);
        new Wall(moongale, 2, 4, Direction.EAST);
        new Wall(moongale, 3, 4, Direction.EAST);

        //Making robot pick up thing (the flag) and climb up the hill
        elf.move();
        elf.pickThing();
        elf.turnLeft();
        elf.move();
        elf.turnRight();
        elf.move();
        elf.turnLeft();
        elf.move(2);
        elf.turnRight();
        elf.move();
        //Making robot drop the thing (the flag) and go down the hill
        elf.putThing();
        elf.move();
        elf.turnRight();
        elf.move();
        elf.turnLeft();
        elf.move();
        elf.turnRight();
        elf.move(2);
        elf.turnLeft();
    }
}
