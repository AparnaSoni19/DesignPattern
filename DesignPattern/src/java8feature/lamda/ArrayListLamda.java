package java8feature.lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListLamda {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>();
        for (int i = 20; i > 10; i--) {
            myList.add(i);
        }
            myList.forEach(n->{
                System.out.println("I am part of arrayList"+n);
            });
        System.out.println(myList.stream().filter(l->l>15).collect(Collectors.toList()));
        System.out.println(Collections.min(myList));
        }
    }


