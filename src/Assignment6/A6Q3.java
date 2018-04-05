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
        //Asking for two numbers
        System.out.println("Enter two numbers to arrange:");
        //Making a two integer array
        int[] A = new int [2];
        A[0] = input.nextInt();
        A[1] = input.nextInt();
        
        //For loop
        for (int i = 0; i < 2; i++){
            if (A[0] < A[1]){
                System.out.println("The integers in ascending order are: " +A[0]+", " +A[1]);
                break;
            }
            if (A[0] > A[1]){
                
                
                
                
                
                
                
                
            }
        }
        }
        
    }

