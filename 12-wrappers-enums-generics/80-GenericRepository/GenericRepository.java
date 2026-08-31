import java.util.ArrayList;
import java.util.List;

public class GenericRepository {

    static class Repository<T> {

        private final List<T> items = new ArrayList<>();

        public void add(T item) {
            items.add(item);
        }

        public T get(int index) {
            return items.get(index);
        }

        public int size() {
            return items.size();
        }
    }

    public static void main(String[] args) {

        Repository<String> stringRepository = new Repository<>();

        stringRepository.add("Java");
        stringRepository.add("Spring");
        stringRepository.add("AWS");

        Repository<Integer> integerRepository = new Repository<>();

        integerRepository.add(100);
        integerRepository.add(200);
        integerRepository.add(300);

        System.out.println("===== Generic Repository =====");

        System.out.println(
                "String at index 1: " + stringRepository.get(1)
        );

        System.out.println(
                "Integer at index 2: " + integerRepository.get(2)
        );

        System.out.println(
                "String repository size: " + stringRepository.size()
        );

        System.out.println(
                "Integer repository size: " + integerRepository.size()
        );
    }
}