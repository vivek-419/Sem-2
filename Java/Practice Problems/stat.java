// class Car{
//     static void run()
//     {
//         System.out.println("Running");
//     }
// }
// class stat{
//     public static void main(String[] args) {
//         Car c=new Car();
//         c.run();
//     }
// }

// Demonstrate static variables, methods, and blocks.
class UseStatic {
static int a = 3;
static int b;
static void meth (int x) {
System.out.println ("x =" + x) ;
System.out.println("a =" + a);
System.out.println ("b = " + b) ;
}
}
class stat{
public static void main (String args []) {
    meth(42);
}
}