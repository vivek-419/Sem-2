import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class Hashset {
    public static void main(String[] args) {
        Set<Integer> s1=new HashSet<>(); 
        s1.add(5);
        s1.add(5);
        s1.add(3);
        s1.add(4);
        s1.add(8);
        s1.add(1245);
        s1.add(512);
        s1.add(1298269846);
        s1.add(1212);

        for (Integer i : s1)
        {
            System.out.println(i);
        }

        //                                If not mentioned then order will be in ascending order 
        //                                                   ^
        //                                                   |
        //                                                   |        
        Set<Integer> vals = new TreeSet<>(Comparator.reverseOrder());
        vals.add(5);
        vals.add(34);
        vals.add(24);
        vals.add(12);
        vals.add(7);
        vals.add(0);
        vals.add(345);

        System.out.println("\n");
        for (Integer i : vals)
        {
            System.out.println(i);

        }
    }
}
