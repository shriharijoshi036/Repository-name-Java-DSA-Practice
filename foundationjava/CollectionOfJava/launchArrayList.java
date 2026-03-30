package CollectionOfJava;

import java.util.ArrayList;

public class launchArrayList {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(20);
        al.add(50);
        al.add(60);
        al.add(75);
        System.out.println(al.contains(75));
        al.add(50);
        System.out.println(al);



    }
}
