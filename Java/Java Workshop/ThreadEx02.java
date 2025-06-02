class ThreadEx2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}


public class ThreadEx02 {
    public static void main(String[] args) {
        ThreadEx2 ex1 = new ThreadEx2();
        Thread t1 = new Thread(ex1);
        t1.start();

        ThreadEx2 ex2 = new ThreadEx2();
        Thread t2 = new Thread(ex2);
        t2.start();

    }

}