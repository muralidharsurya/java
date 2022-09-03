package arraylist;

import java.util.ArrayList;

public class ArraylistDemo {
    public static void main(String[] args) {
        // ho to declare array list


        ArrayList list=new ArrayList();// we can store any type of element/s

   //     ArrayList<Integer> list=new ArrayList<Integer>();// store integer


       // ArrayList<String> list =new ArrayList<String>();// String

        // adding  value to arraylist
        list.add("Surya");
        list.add("Narayan");
        list.add("Ramanujan");
        list.add("Maurya");

        list.add("D");
        list.add("62379");


        // size of array list
        System.out.println(list.size());
        System.out.println("before removing elements"+list);

        //remove elements
        list.remove(2);
        System.out.println(list.size());
        System.out.println("after remove elements"+list );


        list.add(1,"ram");
        System.out.println(list.size());
        System.out.println("after inserting elements "+list);


        // read value from array list for loop
        /* for (String s:list){  // typ of data type
             System.out.println(s);
         }*/

        for(Object s:list)  // Object type variable can hold of values
        {
            System.out.println(s);
        }

}
}
