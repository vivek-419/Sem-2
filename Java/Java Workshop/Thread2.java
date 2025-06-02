public class Thread2 {
    public static void main(String[] args) {
        
        Counter c= new Counter();
        ThreadImp1 t1 = new ThreadImp1(c);
        ThreadImp1 t2 = new ThreadImp1(c);
        t1.start();
        t2.start();
        try{
            t1.join();
        t2.join();}
        catch(InterruptedException e){
            e.printStackTrace();
        }
        c.displayVal();
    }

    
}