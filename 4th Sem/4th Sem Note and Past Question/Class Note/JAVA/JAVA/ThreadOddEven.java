public class ThreadOddEven extends Thread{
    public void run()
    {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i*2);
            
        }
    }
    public static void main(String[] args) {
        ThreadOddEven EN = new ThreadOddEven();
        EN.start();
        
        
    }
}
