/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 *
 * @author hadim9637
 */
public class A7Q4 {

    public static double compoundInterest(double p, double r, int n) {
        //Creating a new double for balance
        double b = 0;
        //Formula B=P(1+r)^n
        b = p * Math.pow(1 + r, n);
        System.out.println(b);
        return b;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Asking for information
        Scanner input = new Scanner(System.in);
        System.out.println("What is the initial principal?");
        double p = input.nextDouble();
        System.out.println("What is the interest rate?");
        double r = input.nextDouble();
        System.out.println("How many years?");
        int n = input.nextInt();
        //Puts information into method and then returns it
        compoundInterest(p, r, n);


    }
}
