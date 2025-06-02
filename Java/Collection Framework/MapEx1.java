import java.util.*;
class MapEx1{
    public static void main(String args[]){
        System.out.println("Hash Map");
        Map<String, String> map3 = new HashMap<>();
        map3.put("koala","bamboo");
        map3.put("lion","meat");
        map3.put("giraffe","leaf");
        System.out.println(map3);
        
        String food = map3.get("koala");
        System.out.println(food);
        
        System.out.println("Lion eats "+map3.getOrDefault("lion","default"));
        System.out.println("Cow eats "+map3.getOrDefault("cow","default"));
        
        map3.put("cow","grass");
        System.out.println("Cow eats "+map3.get("cow"));
        
        map3.putIfAbsent("cow","value:grass"); // return null if value does not exist
        System.out.println("Cow eats "+map3.get("cow"));
        
        for(String key: map3.keySet())
            System.out.println("Key = "+key+", Value = "+map3.get(key));
        
        System.out.println("Contains Key 'koala' : "+map3.containsKey("koala"));
        System.out.println("Contains Value 'leaf' : "+map3.containsValue("leaf"));
        
        System.out.println("Remove key 'koala': "+map3.remove("koala"));
        System.out.println(map3);
        
        System.out.println("Replace value for non-existing key 'koala': "+map3.replace("koala","gr"));
        System.out.println("Replace existing key 'cow': "+map3.replace("cow","gr"));
        System.out.println(map3);
        
        for(Map.Entry<String, String> me : map3.entrySet())
            System.out.println("Key = "+me.getKey()+", Value = "+me.getValue());
        
        System.out.println("Remove key 'koala': "+map3.remove("koala"));
        System.out.println(map3);
        
        System.out.println("Remove key 'cow' with value 'gr': "+map3.remove("cow","gr"));
        System.out.println(map3);
        
        System.out.println("Put if absent key 'cow': "+map3.putIfAbsent("cow","gr"));
        System.out.println(map3);
        
        System.out.println("Put if absent key 'cow' again: "+map3.putIfAbsent("cow","gr"));
        System.out.println(map3);
        
        Map<String, String> map4 = new HashMap<>();
        map4.put("chicken","worm");
        map4.put("sparrow","seeds");
        map4.put("giraffe","tree leaves");
        map4.put("cow","null"); // allowed
        map4.put(null,"wolf"); // allowed
        System.out.println(map4);
        
        map3.putAll(map4);
        System.out.println(map3);
    }
}