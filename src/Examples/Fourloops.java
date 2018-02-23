/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author hadim9637
 */
public class Fourloops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Making a city
        City moongale = new City();

        //Making a robot
        RobotSE majed = new RobotSE(moongale, 1, 1, Direction.EAST);

        // counted while loop
        int numberOfMoves = 5;
        //If there are still moves to do
        while (numberOfMoves > 0) {
            majed.move();
            numberOfMoves = numberOfMoves - 1;

        }
        majed.turnAround();

        //Counting the other way
        numberOfMoves = 0;
        while (numberOfMoves < 5) {
            majed.move();
            numberOfMoves = numberOfMoves + 1;
        }

        majed.turnAround();

        //Use a four loop to move
        for (int count = 0; count < 5; count++) {
            majed.move();
        }



        for (int count = 0; count < 10; count++) {
            majed.move();
        }


        int x = 10;
        x = x + 5; //adds 5
        x += 5; //adds 5

        x -= 10; // subtracts 10
        x = x - 10; //subtracts 10

        x *= 2; // multiply by 2
        x = x * 2; //multiply by 2

        x /= 4; // divide by 4
        x = x / 4; //divide by 4
        
        //modulus or modulo
        int remainder = 5 % 2;
        int quotient = 5 / 2;
        
        
        if(majed.frontIsClear()){
            if (majed.canPickThing()){
                majed.move();
            }
                    
        }
            
        if (majed.frontIsClear() && majed.canPickThing() == true){
            majed.move();
        }
        
        
        
    }
}
