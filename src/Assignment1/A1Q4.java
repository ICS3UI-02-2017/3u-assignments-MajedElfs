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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    //Making a city
    City moongale = new City();
        
    //Making the first robot
    RobotSE elf = new RobotSE (moongale,0,0,Direction.SOUTH);
        
    //Making the second robot
    RobotSE cat = new RobotSE(moongale,0,1,Direction.SOUTH);
    
    //Making the walls between the robots
    new Wall (moongale,0,1,Direction.WEST);
    new Wall (moongale,1,1,Direction.WEST);
    new Wall (moongale,1,1,Direction.SOUTH);
    
    //Making the robots move so that they can end up on top of each other
    //First robot's movement
    elf.move(2);
    elf.turnLeft();
            
    //Second robot's movement
    cat.move();
    cat.turnLeft();
    cat.move();
    cat.turnRight();
    cat.move();
    cat.turnRight();
    
    //Both robots end up on top of each other
    elf.move();
    cat.move();
    }
}
