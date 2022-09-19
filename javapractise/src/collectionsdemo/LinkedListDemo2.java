package collectionsdemo;
import java.util.LinkedList;
public class LinkedListDemo2 {
    public static void main(String[] args) {

        LinkedList l=new LinkedList();

        l.add("dog");
        l.add("cat");
        l.add("rat");
        l.add("cow");

        System.out.println(l);
        l.addFirst("tigger");
        l.addLast("elephent");

        System.out.println(l);

        System.out.println(l.getFirst());
        System.out.println(l.getLast());
    }
}
