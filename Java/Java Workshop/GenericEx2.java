public class GenericEx2 {
    public static <T,V> void getAddition(T num1, V num2) {
        System.out.println("Num 1 is "+num1);
        System.out.println("Num 2 is "+num2);
    }

    public static void main(String[] args) {
        getAddition(1,2);
        getAddition(4.2,7.8);
    }
}
