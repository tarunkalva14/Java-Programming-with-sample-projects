
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String userChoice;
        String computerChoice;
        String playAgain = "yes";

        do{
            System.out.print("Enter your choice of move (rock, paper, scissors) : ");
            userChoice = sc.nextLine().toLowerCase();

            if(!userChoice.equals("rock") &&
                    !userChoice.equals("paper") &&
                    !userChoice.equals("scissors")){
                System.out.println("You Chosen Invalid One! Just Choose Only (rock,paper,scissors)!!");
                continue;

            }

            computerChoice = choices[random.nextInt(3)];
            System.out.println("ComputerChoice: " + computerChoice);

            if(userChoice.equals(computerChoice)){
                System.out.println("It's a Tie Game");
            }
            else if((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You Won The Game!!");
            }
            else{
                System.out.println("You Lost The Game! Try Again..");
            }

            System.out.print("Play Again (yes/no): ");
            playAgain = sc.nextLine().toLowerCase();
        }while(playAgain.equals("yes"));
        System.out.println("THANKS FOR PLAYING THE GAME WITH ME 😁");
        sc.close();
    }
}
