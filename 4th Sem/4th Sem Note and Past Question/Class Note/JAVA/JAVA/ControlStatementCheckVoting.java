import java.util.Scanner;

public class ControlStatementCheckVoting {
    public static void main(String[] args) {
           
    
        Scanner ageObject= new Scanner(System.in);

        System.out.println("Enter the your age");
        int ages = ageObject.nextInt();

        if (ages>=18) 
        {
            System.out.println("Congratulation");            
        }
        else
        {
            System.out.println("Sorry");
        }
        ageObject.close();
    }
    
}
