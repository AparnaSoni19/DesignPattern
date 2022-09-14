package hashmapandconcurrenthashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapAndConcurrentHashMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(100,"Hello");
        map.put(101,"Geeks");
        map.put(102,"Soni");
        map.put(null,"World");
        System.out.println(map);

        Map<Integer,String> map2 = new ConcurrentHashMap<>();

        map2.put(100,"Hello");
        map2.put(101,"Geeks");
        map2.put(102,"Soni");
        map2.put(103,null);
        System.out.println(map2);
    }
}
