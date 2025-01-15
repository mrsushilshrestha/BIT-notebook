import java.util.Scanner;
public class SimpleIntrest {

    public static void main(String[] args) {
          Scanner si = new Scanner(System.in);

          System.out.println("Enter the Principle Amount:");
          double PrincipleAmount = si.nextDouble();
          double p=PrincipleAmount;

          System.out.println("Enter the Time: ");
          double Time = si.nextDouble();
          double t=Time;

          System.out.println("Enter the Rate: ");
          double Rate = si.nextDouble();
          double r=Rate;

          double SumOfSimpleIntrest= (p*t*r)/100;

          System.out.println("The Simple Interst is: " +SumOfSimpleIntrest);





        
    }
    
    
}
