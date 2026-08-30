import java.util.ArrayList;

public class SalaryAggregation {

    public static void main(String[] args) {

        ArrayList<Double> salaries = new ArrayList<>();

        salaries.add(50000.0);
        salaries.add(75000.0);
        salaries.add(45000.0);
        salaries.add(90000.0);
        salaries.add(60000.0);

        double totalSalary = salaries.stream()
                .mapToDouble(salary -> salary)
                .sum();

        double average = salaries.stream()
                .mapToDouble(salary -> salary)
                .average()
                .orElse(0.0);

        System.out.println("Total salary: " + totalSalary);
        System.out.println("Average salary: " + average);
    }
}