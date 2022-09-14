package hashmapandconcurrenthashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemoForConcurrentModificationExcepetion extends Thread
{
    static Map<Integer,String> map = new HashMap<>();
    public void run()  {
        try {
            Thread.sleep(1000);
            map.put(5, "CCC");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args)throws InterruptedException {
        map.put(1,"AAA");
        map.put(2,"AAA");
        map.put(3,"AAA");
        map.put(4,"AAA");

        HashMapDemoForConcurrentModificationExcepetion hashMapDemoForConcurrentModificationExcepetion = new HashMapDemoForConcurrentModificationExcepetion();
        hashMapDemoForConcurrentModificationExcepetion.start();
        for(Object o:map.entrySet())
        {
            System.out.println(o);
            Thread.sleep(1000);
        }
    }
}