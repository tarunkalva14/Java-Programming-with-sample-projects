import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

public class DiceRoller {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numDice;
        int total = 0;

        System.out.print("Enter the number of dice(🎲) to roll: ");
        numDice = sc.nextInt();

        if(numDice > 0){
            for(int i = 0; i < numDice; i++){
                int roll = random.nextInt(1, 7);
                printDie(roll);
                System.out.println("You rolled the 🎲: " + roll);
                total += roll;
            }
            System.out.println("Total: " + total + " 🎲");
        }
        else{
            System.out.println("The number must be grater than Zero(0)");
        }


        sc.close();
    }
    static void printDie(int roll){
        String dice1 = """
                -------
               |       |
               |   ●   |
               |       |
                -------
               """;

        String dice2 = """
                -------
               | ●     |
               |       |
               |     ● |
                -------
               """;

        String dice3 = """
                -------
               | ●     |
               |   ●   |
               |     ● |
                -------
               """;
        String dice4 = """
                -------
               | ●   ● |
               |       |
               | ●   ● |
                -------
               """;

        String dice5 = """
                -------
               | ●   ● |
               |   ●   |
               | ●   ● |
                -------
               """;

        String dice6 = """
                -------
               | ●   ● |
               | ●   ● |
               | ●   ● |
                -------
               """;
        switch(roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.print("Invalid roll");
        }
    }
}
