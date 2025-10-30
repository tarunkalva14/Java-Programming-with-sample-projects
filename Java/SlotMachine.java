import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {

        // SLOT MACHINE GAME

        Scanner sc = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        System.out.println("*************************");
        System.out.println(" WELCOME TO SLOT MACHINE ");
        System.out.println("Symbols: 🍋 ⭐ 🍇 🍉 🔔 ");
        System.out.println("*************************");

        while(balance > 0){
            System.out.println("Current balance: $" + balance);
            System.out.print("Enter the amount you need to bet: ");
            bet = sc.nextInt();
            sc.nextLine();

            if(bet > balance){
                System.out.println("INSUFFICIENT FUNDS");
                continue;
            }
            else if(bet <= 0){
                System.out.println("Bet Amount Should be Greater than zero(0)");
                continue;
            }
            else {
                balance -= bet;
            }
            System.out.println("Spinning.....");
            row = spinRow();
            printRow(row);
            payout = getPageLayout(row, bet);

            if(payout > 0){
                System.out.println("You won the Game $" + payout);
                balance += payout;
            }
            else{
                System.out.println("You lost this time!! Try Again");
            }

            System.out.print("You Wanna Play Again (Y/N): ");
            playAgain = sc.nextLine().toUpperCase();

            System.out.println("GAME OVER!! Your Final Balance is $" + balance);
        }
        sc.close();
    }
    static String[] spinRow(){

        String[] symbols = {"🍋", "⭐", "🍇", "🍉", "🔔"};
        String[] row = new String[3];
        Random random = new Random();

        for(int i = 0; i < 3; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
    }
    static void printRow(String[] row){
        System.out.println("****************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("****************");
    }
    static int getPageLayout(String[] row, int bet){

        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch (row[0]){
                case "🍋" -> bet * 3;
                case "⭐" -> bet * 4;
                case "🍇" -> bet * 5;
                case "🍉" -> bet * 7;
                case "🔔" -> bet * 10;
                default -> 0;
            };
        }
        else if(row[0].equals(row[1])) {
            return switch (row[0]) {
                case "🍋" -> bet * 2;
                case "⭐" -> bet * 3;
                case "🍇" -> bet * 4;
                case "🍉" -> bet * 6;
                case "🔔" -> bet * 8;
                default -> 0;
            };
        }
        else if(row[1].equals(row[2])) {
            return switch (row[1]) {
                case "🍋" -> bet * 2;
                case "⭐" -> bet * 3;
                case "🍇" -> bet * 4;
                case "🍉" -> bet * 6;
                case "🔔" -> bet * 8;
                default -> 0;
            };
        }
        return 0;
    }


}
