import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args){

        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 200;
        int randomNumber = rd.nextInt(min, max + 1);

        System.out.println("Welcome to Number Guessing Game 🎮🎮 😁");
        System.out.printf("Guess a number between %d-%d\n", min, max);
        do{
            System.out.print("Guess the Number: ");
            guess = sc.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("Too Low Buddy Try Again! ");
            }
            else if(guess > randomNumber){
                System.out.println("Too High Buddy Try Again!");
            }
            else{
                System.out.println("CORRECT! You made it " + randomNumber);
                System.out.println("# of attempts " + attempts);
            }
        }while(guess != randomNumber);

        System.out.println("You won the game. Keep it up 👍");
        sc.close();

    }
}
