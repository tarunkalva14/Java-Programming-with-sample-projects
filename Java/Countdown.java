import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many seconds for countdown starts: ");
        int start = sc.nextInt();

        for(int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println(" 🎉🎉 HAPPY BIRTHDAY 🥳🥳");
        sc.close();
    }
}
