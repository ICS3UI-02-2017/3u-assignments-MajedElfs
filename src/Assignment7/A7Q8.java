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
public class A7Q8 {
    
    public static void allDigitsOdd(int digit){
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Making a scanner
        Scanner input = new Scanner (System.in);
        //Asking for a digit
        System.out.println("Enter digit:");
        //Storing number into an integer
        int digit = input.nextInt();
        //Putting the integer into the method
        allDigitsOdd(digit);
        
    }
}
