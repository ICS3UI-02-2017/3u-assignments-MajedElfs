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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creating a scanner to read info
        Scanner input = new Scanner(System.in);
        //Creating strings to store info
        System.out.println("How much does the food for prom cost?");
        int food = input.nextInt();
        System.out.println("How much does the DJ cost?");
        int dj = input.nextInt();
        System.out.println("How much does it cost to rent the hall?");
        int hall = input.nextInt();
        System.out.println("How much does decorations cost?");
        int deco = input.nextInt();
        System.out.println("How much does it cost for staff?");
        int staff = input.nextInt();
        System.out.println("How much for miscellaneous costs?");
        int misc = input.nextInt();

        //Creating integers for the cost and amount of tickets
        int cost = food + dj + hall + deco + staff + misc;
        double tickets = Math.ceil(cost / 35.0);
        //Telling user the cost and amount of tickets
        System.out.println("The total cost is $" + cost + ". You will need to sell " + tickets + " tickets to break even.");

    }
}
