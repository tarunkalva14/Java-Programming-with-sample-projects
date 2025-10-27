import java.util.Scanner;

public class WieghtConversion {
    public static void main(String[] args){

    // WEIGHT CONVERSION PROGRAM
        // Declare Variables
        //Welcome Message
        //Prompt for User Choice
        //Option1 convert lbs to kgs
        //Option2 convert kgs to lbs

        Scanner sc = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Hello! Welcome to Weight conversion program 💪");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        System.out.print("Choose the Options (option1//option2): ");
        choice = sc.nextInt();

        if(choice == 1){
            System.out.print("Enter your weight in lbs: ");
            weight = sc.nextDouble();
            newWeight = weight * 0.453;
            System.out.printf("Your weight after converting into kgs is: %.2f kgs",newWeight);
        }
        else if(choice == 2){
            System.out.print("Enter your weight in kgs: ");
            weight = sc.nextDouble();
            newWeight = weight * 2.204;
            System.out.printf("Your weight after converting into lbs is: %.2f lbs",newWeight);
        }
        else{
            System.out.println("That's not a valid choice try again!!");
        }
        sc.close();
    }

}
