import java.util.Scanner;

/**
 *
 * @author hadim9637
 */
public class A7Q8{
    
    public static Boolean allDigitsOdd(int digit){

        int answer = digit%10;
        
        while(answer == 1 || answer == 3 || answer == 5 || answer == 7 || answer == 9){
          
            //as long as it's not down to last number
            if(digit > 10){
                //chops number off
                digit = digit/10;
                //takes the NEW last number
                answer = digit%10;
            }else{
               return true;
            }
            
            
            
        }
        return false;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Making a scanner
        Scanner input = new Scanner (System.in);
        //Asking for a digit
        System.out.println("Enter digit:");
        //Storing number into an integer
        int digit = input.nextInt();
        
        //chops last number off
        System.out.println(9/10);
        //takes last number
        System.out.println(981345%100);
       
        //Putting the integer into the method
        allDigitsOdd(digit);
        
        System.out.println(allDigitsOdd(digit));
        
        
        
    }
}
