package listexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        // wrapper class
//        int a=10; int b=-10;int c=0;
//        int d=null;
//        Integer m = null;

        // declaring list
        List<Integer> list1 = new ArrayList<>();

        // adding data
        list1.add(56);
        list1.add(33);
        list1.add(22);
        list1.add(77);
        list1.add(100);
        list1.add(12);
        list1.add(4);
        list1.add(77);
        //list1.add(null);
        list1.add(86);
        //list1.add(null);

        System.out.println("list1 is : "+list1);

        // removing data
        list1.remove(5);
        System.out.println("list1 after removing 5th index : "+list1);

        // search/get
        System.out.println("list1 3rd index element is : "+list1.get(3));
        System.out.println("list1 5th index element is : "+list1.get(5));

        //size
        System.out.println("list1 size is : "+list1.size());

        //sort
        Collections.sort(list1); //sorting in ascending order
        System.out.println("list1 after sorting in ascending order : "+list1);
        Collections.sort(list1, Collections.reverseOrder()); //sorting in descending order
        System.out.println("list1 after sorting in descending order : "+list1);

        // traverse using foreach
        System.out.println("traverse using foreach");
        for(int l1 : list1){
            System.out.println(l1);
        }
    }
}
