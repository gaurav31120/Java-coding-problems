import java.util.ArrayList;
import java.util.Comparator;

public class StreamSorting {

    public static void main(String[] args) {
        
        ArrayList<Integer> salaries = new ArrayList<>();

        salaries.add(50000);
        salaries.add(75000);
        salaries.add(45000);
        salaries.add(90000);
        salaries.add(60000);

        salaries.stream()
        .forEach(salary -> System.out.println(salary));

        System.out.println("-------------------");

        // ArrayList sortedArrayList = 
        salaries.stream()
        .sorted().forEach(salary -> System.out.println(salary));

        salaries.stream()
        .sorted(Comparator.reverseOrder())
        .forEach(salary -> System.out.println(salary));
    }
    
}
