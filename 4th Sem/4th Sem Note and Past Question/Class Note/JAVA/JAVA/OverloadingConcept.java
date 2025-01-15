public class Overloading {    
         
    void sum()
    {

        System.out.println("This is No argument overkoading:");
    }

    void sum(int a)
    {

        System.out.println("This is single argument overkoading:" +a);
    }

    void sum(int a , int b)
    {

        System.out.println("This is two argument overkoading:" +a +"  " +b );
        
    }


}

public class OverloadingConcept {
public static void main(String[] args) {
    Overloading obj = new Overloading();
    obj.sum();
    obj.sum(5);
    obj.sum(2, 3);
    
}



}
