import java.util.Scanner;

public class MakingCalculator {
    public static void main(String[] args) {

        // taking data from user
        Scanner CalculatorObject = new Scanner(System.in);

        // take a two number from users
        System.out.println("Enter the two numbers:");
        System.out.println("Number First:");
        double firstNumber = CalculatorObject.nextDouble();

        System.out.println("Second Number:");
        double secondNumber = CalculatorObject.nextDouble();

        // take a operator(symbol) from users
        System.out.println("Enter the Symbol (+,-,/,*,%):");
        char operator = CalculatorObject.next().charAt(0);

        // switch statement
        switch (operator) {

            case '+':
                System.out.println("Sum of two number is " + (firstNumber + secondNumber));
                break;

            case '-':
                System.out.println("Subtract of two number is " + (firstNumber - secondNumber));
                break;

            case '*':
                System.out.println("Multiplication of two number is " + (firstNumber * secondNumber));
                break;

            case '/':
                System.out.println("Division of two number is " + (firstNumber / secondNumber));
                break;

            case '%':
                System.out.println("Modulous of two number is " + (firstNumber % secondNumber));
                break;

            default:
                System.out.println("Wrong Operator");
                break;
        }

        CalculatorObject.close();

    }

}
