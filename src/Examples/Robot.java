/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/**
 * Learning how to use the robots
 * @author Majed
 */
public class Robot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
      // Create a city for the robot
      City moongale = new City();
      
      // Put a robot in moongale
      RobotSE majed = new RobotSE(moongale,2,3,Direction.EAST);
      
      // Create a wall
      new Wall(moongale,2,5,Direction.WEST);
      new Wall(moongale,1,4,Direction.WEST);
      new Wall(moongale,0,4,Direction.WEST);
      new Wall(moongale,0,4,Direction.NORTH);
      new Wall(moongale,0,5,Direction.NORTH);
      new Wall(moongale,0,6,Direction.NORTH);
      new Wall(moongale,0,7,Direction.NORTH);
      new Wall(moongale,0,7,Direction.EAST);
      new Wall(moongale,1,7,Direction.EAST);
      new Wall(moongale,1,7,Direction.SOUTH);
      new Wall(moongale,1,6,Direction.SOUTH);
      new Wall(moongale,1,5,Direction.SOUTH);
      new Wall(moongale,0,5,Direction.SOUTH);
      new Wall(moongale,0,6,Direction.SOUTH);
      
      
      // Create a thing
      
      new Thing(moongale,2,4);
      
      // Moves the robot one space
      majed.move();
      
      // Makes the robot turn left
      majed.turnLeft();
      
      // Puts a label on the robot
      majed.setLabel("k");
             
      // Changes the colour of the robot
      majed.setColor(Color.GREEN);
      
      // Robot picks up the thing
      majed.pickThing();
      
      // Moves the robot again
      majed.move();
      
      // Puts the thing down
      majed.putThing();
      majed.move();
      
      majed.countThingsInBackpack();
      
      majed.turnRight();
      majed.move(3);
      majed.turnRight();
      majed.move();
      majed.turnRight();
      majed.move(3);
      majed.pickThing();
      majed.turnLeft();
      majed.move();
      majed.turnAround();
      majed.turnAround();
      majed.turnAround();
      if (majed.frontIsClear()){
          majed.move();
      }
     while (true){
         majed.move();
         majed.turnRight();
         majed.move(3);
         majed.turnRight();
         majed.move();
         majed.turnRight();
         majed.move(3);
         majed.turnRight();
         
     }
    }
}
