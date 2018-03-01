/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author hadim9637
 */
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Use a scanner to read info
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, please enter your name!");
        //Make a String to store a name
        String name = input.nextLine();
        
        //Making computer respond when given name
        System.out.println("Hello " +name +"! How are you today?");
        
    }
}
