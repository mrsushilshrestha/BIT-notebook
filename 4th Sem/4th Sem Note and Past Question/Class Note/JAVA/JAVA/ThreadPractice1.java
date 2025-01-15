public class ThreadPractice1 implements Runnable{

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            {
                try {
                    Thread.sleep(1000);

                } 
                catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }

    public static void main(String[] args) {
        ThreadPractice1 obj = new ThreadPractice1();
        Thread th1 = new Thread(obj);
        th1.start();
    }
}
