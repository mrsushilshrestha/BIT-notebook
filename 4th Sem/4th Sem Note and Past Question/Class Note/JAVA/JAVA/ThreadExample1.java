public class ThreadExample1 implements Runnable {

    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(1 + i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }

    public static void main(String[] args) {
        ThreadExample1 obj = new ThreadExample1();
        Thread th = new Thread(obj);
        th.start();
    }

}
