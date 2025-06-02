public class Main{
    public static void main(String args[])
    {
        Student s1 =new Student();
        System.out.println("Name of student is "+s1.id);
    }
}
class Student
{
    int id;
    String name;
    static String studentclass="ITM";
    int age;
}