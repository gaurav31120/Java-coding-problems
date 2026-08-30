import java.util.ArrayList;

public class SalaryTransformation {

    public static void main(String[] args) {

        ArrayList<Double> salaries = new ArrayList<>();

        salaries.add(50000.0);
        salaries.add(75000.0);
        salaries.add(45000.0);
        salaries.add(90000.0);
        salaries.add(60000.0);

        salaries.stream()
                .map(salary -> salary * 1.1)
                .forEach(salary -> System.out.println(salary));

        System.out.println("Original salaries: " + salaries);

        // filter()
        // → asks: "Should I keep this?"

        // map()
        // → asks: "What should this become?"
    }

}
