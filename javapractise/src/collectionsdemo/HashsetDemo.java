package collectionsdemo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashsetDemo {
    public static void main(String[] args) {

      //  HashSet hs= new HashSet();// default capacity 16 Load factor 0.75

       // HashSet  hs= new HashSet(); // initial capacity 100

        HashSet hs=new HashSet(); // default capacity 16 load factor 0.75

        // Add object  /elements into Hashset
        hs.add(100);
        hs.add(16.4);
        hs.add("Welcome");
        hs.add('K');
        hs.add(true);
        hs.add(null);
        System.out.println(hs);

        // remove()
        hs.remove(16.4);
        System.out.println("Afeter removing element :"+hs);

        // contains()
        System.out.println(hs.contains("Welcome"));
        System.out.println(hs.contains("xyz"));


        System.out.println(hs.isEmpty());

         // Reading object/elements from hashset using for..each lopp
        for (Object e:hs);
        {
            System.out.println();
        }












    }


}

