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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         //Making a city
       City moongale = new City();
       
       //Making a robot start at its "bed"
       RobotSE elf = new RobotSE (moongale,1,2,Direction.SOUTH);
    }
}
