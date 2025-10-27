import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double n1;
        double n2;
        char operator;
        double result = 0;
        boolean validOperator = true;

        System.out.print("Enter the first number: ");
        n1 = sc.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, ^, %): ");
        operator = sc.next().charAt(0);

        System.out.print("Enter the second number: ");
        n2 = sc.nextDouble();

        switch(operator){
            case '+' -> result = n1 + n2;
            case '-' -> result = n1 - n2;
            case '*' -> result = n1 * n2;
            case '/' -> {
                if(n2 == 0){
                    System.out.println("You cannot divide the number by Zero");
                    validOperator = false;
                }
                else{
                    result = n1 / n2;
                }
            }
            case '^' -> result = Math.pow(n1, n2);
            default -> {
                System.out.println("You Entered Invalid Operator. Please Enter the valid operator");
                validOperator = false;
            }
            case '%' -> result = n1 % n2;
        }
        if(validOperator) {
            System.out.println(result);
        }
        sc.close();
    }
}
