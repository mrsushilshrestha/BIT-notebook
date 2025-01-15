import java.util.Scanner;

public class SimpleCharTake {

    public static void main(String[] args) {

        Scanner nameObject = new Scanner(System.in);

        // System.out.println("Enter The character Data(a to Z): ");
        //  char name = nameObject.next().charAt(0);

        System.out.println("Enter The String Data (Sushil):");
        String nameString = nameObject.nextLine();

        //System.out.println("The Char is " +name);
         System.out.println("The String is " +nameString);


        //full name Print program
              
        System.out.println("Enter The First Name");
        String fname = nameObject.nextLine();

        System.out.println("Enter The Last Name");
        String lname = nameObject.nextLine();

        System.out.println("Full Name is: " +fname +" " +lname);
         

        

         nameObject.close();

    }

}
