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
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Making a scanner
        Scanner input = new Scanner (System.in);
        //Making a two integer array
        int[] A = new int [2];
        //Asking for two numbers
        System.out.println("Enter two numbers to arrange:");
        //For loop
        for (int i = 0; i < 2; i++){
            if (A[1] < A[2]){
                System.out.println("The integers in ascending order are:" +A);
            }
        }
        
        
    }
}
