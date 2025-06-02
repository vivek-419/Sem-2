import java.util.Scanner;
public class reversenum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to reverse");
        int n=sc.nextInt();
        int rev = 0;
        while(n>0)
        {
            int temp=n%10;
            rev=rev*10+temp;
            n=n/10;
        }
        System.out.println("The reversed number is "+rev);
        sc.close();
    }   
}
