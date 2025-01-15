public class ThreadExample2 extends Thread {

    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("Shiva");
            {
                try {
                    Thread.sleep(500);
                } catch (Exception e) {

                    System.out.println(e);
                    
                }
            }

        }
    }

}

class ThreadExample3 extends Thread{

public void run()
{ for (int i = 0; i < 10000; i++) {
System.out.println("Kailash-Parbat");

try {
    Thread.sleep(500);

} catch (Exception e) {
    System.out.println(e);
}

}
}


    public static void main(String[] args) {
         ThreadExample2 nm = new ThreadExample2();
        ThreadExample3 ad = new ThreadExample3();
        nm.start();
        ad.start();

    }
}