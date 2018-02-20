/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author hadim9637
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    //Making a city
    City moongale = new City();
       
    //Making a robot
    RobotSE majed = new RobotSE (moongale,1,1,Direction.EAST);
       
    //Making ten Things
    new Thing (moongale,1,2);
    new Thing (moongale,1,3);
    new Thing (moongale,1,4);
    new Thing (moongale,1,5);
    new Thing (moongale,1,6);
    new Thing (moongale,1,7);
    new Thing (moongale,1,8);
    new Thing (moongale,1,9);
    new Thing (moongale,1,10);
    new Thing (moongale,1,11);
        
    /*Making robot move through the ten things but needs to pick up seven
    * Things only
    */
    
    while(majed.countThingsInBackpack()<7){
        majed.move();
        if (majed.countThingsInBackpack()<7){
            majed.pickThing();
        }
        
    }
    
    majed.move(4);
    
    }
}
