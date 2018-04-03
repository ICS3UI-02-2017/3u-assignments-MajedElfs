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
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Creating a scanner
        Scanner input = new Scanner(System.in);
        //Asking how many students are in class
        System.out.println("How many students in the class?");
        int students = input.nextInt();
        //Making an array
        int[] marks = new int[students];
        //Asking for marks
        System.out.println("Enter the marks:");

        //Adding all numbers together in the array
        int sum = 0;
        for(int i = 0; i < students;){
            sum = sum + i;
        }
        System.out.println("Class average: " + sum/students);

    }
}
