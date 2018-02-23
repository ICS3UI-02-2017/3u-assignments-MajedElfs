/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author hadim9637
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Making a city
        City moongale = new City();
        //Turning on the thing counter
        moongale.showThingCounts(true);

        //Making a robot
        RobotSE majed = new RobotSE(moongale, 0, 0, Direction.EAST);
        
        //Creating a pile of 10 things
        new Thing(moongale,0,0);
        new Thing(moongale,0,0);
        new Thing(moongale,0,0);
        new Thing(moongale,0,0);
        new Thing(moongale,0,0);
        new Thing(moongale,0,0);
        new Thing(moongale,0,0);
        new Thing(moongale,0,0);
        new Thing(moongale,0,0);
        new Thing(moongale,0,0);
        
        //Creating a variable
        int numberOfMoves = 10;
        //Checking if there are any moves left
        while (numberOfMoves >0){
            //Making the robot pick up thing and put it on next avenue repeatedly
            majed.pickThing();
            majed.move();
            majed.putThing();
            majed.turnAround();
            majed.move();
            majed.turnAround();
            numberOfMoves = numberOfMoves - 1;
            }
              majed.move();
        }
        }
    

