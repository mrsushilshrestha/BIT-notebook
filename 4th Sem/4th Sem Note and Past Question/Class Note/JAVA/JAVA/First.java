import java.util.Scanner;

public class First {

    public static void main(String[] args) {

        int firstNumber, secondNumber, sum, div, mul;
        Scanner inputObject = new Scanner(System.in);

        System.out.println("Enter the value of first Number");
        firstNumber = inputObject.nextInt();

        System.out.println("Enter the value of second Number");
        secondNumber = inputObject.nextInt();

        sum = firstNumber + secondNumber;
        div = firstNumber / secondNumber;

        System.out.println("the sum of two number is:" + sum);
        System.out.println("the div of two number is:" + div);

        inputObject.close();

    }

}