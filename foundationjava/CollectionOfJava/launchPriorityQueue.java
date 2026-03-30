package CollectionOfJava;

import java.util.PriorityQueue;

public class launchPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(650);
        pq.add(50);
        pq.add(60);
        pq.add(75);
        pq.add(105);
        pq.add(200);

        System.out.println(pq);
        pq.add(65);

        System.out.println(pq);

    }
}
