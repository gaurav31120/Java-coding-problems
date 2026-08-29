import java.util.Scanner;

public class EmployeeClass {

    static class Employee {
        int id;
        String name;
        double salary;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        System.out.println("Enter emp id");
        int id = sc.nextInt();
        System.out.println("Enter emp name");
        String name = sc.next();
        System.out.println("Enter emp salary");
        double salary = sc.nextDouble();
        emp.id = id;
        emp.name = name;
        emp.salary = salary;

        System.out.println("===== Employee Details =====");
        System.out.println("ID: " + emp.id);
        System.out.println("Name: " + emp.name);
        System.out.println("Salary: " + emp.salary);

    }

}
