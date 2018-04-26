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
public class A7Q3 {

    public static void factors(int num) {
        for (int i = 1; i <= num; i++) {
            //If given number can be divided by i, print it.
            if (num % i == 0) {
                System.out.print(i + ", ");
            }

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        //Asks for a number
        int num = input.nextInt();
        factors(num);
    }
}
