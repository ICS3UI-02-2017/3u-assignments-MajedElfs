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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Making a city
        City moongale = new City();

        //Making the first robot and giving a label
        RobotSE majed = new RobotSE(moongale, 3, 3, Direction.EAST);
        majed.setLabel("Majed");

        //Making the second robot and giving a label
        RobotSE mai = new RobotSE(moongale, 0, 1, Direction.WEST);
        mai.setLabel("Mai");

        //Creating the expensive items dropped (things)
        new Thing(moongale, 0, 0);
        new Thing(moongale, 1, 0);
        new Thing(moongale, 1, 1);
        new Thing(moongale, 1, 2);
        new Thing(moongale, 2, 2);

        //Creating Majed's house (creating walls)
        new Wall(moongale, 2, 3, Direction.NORTH);
        new Wall(moongale, 2, 3, Direction.EAST);
        new Wall(moongale, 2, 3, Direction.WEST);
        new Wall(moongale, 3, 3, Direction.EAST);
        new Wall(moongale, 3, 3, Direction.SOUTH);

        //Making both robots pick up expensive items, taking turns
        mai.move();
        mai.pickThing();
        majed.turnAround();
        majed.move();
        majed.turnRight();
        majed.move();
        mai.turnLeft();
        mai.move();
        mai.pickThing();
        majed.pickThing();
        majed.move();
        mai.turnLeft();
        mai.move();
        mai.pickThing();
        majed.pickThing();
        majed.turnLeft();

        majed.setLabel("Thanks!");

    }
}
