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
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Making a scanner
        Scanner input = new Scanner(System.in);
        //Asking for ten numbers
        System.out.println("Enter ten numbers to arrange:");
        //Making a ten integer array
        int[] nums = new int[10];

        //Storing ten numbers
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }
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
        System.out.println("Arranged numbers from lowest to highest: ");
        //Printing all numbers
        for (int i = 0; i < nums.length; i++) {
            int j = nums[i];
            //When printing last number, do not add a comma
            if (j == nums.length) {
                System.out.print(+j + " ");
                break;
            }
            System.out.print(+j + ", ");

        }


    }
}