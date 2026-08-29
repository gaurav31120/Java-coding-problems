import java.util.Scanner;


public class ThisKeyword {

    static class Employee {
        int id;
        String name;
        double salary;

        Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;

        }

        void display() {
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Salary: " + salary);

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
        Employee emp = new Employee(id, name, salary);

        System.out.println("===== Employee Details =====");
        emp.display();

    }

    
}