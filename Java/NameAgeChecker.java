import java.util.Scanner;


public class NameAgeChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age;
        String name;
        boolean isStudent;

        System.out.print("Please Type Your Name: ");
        name = sc.nextLine();

        System.out.print("Enter Your Age: ");
        age = sc.nextInt();

        System.out.print("Are you a Student? (Enter ture/false): ");
        isStudent = sc.nextBoolean();

        //Group for Name
        if(name.isEmpty()){
            System.out.println("Hey You didn't Enter your Name! 🤬");
        }
        else{
            System.out.println("Hello " + name + " Your Name Looks Good 😁");
        }
        // Group for Age
        if(age >= 60){
            System.out.println("You are a Senior Person 👴");
        }
        else if(age >= 18) {
            System.out.println("You are an Adult! 🧑");
        }
        else if(age < 0){
            System.out.println("Don't waste the time 👺");
        }
        else if (age == 0){
            System.out.println("You are a Cute Baby 👶");
        }
        else{
            System.out.println("You are a Child! 👧");
        }

        // Group for Student
        if(isStudent){
            System.out.println("You are a Student 🧑‍🎓");
        }
        else{
            System.out.println("You are not a Student 🧑‍💼");
        }
        sc.close();
    }
}
