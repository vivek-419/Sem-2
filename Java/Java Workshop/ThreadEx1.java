public class ThreadEx1 extends Thread {
    // threads can be crearted in 2 ways. 
    // 1. By extending thread class 
    // 2. By creating a runnable interface
    @Override
    public void run()
    {
        for (int i = 0; i <= 50 ; i++)
        {
            System.out.println("Squares 0f " +i+ " is "+(i*i));
        }
    }

    public static void main(String[] args) {
        ThreadEx1 t1 = new ThreadEx1();
        ThreadEx1 t2 = new ThreadEx1();
        ThreadEx1 t3 = new ThreadEx1();
        t1.start();
        t2.start();
        t3.start();
    }
}