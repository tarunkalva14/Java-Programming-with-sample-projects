import java.util.Scanner;

public class doWhileLoops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = 0;

        do{
            System.out.print("Enter the number between (1 - 10): ");
            num = sc.nextInt();
        }while(num < 1 || num > 10);

        System.out.println("You chosen " + num + " it's in range");


        sc.close();
    }
}
