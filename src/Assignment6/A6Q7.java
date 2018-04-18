/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author hadim9637
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Making a scanner
        Scanner input = new Scanner(System.in);
        //Making for loop to 1000
        int[] nums = new int[1001];
        for (int i = 2; i < nums.length; i++) {
            nums[i] = i;

        }

        // p represents amount of multiples we iterate through.
        for (int p = 2; p < 100; p++) {

            //the numbers 
            for (int i = 2; i < nums.length; i++) {

                int temp = i * p;
                if (temp <= 1000) {
                    nums[temp] = 0;
                }
            }

        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                System.out.println(nums[j]);
            }

        }

    }
}
