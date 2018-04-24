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
public class MethodsExample {

    //the hello world method to
    
    public static void helloWorld(){
        System.out.println("Hello world");
    }
    
    public static void sayHello(String name){
        System.out.println("Hello " +name);
    }
    //Calculate the right hand root
    public static double[] quadForm(double a, double b, double c){
        //Store both roots
        double[]roots = new double[2];
        double discrim = b*b - 4*a*c;
        roots[0] = (-b + Math.sqrt(discrim)) / (2 * a);
        roots[1] = (-b - Math.sqrt(discrim)) / (2 * a);
        //Send back 
        return roots;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        helloWorld();
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String user = in.nextLine();
        sayHello(user);
        
        //Calculate 
       
        
        double[]roots = quadForm(1,-5,-50);
        System.out.println("The roots are "+roots[0] +", " +roots[1]);
        
    }
}
