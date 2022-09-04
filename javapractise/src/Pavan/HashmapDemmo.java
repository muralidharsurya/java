package Pavan;

import java.util.HashMap;
import java.util.Map;

public class HashmapDemmo {
    public static void main(String[] args) {
        //Hash map declaration

     //   HashMap hp=new HashMap();// one  of the type
        HashMap<Integer,String> hm= new HashMap<Integer,String>();
        // adding pairs
        hm.put(101,"smith");
        hm.put(102,"sameer");
        hm.put(103,"sonu");
        hm.put(104,"saheth");
        System.out.println("name of pair"+hm);

        // remove a pair from  HashMap
        hm.remove(103);
        System.out.println("after the remove hash map");

        // reading pair using for loop
        for (Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());

        }
    }
}
