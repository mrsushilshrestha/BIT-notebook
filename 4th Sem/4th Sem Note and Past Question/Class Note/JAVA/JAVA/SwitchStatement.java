import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {

        Scanner numberObject = new Scanner(System.in);
        System.out.println("Enter the Number (1-7):");

        int number = numberObject.nextInt();

        // switch statement syntax.
        switch (number) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tusday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thusday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Wrong Value");
                break;
                
        }

    }

}
