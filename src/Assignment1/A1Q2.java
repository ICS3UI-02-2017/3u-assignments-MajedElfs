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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       //Making a city
       City moongale = new City();
       
       //Making a robot start at its "bed"
       RobotSE elf = new RobotSE (moongale,1,2,Direction.SOUTH);
       
       //Creating walls for elf's house
       new Wall (moongale,1,1,Direction.NORTH);
       new Wall (moongale,1,1,Direction.WEST);
       new Wall (moongale,1,2,Direction.NORTH);
       new Wall (moongale,1,2,Direction.EAST);
       new Wall (moongale,1,2,Direction.SOUTH);
       new Wall (moongale,2,1,Direction.SOUTH);
       new Wall (moongale,2,1,Direction.WEST);
       
       //Creating a Thing (the newspaper)
       new Thing (moongale,2,2);
       
       //Making the robot move to get the thing (newspaper) and return to "bed"
       elf.turnRight();
       elf.move();
       elf.turnLeft();
       elf.move();
       elf.turnLeft();
       elf.move();
       elf.pickThing();
       elf.turnAround();
       elf.move();
       elf.turnRight();
       elf.move();
       elf.turnRight();
       elf.move();
       elf.turnRight();
       
       
    }
}
