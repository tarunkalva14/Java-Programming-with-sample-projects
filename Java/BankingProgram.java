import java.util.Scanner;

public class BankingProgram {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        // BANKING PROGRAM

        double balance = 0;
        boolean isRunning = true;
        int choice;

        while(isRunning){
            System.out.println("**************************");
            System.out.println("Welcome to Simple Java Banking Program");
            System.out.println("**************************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. WithDraw");
            System.out.println("4. EXIT");
            System.out.println("**************************");

            System.out.print("Enter your choice (1-4): ");
            choice = sc.nextInt();

            switch (choice){
                case 1 -> showBalance(balance);
                case 2 -> balance +=deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("ERROR OCCUERED TRY AGAIN!!");

            }
        }
        System.out.println("😁😁😁😁😁😁😁😁😁😁😁😁😁😁");
        System.out.println("THANK YOU! HAVE A NICE DAY!! SEE YOU AGAIN!!");
        System.out.println("😁😁😁😁😁😁😁😁😁😁😁😁😁😁");
        sc.close();
    }
    static void showBalance(double balance){
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.printf("$%.2f\n", balance);
    }
    static double deposit(){

        double amount;

        System.out.print("Enter the amount need to be deposited: ");
        amount = sc.nextDouble();
        if(amount < 0){
            System.out.println("Hey check the amount you entered it can't be negative");
            return 0;
        }
        else {
            return amount;
        }
    }
    static double withdraw(double balance) {

        double amount;

        System.out.print("Enter the amount need to Withdraw from your account: ");
        amount = sc.nextDouble();

        if (amount > balance) {
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        }
        else if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        }
        else {
            return amount;
        }
    }

}
