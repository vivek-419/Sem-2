class UseStatic {
static int a = 3;
static int b;
static void meth (int x) 
{
System.out.println ("x =" + x) ;
System.out.println("a =" + a);
System.out.println ("b = " + b) ;
}
}
class staticEx{
public static void main (String args []) {
    UseStatic.meth(42);
    System.out.println(UseStatic.a);
}
}