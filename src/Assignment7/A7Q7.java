/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import static Assignment7.A7Q6.lastDigit;
import java.util.Scanner;

/**
 *
 * @author hadim9637
 */
public class A7Q7 {

    public static int firstDigit(int digit) {
        //Making int for the first number
        int first = digit / 10;
        //If the number is negative, multiply it by -1 to make it positive
        if (first < 0) {
            first = first * -1;
        }
        //Keep dividing by ten until there is one term
        while (first >= 10) {
            first = first / 10;
        }
        //Print
        System.out.println(first);
        //Returning
        return first;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Making a scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a digit to pull apart and get the first number");
        //Asking for a digit
        int digit = input.nextInt();
        firstDigit(digit);


    }
}
