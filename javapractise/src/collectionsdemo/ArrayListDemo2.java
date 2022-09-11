package collectionsdemo;

import Pavan.Calculation;
import com.sun.javafx.collections.SortHelper;
 import java.util.*;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList al =new ArrayList();
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("X");
        al.add("Y");
        al.add("Z");

        ArrayList al_dup=new ArrayList();
        al_dup.addAll(al);
        System.out.println(al_dup);

        al_dup.removeAll(al);
        System.out.println("After remove:"+al_dup);

        // sort .... Collection.sort()

        System.out.println("Elements in the Array list :"+al);

       //Callections.sort(al);
    }
}
