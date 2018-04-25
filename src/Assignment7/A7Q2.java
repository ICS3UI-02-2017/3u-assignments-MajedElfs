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
public class A7Q2 {
    
    public static void examGrade(int grade){
        //Making a scanner
        if (grade < 50){
            System.out.println("You got an F");
        }
        if (grade >= 50 && grade <= 59){
            System.out.println("You got a D");
        }
        if (grade >= 60 && grade <= 69){
            System.out.println("You got a C");
        }
        if (grade >= 70 && grade <= 79){
            System.out.println("You got a B");
        }
        if (grade > 80){
            System.out.println("You got an A");
        }

    }
            

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("What is your exam grade?");
        Scanner input = new Scanner (System.in);
        //Asking for grade
        int grade = input.nextInt();
        //Giving result
        examGrade(grade);
        
    }
}
