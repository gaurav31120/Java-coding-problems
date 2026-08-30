import java.util.ArrayList;

public class FilterEmployees {

    public static void main(String[] args) {

        ArrayList<Integer> salaries = new ArrayList<>();

        salaries.add(50000);
        salaries.add(75000);
        salaries.add(45000);
        salaries.add(90000);
        salaries.add(60000);

        System.out.println("===== Salaries Above 60000 =====");

        salaries.stream()
                .filter(salary -> salary > 60000)
                .forEach(salary -> System.out.println(salary));

        long count = salaries.stream()
                .filter(salary -> salary > 60000)
                .count();

        System.out.println("Employees earning above 60000: " + count);
    }
}