import java.util.Scanner;
class Helloworld
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hello World");
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        System.out.println("Hello "+name);
        sc.close();
    }
}