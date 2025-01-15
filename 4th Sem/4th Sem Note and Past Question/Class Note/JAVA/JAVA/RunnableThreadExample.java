public class RunnableThreadExample implements Runnable{

    public void run()
    {
        System.out.println("This is Runnable Thread Example");
    }
    public static void main(String[] args) {
        
        RunnableThreadExample obj = new RunnableThreadExample();
        Thread th = new Thread(obj);
        th.start();
    }
    
}
