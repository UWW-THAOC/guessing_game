
import java.util.Scanner;



public class GuessingGame {
    
    public static void main(String[] args){
        //this number is hard coded!
        //some more comments.
        int n = 5;
        System.out.print("What is the number I'm thinking of?");
        int answer = new Scanner(System.in).nextInt();
        if (n==answer){
            System.out.println("You got it.");
        }
    }

}
