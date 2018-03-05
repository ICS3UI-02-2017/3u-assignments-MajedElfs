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
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Creating a scanner to read info
        Scanner input = new Scanner(System.in);
        //Asking for name
        System.out.println("Please enter for name:");
        String name = input.nextLine();

        //Asking for test marks
        System.out.println("What was the test out of?");
        double t1 = input.nextInt();
        System.out.println("What mark did you get?");
        double m1 = input.nextInt();
        System.out.println("What was the test out of?");
        double t2 = input.nextInt();
        System.out.println("What mark did you get?");
        double m2 = input.nextInt();
        System.out.println("What was the test out of?");
        double t3 = input.nextInt();
        System.out.println("What mark did you get?");
        double m3 = input.nextInt();
        System.out.println("What was the test out of?");
        double t4 = input.nextInt();
        System.out.println("What mark did you get?");
        double m4 = input.nextInt();
        System.out.println("What was the test out of?");
        double t5 = input.nextInt();
        System.out.println("What mark did you get?");
        double m5 = input.nextInt();

        //Doing math to get percentages
        double p1 = (m1 / t1) * 100;
        double p2 = (m2 / t2) * 100;
        double p3 = (m3 / t3) * 100;
        double p4 = (m4 / t4) * 100;
        double p5 = (m5 / t5) * 100;

        //Telling student their results
        System.out.println("Test scores for " + name + ":");
        System.out.println("Test 1:" + p1 + "%");
        System.out.println("Test 2:" + p2 + "%");
        System.out.println("Test 3:" + p3 + "%");
        System.out.println("Test 4:" + p4 + "%");
        System.out.println("Test 5:" + p5 + "%");

        //Getting average of all five marks
        double av = (p1 + p2 + p3 + p4 + p5) / 5;
        System.out.println("Average:" + av + "%");


    }
}
