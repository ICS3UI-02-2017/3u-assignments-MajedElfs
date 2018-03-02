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
        if (cs <= speedlimit){
            System.out.println("Congratulations, you are within the speed limit!");
        }
        if (cs > speedlimit && cs+20 <= speedlimit){
            System.out.println("You are speeding and your fine is $100");
        }
        if (cs+21 >= speedlimit && cs+30 <= speedlimit){
            System.out.println("You are speeding and your fine is $270");
    }
        if (speedlimit >= cs+31){
            System.out.println("You are speeding and your fine is $500");
}
      

    }
}
