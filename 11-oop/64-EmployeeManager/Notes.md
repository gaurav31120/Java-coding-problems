import java.util.Scanner;

public class EmployeeManager {

    static class Employee {
        int id;
        String name;
        double salary;

        Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }
    }

    static class Manager extends Employee {
        String department;
        double bonus;

        Manager(int id, String name, double salary,
                String department, double bonus) {

            super(id, name, salary);

            this.department = department;
            this.bonus = bonus;
        }

        double getTotalCompensation() {
            return salary + bonus;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter emp id");
        int id = sc.nextInt();

        System.out.println("Enter emp name");
        String name = sc.next();

        System.out.println("Enter emp salary");
        double salary = sc.nextDouble();

        System.out.println("Enter emp department");
        String department = sc.next();

        System.out.println("Enter emp bonus");
        double bonus = sc.nextDouble();

        Manager manager =
                new Manager(id, name, salary, department, bonus);

        System.out.println("===== Manager Details =====");
        System.out.println("ID: " + manager.id);
        System.out.println("Name: " + manager.name);
        System.out.println("Salary: " + manager.salary);
        System.out.println("Department: " + manager.department);
        System.out.println("Bonus: " + manager.bonus);
        System.out.println(
                "Total Compensation: " +
                manager.getTotalCompensation()
        );

        sc.close();
    }
}