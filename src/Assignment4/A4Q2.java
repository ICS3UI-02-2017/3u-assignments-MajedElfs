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
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creating a scanner to read info
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the measurement in inches you wish to convert:");
        //Creating a variable for inches
        int inches = input.nextInt();
        double cm = inches * 2.54;
        //Telling the user the converted inches
        System.out.println(inches + " inches is the same as " + cm + " cm");

    }
}
