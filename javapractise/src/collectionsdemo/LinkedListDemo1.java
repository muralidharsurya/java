package collectionsdemo;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();

          l.add("A");
        l.add("B");
        l.add("C");
        l.add("X");
        l.add("Y");
        l.add("Z");

        LinkedList new_l= new LinkedList();
        new_l.addAll(l);
        System.out.println(new_l);//[A, B, C, X, Y, Z]

        new_l.removeAll(l);
        System.out.println(new_l);//[]

        // sort() collections.sort(collection)

        System.out.println("Before sorting:"+l);
        Collections.sort(l);
        System.out.println("After sotying:"+1);

        //rever order
        Collections.sort(l,Collections.reverseOrder());
        System.out.println("Reverse order:"+l);

        // shuffling
        Collections.shuffle(l);
        System.out.println("After shuffling:"+l);

    }

}
