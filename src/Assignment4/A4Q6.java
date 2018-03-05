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
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creating a scanner to store info
        Scanner input = new Scanner(System.in);
        //Asking for speed limit
        System.out.println("Please enter the speed limit:");
        int speedlimit = input.nextInt();
        System.out.println("Enter the recorded speed of the car:");
        int cs = input.nextInt();
        if (cs <= speedlimit) {
            System.out.println("Congratulations, you are within the speed limit!");
        }
        if (cs > speedlimit && cs <= speedlimit + 20) {
            System.out.println("You are speeding and your fine is $100");
        }
        if (cs >= speedlimit + 21 && cs <= speedlimit + 30) {
            System.out.println("You are speeding and your fine is $270");
        }
        if (speedlimit + 31 <= cs) {
            System.out.println("You are speeding and your fine is $500");
        }


    }
}
