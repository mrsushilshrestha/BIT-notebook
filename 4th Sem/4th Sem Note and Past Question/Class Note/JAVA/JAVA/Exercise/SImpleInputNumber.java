import java.util.Scanner;

public class SImpleInputNumber {
    public static void main(String[] args) {
        Scanner numberObj = new Scanner(System.in);
        
        System.out.println("Enter the First Number");
        int firstNumber = numberObj.nextInt();
         
        System.out.println("Enter The Second Number");
        int secondNumber = numberObj.nextInt();

        int sum = firstNumber+ secondNumber;

        System.out.println("The Sum of two number"+sum);
        
    }
    
}
