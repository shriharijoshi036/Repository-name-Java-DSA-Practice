
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;


public class PracticeNumber {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(22);
        list.add(18);
        list.add(10);
        list.add(7);

        Stream<Integer> Sortedstream = list.stream();
        Stream<Integer> stream1 = Sortedstream.sorted();
        System.out.println("here the original list is sorted");
        stream1.forEach(n -> System.out.println(n));
        System.out.println("Below the list is giving number grater than 10");

        Stream<Integer> filterStream = list.stream()
                .filter(n-> n>10);
              filterStream.forEach(n-> System.out.println(n));

        System.out.println("the list is given below is original list");
        System.out.println(list);
    }
}