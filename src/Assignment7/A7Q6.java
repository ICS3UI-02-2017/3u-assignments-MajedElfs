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
public class A7Q6 {

    public static int lastDigit(int digit) {
        //Making int for the last number
        int last = digit % 10;
        //If the number is negative, multiply it by -1 to make it positive
        if (last < 0) {
            last = last * -1;
        }
        System.out.println(last);
        //Returning
        return last;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Making a scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a digit to pull apart and get the last number");
        //Asking for a digit
        int digit = input.nextInt();
        lastDigit(digit);
    }
}
