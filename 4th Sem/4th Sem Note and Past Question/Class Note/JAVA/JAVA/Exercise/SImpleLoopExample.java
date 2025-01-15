//loop example find the multipcation table
import java.util.Scanner;

public class SImpleLoopExample {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Number you want to find the Multipcation table:");
        int j = obj.nextInt();

        for (int i = 1; i <= 10; i++) {
            int temp = i * j;
            System.out.println(j + "*" + i + "=" + temp);

        }
    }

}
