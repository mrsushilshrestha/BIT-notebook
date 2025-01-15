import java.util.Scanner;

public class Addition {

    // void input()
    // {

    // }

    int sum(int firstNumber, int secondNumber) {
        int add;
        add = firstNumber + secondNumber;
        System.out.println("Addition is:" + add);
        return 0;

    }

    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);

        System.out.println("Enter the Two Number");
        int firstNumber = inputObj.nextInt();
        int secondNumber = inputObj.nextInt();

        Addition obj = new Addition();
        obj.sum(firstNumber, secondNumber);
    }

}
