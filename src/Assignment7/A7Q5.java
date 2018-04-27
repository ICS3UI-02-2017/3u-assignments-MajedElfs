/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

/**
 *
 * @author hadim9637
 */
public class A7Q5 {

    public static void chaotic(String randAster) {
        while (true) {
            //Creating a random number
            int randNum = (int) (Math.random() * (5 - 1 + 1)) + 1;
            //Making * per number
            for (int i = 0; i < randNum; i++) {
                System.out.print("*");
            }
            //Creating a new line for a new randomly generated series of asterisks
            System.out.println("");
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String randAster = new String();
        chaotic(randAster);

    }
}
