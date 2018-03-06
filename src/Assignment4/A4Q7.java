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
        System.out.println("You are now on square " + total);

        while (total < 100) {
            System.out.println("Enter sum of dice:");
            int roll2 = input.nextInt();
            int total2 = roll1 + roll2;
            System.out.println("You are now on square " + total2);
            if (total = )
            
        }
    }
}
