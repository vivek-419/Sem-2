import java.util.*;
class queue123
{
    public static void main(String[] args) {
        //                                      If not mentioned then order will be in ascending order 
        //                                                         ^
        //                                                         |
        //                                                         |
        Queue<Integer> q1 = new PriorityQueue<Integer>(Comparator.reverseOrder());
        q1.add(9);
        q1.add(5);
        q1.add(4);
        q1.add(6);

        //          Throws exception        doesn't throw exception
        //            Add()                      Offer()
        //            Remove()                   poll()
        //            Element()                  peek()

        System.out.println(q1.element());
        System.out.println(q1.peek());
        System.out.println(q1.remove());

    }
}