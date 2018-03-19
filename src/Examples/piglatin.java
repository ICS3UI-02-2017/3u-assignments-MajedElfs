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
public class piglatin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        //Repeat the translation
        while(true){
            //get the wrod to translate
            System.out.println("Enter a word to translate");
            String origWord = input.nextLine();
            //Sanitize the input
            origWord = origWord.toLowerCase();
            
            //do we start with a vowel?
            if (origWord.startsWith("a")|| origWord.startsWith("e") || origWord.startsWith("o") || origWord.startsWith("i") || origWord.startsWith("u")){
                //Stick "ay" at the end of the word
                String transWord = origWord + "ay";
                System.out.println("Original word: "+origWord+". Translated word: "+transWord);
            }else{
                //Walk down the word looking for a vowel
                int length = origWord.length();
                //Use a for loop to go through all letters
                for(int i = 0; i < length; i++){
                    //Look at the character at position 'i' and is it a vowel?
                    if (origWord.charAt(i)== 'a'||origWord.charAt(i)== 'i'||origWord.charAt(i)== 'e'||origWord.charAt(i)== 'o'||origWord.charAt(i)== 'u'){
                        //'i' is the position of the vowel
                        String start = origWord.substring(0,i);
                        String end = origWord.substring(i);
                        //Translated word
                        String transWord = end + start + "ay";
                        System.out.println(origWord+" in pig latin is "+transWord);
                        
                        //Done looking so stop the loop
                        break;
                    }
                }
            }
            
        }
        
    }
}
