package CollectionOfJava;

import java.util.LinkedList;

public class launchLinkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(20);
        ll.add(50);
        ll.add(60);
        ll.add(75);
        ll.add(1,70);
        System.out.println(ll);
    }
}
