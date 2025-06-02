
interface Printable{
void print();
}
class IntEx implements Printable
{
public void print()
{
    System.out.println("Hello");
}
public static void main(String args[])
{
IntEx obj = new IntEx();
obj.print();
}
}
