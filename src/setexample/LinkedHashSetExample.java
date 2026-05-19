package setexample;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {

        Set<String> set1 = new LinkedHashSet<>();

        set1.add("Guava");
        set1.add("Mango");
        set1.add("Apple");
        set1.add("Pineapple");
        set1.add("Grapes");
        set1.add(null);
        set1.add("Guava");
        set1.add(null);

        System.out.println("set1 is :"+set1);

        set1.remove(null);
        set1.remove("Grapes");
        System.out.println("set1 after removing 2 elements : "+set1);

        System.out.println("traverse using foreach");
        for(String s1 : set1){
            System.out.println(s1);
        }
    }
}
