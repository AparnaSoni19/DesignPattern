package hashmapandconcurrenthashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class ConcurrentHashMapDemoForNoConcurrentModificationExcepetion extends Thread
{
    static Map<Integer,String> l=new ConcurrentHashMap<Integer,String>();

    public void run()
    {
        try
        {
            Thread.sleep(1000);
            // Child thread trying to add
            // new element in the object
            l.put(103,"D");
        }
        catch(InterruptedException e)
        {
            System.out.println("Child Thread going to add element");
        }
    }

    public static void main(String[] args) throws InterruptedException
    {
        l.put(100,"A");
        l.put(101,"B");
        l.put(102,"C");
        ConcurrentHashMapDemoForNoConcurrentModificationExcepetion t=new ConcurrentHashMapDemoForNoConcurrentModificationExcepetion();
        t.start();

        for (Object o : l.entrySet())
        {
            Object s=o;
            System.out.println(s);
            Thread.sleep(1000);
        }
        System.out.println(l);
    }
}