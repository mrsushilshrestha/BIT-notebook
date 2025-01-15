public class Name extends Thread {
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("Shiva");
            {
                try {
                    Thread.sleep(500);
                } catch (Inter e) {

                    System.out.println(e);

                }
            }

        }
    }
}