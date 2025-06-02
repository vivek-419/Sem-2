public class ThreadImp1 extends Thread{
    Counter c1=new Counter();
    
    public ThreadImp1(Counter c1){
        this.c1=c1;
    }
    @Override
    public void run(){
        c1.increment();
    }
}
