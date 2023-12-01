/* Comment for Github Assignment */
import java.util.Scanner;

public class HangmanApp {

    public static void main(String[] args) {
        // welcome the user to the program
        System.out.println("Play the H A N G M A N game");
        
        // initialize scanner variable
        Scanner sc = new Scanner(System.in); 
        
        // while loop to keep playing hangman until the user decides to stop
        String again = "y";        
        while(again.equalsIgnoreCase("y")) {
            
            // play hangman
            var hangman = new Hangman();
            hangman.drawHangman(7);
            hangman.playGame();
            System.out.println();
            
            // ask the user if they wish to play again
            System.out.print("Play again? (y/n): ");
            again = sc.nextLine();
        }
    } 
}