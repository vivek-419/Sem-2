import java.util.Scanner;
class Input123
{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // System.out.println("Enter id");
    // int id=sc.nextInt();
    // System.out.println("Enter age");
    // int age=sc.nextInt();
    // System.out.println("Enter Name");
    // String Name =sc.next();
    // //Switch case syntax:
    // //switch (case value)
    // //{
    // //  case case value1 :
    // // statements
    // //break
    // //  case case value2 :
    // // statements
    // //break
    // //  case case value3 :
    // // statements
    // //break
    // //  case case value4 :
    // // statements
    // //break
    // //  case case value5 :
    // // statements
    // //break
    // //}
    // int marks[][]=new int [3][3];
    // marks[0][0]=1;//,[2][1,2,3,4,5],[3][1,2,3,4,5];\
    // marks[0][1]=1;
    // marks[0][2]=1;
    // marks[0][1]=1;
    // marks[1][0]=1;
    // marks[1][1]=1;
    // marks[1][2]=1;
    // marks[2][0]=1;
    // marks[2][1]=1;
    // marks[2][2]=1;

    // for (int i=0;i<3;i++)
    // {
    //     for (int j=0;j<3;j++)
    //     {
    //         System.out.print(marks[i][j]);
    //     }
    //     System.out.print("\n");
    // }
    int marks1[][]=new int [3][];
    marks1[0]=new int[2];
    marks1[1]=new int[7];
    marks1[2]=new int[5];
    int facto1=factorial(4);
    System.out.println(facto1);
    palindrome("racecar");
    area(23.0);
    area(2,3);
    area(4);
    sc.close();


}
static int factorial(int a)
{
    int fact=1;
    for (int i=a;i>0;i--)
    {
        fact*=a;
        a--;
    }
    return fact;
}
static void palindrome(String word)
{
    int len= word.length();
    String rev="";
    for (int i= len-1;i>=0;i--)
    {
        rev+=word.charAt(i);
    }
    if(word.equals(rev))
    {
        System.out.println("The String is a palindrome");
    }
    else
    {
        System.out.println("The String is not a palindrome");
    }
    
}
public static void area(double r)
{
    double cirarea=Math.PI*r*r;
    System.out.println("Area of circle is "+cirarea);
}
public static void area(int a, int b)
{
    int rectarea=a*b;
    System.out.println("Area of rectangle is "+rectarea);
}
public static void area(int edge)
{
    double sqrarea=edge*edge;
    System.out.println("Area of square is "+sqrarea);
}

}

