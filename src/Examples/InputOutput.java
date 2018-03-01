/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import java.util.Scanner;

/**
 *
 * @author hadim9637
 */
public class InputOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Print a line of text
        System.out.println("Hello World!");
        System.out.println("Another Line..");
        //Nothing = empty space
        System.out.println("");
        System.out.println("sout TAB to auto-complete");
        //Printing on the same line
        System.out.print("I like ");
        System.out.print("cake!");
        
        //Printing special characters
        //Quotation marks
        System.out.println("\"I'm in quotation marks!\"");
        //Slash
        System.out.println("\\A slash!\\");
        //Tab
        System.out.println("\t Hello \t Test");
        //A new line
        System.out.println("First line \n Second line");
        
        //Make a number output to the screen
        int number = 10;
        System.out.println(number);
        System.out.println("Number = "+number);
        System.out.println("Number = "+number +" YAY");
        
        
        //Use a scanner to read info
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Please enter your name: "); 
        //Make a String to store a name
        String name = input.nextLine();
        //Say hello
        System.out.println("Hello " +name);
        
        //Ask what year they were born
        System.out.println("What year were you born?");
        //Make a variable to store the year
        int birthyear = input.nextInt();
        int age = 2018 - birthyear;
        //The you're an idiot loop
        while (age<0){
            System.out.println("Try again.");
            birthyear = input.nextInt();
            age = 2018 - birthyear;
                    
        }
        //tell the user
        System.out.println("Your are "+age +" years old!");
        
        if(age<0){
            System.out.println("I don't think so!");
        }else if (age>30){
            System.out.println("You are old!");
        }
    }
}
