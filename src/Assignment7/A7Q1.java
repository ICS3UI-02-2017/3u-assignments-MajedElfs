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
public class A7Q1 {
    
    //Making a circle area method
    public static double circleArea(double radius){
        //Doing math to find out area of circle
        double area = Math.pow(radius,2) * Math.PI;
        //Send back
        System.out.println("Area of circle is " +area);
        return area;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Asking for radius
        System.out.println("Enter radius:");
        //Making a scanner to read info
        Scanner input = new Scanner(System.in);
        //Asking for a number
        double radius = input.nextDouble();
        circleArea(radius);
        
        
        
    }
}
