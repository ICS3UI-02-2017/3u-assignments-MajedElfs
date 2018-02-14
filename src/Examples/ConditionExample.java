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

/**
 *
 * @author hadim9637
 */
public class ConditionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      // Create a city for the robot
      City moongale = new City();
      
      // Put a robot in moongale
      RobotSE majed = new RobotSE(moongale,2,1,Direction.EAST);
      
      //creating a few things
      new Thing (moongale,2,2);
      new Thing (moongale,2,4);
      
      //Create a wall in front
      new Wall (moongale,2,5,Direction.EAST);
      
      //Move while the front is clear
      while(majed.frontIsClear()){
            //if front is clear, do this
            majed.move();    
            //Is there something to pick up?
            if (majed.canPickThing()){
            majed.pickThing();
            }
    }
      
      //When front is not clear 
      majed.turnRight();
      
      //Do you have one thing in your backpack?
      if(majed.countThingsInBackpack()==1){
          majed.move();
      }else if(majed.countThingsInBackpack()==2){
          majed.move(2);
      }else{
          majed.turnAround();
      }
          
      
      
    }
}
