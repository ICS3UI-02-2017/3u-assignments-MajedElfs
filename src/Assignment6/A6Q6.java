/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author hadim9637
 */
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Making a scanner
        Scanner input = new Scanner(System.in);
        //Asking for ten numbers
        System.out.println("Enter size of class:");
        //Making an integer array
        int[] nums = new int[input.nextInt()];
        System.out.println("Enter marks:");
        //Storing numbers
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }

        //Sorting numbers 
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                //If I is bigger than J, swap
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }

            }
        }

        int first = nums[0];
        int last = nums[nums.length - 1];

        int total = 0;
        
        //Adding all numbers together
        for (int i = 0; i < nums.length; i++) {
            total = total + nums[i];

        }
        //Finding average
        int average = total / nums.length;

        System.out.println("Lowest mark in class: " + first);
        System.out.println("Highest mark in class: " + last);
        System.out.println("Average mark of class: " + average);
    }
}
