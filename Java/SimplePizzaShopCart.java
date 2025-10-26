import java.util.Scanner;

public class SimplePizzaShopCart {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String item;
        int size;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item you need to buy: ");
        item = sc.nextLine();

        System.out.print("What size you need to buy? options are (10/12/14/16): ");
        size = sc.nextInt();

        System.out.print("What is the price of each?: ");
        price = sc.nextDouble();

        System.out.print("How many did you need: ");
        quantity = sc.nextInt();

        total = price * quantity;
        System.out.println("\nYou have bought " + quantity + " " + item + "s");

        System.out.println("Your total is " + currency + total);
        sc.close();
    }
}
