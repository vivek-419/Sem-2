import java.util.*;
class ArrListEx{
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<String>();
        list1.add("AA");
        list1.add("CC");
        list1.add("DD");
        list1.add("AA");
        System.out.println("list1"+list1);

        list1.add(1,"PP");
        System.out.println("list now "+list1);

        ArrayList<String> list2=new ArrayList<>(2);
        list2.add("LL");
        list2.add("CC");
        list2.add("GG");
        System.out.println("list2 "+list2);

        ArrayList<String> list3=new ArrayList<>(list2);
        System.out.println("list3"+list3);
        

        
    }
}
