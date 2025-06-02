class Typecastingex
{
public static void main(String []args)
{
double d=100.23;
long l=(long)d;
int i=(int)l;
byte b=50;
b=(byte)(b*2);
System.out.println("Long value "+l);
System.out.println("Int value "+i);
System.out.println("Byte Value:"+b);
}
}