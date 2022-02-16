import java.util.*;

public class Lab1c {
    public static void main(String[] args) {
        //Initialize random generator, scanner, counting var, and correct answer
        Random rand = new Random(42);
        Scanner s = new Scanner(System.in);
        int c = 1;
        int ans = rand.nextInt(11);

        //Prompt for initial guess
        System.out.print("Guess a number between 0 and 10: ");
        int guess = s.nextInt();

        //Loop through guesses until guess is correct
        while(true){
            if (guess == ans){
                System.out.println("Right after " + c + " guesses!");
                break;
            }
            else{
                System.out.print("<Insert Snarky Message> Guess again: ");
                guess = s.nextInt();
                c = c + 1;
            }
        }
    }
}