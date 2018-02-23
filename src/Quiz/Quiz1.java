/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author hadim9637
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Making a city
        City moongale = new City();
        //Making a robot  
        RobotSE majed = new RobotSE(moongale, 4, 0, Direction.EAST);
        
        //Making the left part of the stairs
        new Wall(moongale,4,1,Direction.EAST);
        new Wall(moongale,3,2,Direction.SOUTH);
        new Wall(moongale,3,2,Direction.EAST);
        new Wall(moongale,2,3,Direction.SOUTH);
        new Wall(moongale,2,3,Direction.EAST);
        new Wall(moongale,1,4,Direction.SOUTH);
        //Making the right part of the stairs
        new Wall(moongale,1,5,Direction.SOUTH);
        new Wall(moongale,2,6,Direction.WEST);
        new Wall(moongale,2,6,Direction.SOUTH);
        new Wall(moongale,3,7,Direction.WEST);
        new Wall(moongale,3,7,Direction.SOUTH);
        new Wall(moongale,4,8,Direction.WEST);
        
        //Making lights (things)
        new Thing (moongale,4,1);
        new Thing (moongale,3,2);
        new Thing (moongale,2,3);
        new Thing (moongale,1,4);
        
        //Making the robot climb the stairs
        majed.move();
        //Making the robot also pick up lights while climbing
        majed.pickThing();
        majed.turnLeft();
        majed.move();
        majed.turnRight();
        majed.move();
        majed.pickThing();
        majed.turnLeft();
        majed.move();
        majed.turnRight();
        majed.move();
        majed.pickThing();
        majed.turnLeft();
        majed.move();
        majed.turnRight();
        majed.move();
        majed.pickThing();
        //Making the robot go down the right part of the stairs
        majed.move();
        //Making the robot also drop the lights at each step
        majed.putThing();
        majed.move();
        majed.turnRight();
        majed.move();
        majed.putThing();
        majed.turnLeft();
        majed.move();
        majed.turnRight();
        majed.move();
        majed.putThing();
        majed.turnLeft();
        majed.move();
        majed.turnRight();
        majed.move();
        majed.putThing();
        majed.turnLeft();
        majed.move();
    }
}
