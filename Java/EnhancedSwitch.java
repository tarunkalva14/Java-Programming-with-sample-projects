import java.util.Scanner;
public class EnhancedSwitch {
    public static void  main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day of the week: ");
        String day = sc.nextLine();

        switch (day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
                    System.out.println(day + " is a weekday 😒");

            case "Saturday" -> System.out.println(day + " is a weekend. It's time to rock 😁");
            case "Sunday" -> System.out.println(day + " is a weekend. It's time for party 😁");
            default -> System.out.println(day + " it is not a day");
        }

        sc.close();
    }

}
