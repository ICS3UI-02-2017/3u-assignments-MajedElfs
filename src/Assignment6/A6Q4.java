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
        for (int i = 0; i < nums.length; i++) {
            //If bigger number is first, swap numbers
            if (i + 1 >= nums.length) {
                    break;
                }
            
            if (nums[i] > nums[i + 1]) {
                //Making temporary storage int
                int temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
                
            }
        }
        System.out.println("Arranged numbers from lowest to highest: "
                + nums[0] + ", " + nums[1] + ", " + nums[3] + ", " + nums[4] + ", "
                + nums[5] + ", " + nums[6] + ", " + nums[7] + ", " + nums[8] + ", " + nums[9]);


    }
}