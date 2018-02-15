/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author hadim9637
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    //Making a city
    City moongale = new City();
       
    //Making a robot
    RobotSE majed = new RobotSE (moongale,8,5,Direction.EAST);
    
    //Making robot able to locate where it is in the city
    
    while(majed.getAvenue()>0){
        majed.move();
        if (majed.getDirection()!=WEST){
            
        }
            
    }
    
    if(majed.getStreet()>0){
        
    }
        
    }
}
