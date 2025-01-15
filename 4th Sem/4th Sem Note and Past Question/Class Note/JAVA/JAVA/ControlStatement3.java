import java.util.Scanner;
public class ControlStatement3 {
    public static void main(String[] args) {

        Scanner markObject = new Scanner(System.in);

        System.out.println("Enter the Number:");
        double marks= markObject.nextDouble();
        
        if (marks>=90) 
        {
            System.out.println("Topper");
            
        }

    }
    
}

