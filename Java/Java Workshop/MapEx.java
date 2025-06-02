import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
        
        Map<Integer,String> data = new HashMap<>();
        data.put(1, "Hello");
        data.put(2, "World");
        data.put(3, "Learning");
        data.put(4, "about");
        data.put(5, "Map in Java");
        System.out.println(data.keySet());
        System.out.println(data.values());
        System.out.println(data.entrySet());

        Iterator itr = data.entrySet().iterator();
        


    }
}
