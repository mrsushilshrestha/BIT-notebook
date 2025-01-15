public class ThreadPractice extends Thread{

    public void run()
    {
        System.out.println("Thread is Running...");
    }

    public static void main(String[] args) {
        ThreadPractice th = new ThreadPractice();
        th.start();
    }
    
}


