package collectionsdemo;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        //Declare Linked list
        // LinkedList <Integer> l=new LinkedList<Integer> ();
        //LinkedList <String> l=new LinkedList<String>();

        LinkedList l=new LinkedList<>();

        l.add(190);
        l.add("scote");
        l.add(3434.5) ;
        l.add('D');
        l.add(true);
        l.add(null);
        System.out.println(l);

        // size
        System.out.println(l.size()); //6

        // remove
        l.remove(3);
        System.out.println("After removing:"+l);

        // Insert /adding in the middle of linked list
       // l.add(index,obj)
        l.add(3,"JAVA");
        System.out.println(" After inderting element:"+l);
        // retriving value /object
        System.out.println(l.get(3));//java

        //change the value
        l.set(5,"T");
        System.out.println("After changing the value:"+l);

        // contains()
        System.out.println(l.contains("JAVA"));
        System.out.println(l.contains("c#"));

        //isEmpty()
        System.out.println(l.isEmpty());

        // Rading elements from using for loop

        // Read the data for each..loop
       /* for ( Object e:l){
            System.out.println(e);
        }*/

        // iterator()method
        Iterator it = l.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}
