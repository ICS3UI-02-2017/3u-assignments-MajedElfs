/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author hadim9637
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    //Making a city
    City moongale = new City();
       
    //Making a robot
    RobotSE majed = new RobotSE (moongale,0,0,Direction.EAST);
    
    //Making the walls of the castle
    new Wall (moongale,1,1,Direction.EAST);
    new Wall (moongale,1,1,Direction.NORTH);
    new Wall (moongale,1,1,Direction.WEST);
    new Wall (moongale,1,1,Direction.SOUTH);
    new Wall (moongale,1,4,Direction.EAST);
    new Wall (moongale,1,4,Direction.NORTH);
    new Wall (moongale,1,4,Direction.WEST);
    new Wall (moongale,1,4,Direction.SOUTH);
    new Wall (moongale,4,1,Direction.EAST);
    new Wall (moongale,4,1,Direction.NORTH);
    new Wall (moongale,4,1,Direction.WEST);
    new Wall (moongale,4,1,Direction.SOUTH);
    new Wall (moongale,4,4,Direction.EAST);
    new Wall (moongale,4,4,Direction.NORTH);
    new Wall (moongale,4,4,Direction.WEST);
    new Wall (moongale,4,4,Direction.SOUTH);
    new Wall (moongale,2,2,Direction.NORTH);
    new Wall (moongale,2,3,Direction.NORTH);
    new Wall (moongale,2,2,Direction.WEST);
    new Wall (moongale,3,2,Direction.WEST);
    new Wall (moongale,3,2,Direction.SOUTH);
    new Wall (moongale,3,3,Direction.SOUTH);
    new Wall (moongale,3,3,Direction.EAST);
    new Wall (moongale,2,3,Direction.EAST);
    
    //Making the guard walk around the castle
    while (majed.frontIsClear()){
        majed.move(2);
        majed.turnRight();
        majed.move();
        majed.turnLeft();
        majed.move();
        majed.turnLeft();
        majed.move();
        majed.turnRight();
        majed.move(2);
        majed.turnRight();
    }
    }
}
