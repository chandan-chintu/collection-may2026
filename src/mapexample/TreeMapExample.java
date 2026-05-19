package mapexample;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

        Map<Integer, String> map1 = new TreeMap<>();

        map1.put(107,"Guava");
        map1.put(104,"Mango");
        map1.put(103,"Grapes");
        map1.put(108,"Grapes");
        map1.put(109,"Apple");
        map1.put(110,"Orange");
        map1.put(111,null);
        map1.put(108,"Watermelon"); // Grapes removed and Watermelon added

        System.out.println("map1 is :"+map1);

        map1.remove(111);
        System.out.println("map1 after remove 111 key : "+map1);

        System.out.println("traverse using foreach - entryset");
        for(Map.Entry m1 : map1.entrySet()){
            System.out.println(m1.getKey() + "----"+m1.getValue());
        }
    }
}
