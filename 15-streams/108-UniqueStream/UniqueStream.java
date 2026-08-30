import java.util.ArrayList;

public class UniqueStream {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(50000);
        list.add(75000);
        list.add(50000);
        list.add(90000);
        list.add(50000);
        list.add(75000);
        list.add(60000);
        list.add(90000);

        System.out.println("===== Original Values =====");

        list.stream()
                .forEach(value -> System.out.println(value));

        System.out.println("===== Unique Values =====");

        list.stream()
                .distinct()
                .forEach(value -> System.out.println(value));

        long count = list.stream()
                .distinct()
                .count();

        System.out.println("Unique count: " + count);
    }
}