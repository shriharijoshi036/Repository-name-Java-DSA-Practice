package CollectionOfJava;

import java.util.ArrayDeque;

public class launchArrayDeque {
    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque();
        ad.add(20);
        ad.add(50);
        ad.add(60);
        ad.add(75);
        ad.addFirst(55);
        ad.addLast(76);
        System.out.println(ad);
        ad.add(23);
        System.out.println(ad);
    }
}
