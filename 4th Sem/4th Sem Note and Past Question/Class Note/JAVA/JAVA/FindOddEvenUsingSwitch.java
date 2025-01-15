import java.util.Scanner;

public class FindOddEvenUsingSwitch {

    public static void main(String[] args) {

        Scanner scanObje = new Scanner(System.in);
        System.out.println("Enter the Numbers which operation you want to perform?");
        System.out.println("1. Please Enter 1 for odd/even");
        System.out.println("2. Please Enter 2 for Comarasion");
        System.out.println("3. Please Enter 3 for positive and Negative");

        int number = scanObje.nextInt();

        switch (number) {
            case 1:
                System.out.println("Enter the Number:");
                int CheckNumber = scanObje.nextInt();
                if (CheckNumber % 2 == 0) {
                    System.out.println("Even Number");
                } else {
                    System.out.println("Odd Number");
                }

                break;
            case 2:
                System.out.println("Enter the Number First:");
                int CheckNumber1 = scanObje.nextInt();
                System.out.println("Enter the Number Second:");
                int CheckNumber2 = scanObje.nextInt();
                if (CheckNumber1 > CheckNumber2) {
                    System.out.println("The greater Number is:" + CheckNumber1);
                } else {
                    System.out.println("The greater Number is:" + CheckNumber2);
                }

                break;

            case 3:
                System.out.println("Enter the Number:");
                int CheckNumber3 = scanObje.nextInt();

                if (CheckNumber3 > 0) {
                    System.out.println("Positive Number");
                } else {
                    System.out.println("Negative Number:");
                }

                break;

            default:
                break;
        }

    }

}
