/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author hadim9637
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creating a scanner to read info
        Scanner input = new Scanner(System.in);
        //Asking for what the dice rolled
        System.out.println("Enter sum of dice:");
        int roll1 = input.nextInt();
        int total = 1 + roll1;
        //If player puts numbers that are not between 2-12, they are forced to put something in 2-12
        while (roll1 < 2) {
            System.out.println("Not a valid number, please try again.");
            roll1 = input.nextInt();
            total = 1 + roll1;
        }
        while (roll1 > 12) {
            System.out.println("Too high of a number! Please try again.");
            roll1 = input.nextInt();
            total = 1 + roll1;
        }
        System.out.println("You are now on square " + total);

        System.out.println("Enter sum of dice:");
        int roll2 = input.nextInt();
        int total2 = total + roll2;
        //If player puts numbers that are not between 2-12, they are forced to put something in 2-12
        while (roll2 < 2) {
            System.out.println("Not a valid number, please try again.");
            roll2 = input.nextInt();
            total2 = total + roll2;
        }
        while (roll2 > 12) {
            System.out.println("Too high of a number! Please try again.");
            roll2 = input.nextInt();
            total2 = total + roll2;
        }

        System.out.println("You are now on square " + total2);

        while (total < 100) {
                    System.out.println("Enter sum of dice:");
        roll2 = input.nextInt();
        total2 = total2 + roll2;
        //If player puts numbers that are not between 2-12, they are forced to put something in 2-12
        while (roll2 < 2) {
            System.out.println("Not a valid number, please try again.");
            roll2 = input.nextInt();
            total2 = total2 + roll2;
        }
        while (roll2 > 12) {
            System.out.println("Too high of a number! Please try again.");
            roll2 = input.nextInt();
            total2 = total2 + roll2;
        }
        //making it so that specific squares are snakes and can make player go down to a specific square
        if (total2 == 54){
            System.out.println("You are on a snake! You went down!");
            total2 = 19;
        }
        if (total2 == 90){
            System.out.println("You are on a snake! You went down!");
            total2 = 48;
        }
        if (total2 == 99){
            System.out.println("You are on a snake! you went down!");
            total2 = 77;
        }
        //making it so that specific squares are ladders and can make player go up to a specific square
        if (total2 == 9){
            System.out.println("There's a ladder on the square you are currently on! Up you go!");
            total2 = 34;
        }
        if (total2 == 40){
            System.out.println("There's a ladder on the square you are currently on! Up you go!");
            total2 = 64;
        }
        if (total2 == 67){
            System.out.println("There's a ladder on the square you are currently on! Up you go!");
            total2 = 86;
        }
        System.out.println("You are now on square " + total2);
        //When player reaches a hundred, they win
        if (total2 >= 100){
            System.out.println("You win!");
            
        }
    }
    }
}
