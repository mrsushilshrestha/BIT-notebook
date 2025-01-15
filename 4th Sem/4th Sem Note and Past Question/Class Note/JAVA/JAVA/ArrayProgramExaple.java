import java.util.Scanner;

public class ArrayProgramExaple {

    public static void main(String[] args) {
        Scanner ArryObje = new Scanner(System.in);

        System.out.println("Enter the array Size you want to Create");
        int Size = ArryObje.nextInt();
        int a[]=new int[Size];
        

      

        // initializing array
        System.out.println("Enter the element of array:");

        for (int i = 0; i <Size; i++) {

           a[i]=ArryObje.nextInt();
            
        }
        System.out.println("Your Element:");
        for(int i=0;i<Size;i++)
        {
            System.out.println(a[i]);
        }
        ArryObje.close();

      

    }

}
