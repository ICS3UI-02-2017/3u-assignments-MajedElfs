/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author hadim9637
 */
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creating a scanner
        Scanner input = new Scanner(System.in);
        //Asking for how many people
        System.out.println("Enter amount of people to be read:");
        int people = input.nextInt();
        //Making an array
        int[] all = new int[people];
        //Entering heights
        System.out.println("Enter heights:");
        double sum = 0;
        for (int i = 0; i < all.length; i++) {
            all[i] = input.nextInt();
            sum = sum + all[i];
        }
        //Finding average height
        sum = sum / all.length;
        System.out.println("Height average is " + sum);
        //Finding who is above average
        int above = 0;
        for (int i = 0; i < all.length; i++) {
            if (all[i] > sum) {
                above = above + 1;

            }
        }
        //Giving results
        System.out.println("There are " + above + " people above the height average.");

    }
}
