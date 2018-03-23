/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;

import java.util.Scanner;

/**
 *
 * @author hadim9637
 */
public class A5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Repeat translation
        while (true) {
            //Getting the word
            System.out.println("Enter a word to UBBIFY!");
            String origWord = input.nextLine();
            //Sanitize the input
            origWord = origWord.toLowerCase();

            //Checking if the word starts with a vowel
      
                //Walk down the word looking for a vowel
                int length = origWord.length();
                //Use a for loop to go through all the letters
                for (int i = 0; i < length; i++) {
                    
                    //Look at the character at position 'i' and is it a vowel?
                    if (origWord.charAt(i) == 'a' || origWord.charAt(i) == 'i' || origWord.charAt(i) == 'o'|| origWord.charAt(i) == 'e' || origWord.charAt(i) == 'u') {
                        
                                
                                
                       
                     
                        
                        
                        
                                
                    
                    
                    
                }
            }
        
    }
    }
}
