
class Address extends Thread
{
    public void run()
    {
        for (int i = 0; i < 10000; i++) {
            System.out.println("Kailesha Parbat");
            {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    // TODO: handle exception
                    System.out.println(e);
                }
            }
            
        }
    }


}