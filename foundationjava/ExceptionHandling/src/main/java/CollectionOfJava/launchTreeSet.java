package CollectionOfJava;

import java.util.TreeSet;

public class launchTreeSet {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(20);
        ts.add(60);
        ts.add(80);
        ts.add(55);
        ts.add(13);
        ts.add(56);
        System.out.println(ts.headSet(71));
        System.out.println(ts.headSet(100));

    }
}
