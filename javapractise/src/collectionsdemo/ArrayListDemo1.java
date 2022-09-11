package collectionsdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

    public static void main(String[] args) {
        // Declaration ArrayList
        //ArrayList <Integer> a1=new ArrayList<Integer>();
        //ArrayList<String> a1=new ArrayList<String>();
        //list a1=new Arraylist();
        ArrayList a1=new ArrayList();

        // add new elements to the arraylist
        a1.add(100);
        a1.add("welcome");
        a1.add('a');
        a1.add(15.5);
        a1.add(true);
        System.out.println(a1);

        //size()
        System.out.println("Number of elements in array list : "+a1.size());//[5 a, 15.5, true] it is preserve methode

        // remove

        //a1.remove(1);// index is 1
        a1.remove("welcome");
        System.out.println("after removing element from  array list:"+a1);//

       // insert a new element
        // add(index, object)
        a1.add(2,"java");
        System.out.println("After insertion :"+a1);//[100, a, java, 15.5, true]

         // retrieve  specific element
        System.out.println(a1.get(2)); // if u want extract specific element:  java, here 2 is index of element/object

        //change element/replace
        a1.set(2,"Python");
        System.out.println("After replacing new element:"+a1);

        // search -contains()
         System.out.println(a1.contains("Python"));// true
        System.out.println(a1.contains("c#"));// FALSE

        // isEmpty()
        System.out.println(a1.isEmpty()); // false

         // how to read data elements using

        // 1) for loop
       /* System.out.println("Reading elements using  for loop..");
        for (int i=0;i<a1.size();i++){
            System.out.println(a1.get(i));
        }*/// 2) for ..each loop
        /*System.out.println("Reading elements using for.. each lopp");
        for (Object e:a1){
            System.out.println(e);
        }*/

        // 3) iterator()
        System.out.println("Reading elements using iterator method ");
        Iterator it = a1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }







    }

}
