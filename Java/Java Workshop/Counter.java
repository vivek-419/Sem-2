public class Counter {
    int count=0;

    public void increment(){
        for(int i=0;i<1000;i++){
            count++;
        }
    }

    public void displayVal(){
        System.out.println("Count value is "+count);
    }
}
