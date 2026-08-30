
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SalaryPartition {

    static class Employee {
        String name;
        String department;
        double salary;

        Employee(String name, String department, double salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }
    }

    public static void main(String[] args) {

        ArrayList<Employee> emp = new ArrayList<>();

        emp.add(new Employee("Amit", "IT", 70000));
        emp.add(new Employee("Rahul", "HR", 50000));
        emp.add(new Employee("Gaurav", "IT", 80000));
        emp.add(new Employee("Priya", "Finance", 60000));
        emp.add(new Employee("Neha", "HR", 55000));
        emp.add(new Employee("Karan", "Finance", 75000));


        Map<Boolean, List<Employee>> partitioned = emp.stream()
                .collect(Collectors.partitioningBy(employee -> employee.salary > 60000));

        partitioned.forEach((isAbove60000, employees) -> {

            System.out.println("\nSalary > 60000: " + isAbove60000);

            employees.stream()
                    .forEach(employee -> System.out.println(employee.name));

            System.out.println("Employee count: " + employees.size());
        });

    }

}
