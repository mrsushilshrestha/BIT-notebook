import java.util.Scanner;
public class ControlStatement {
    public static void main(String[] args) {
        
        Scanner numbers= new Scanner(System.in);

        System.out.println("Enter the Number");
        int number1 = numbers.nextInt();

        if (number1 % 2==0) 
        {
            System.out.println("The Number is Prime number " +number1);            
        }
        else
        {
            System.out.println("The Number is Odd Number " +number1);
        }
        numbers.close();
        
    }
    
}
