import java.util.Scanner;

public class EmployeeObjectCounter {

    static class Employee {
        int id;
        String name;
        double salary;

        static int counter;

        Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
            counter++;
        }
    }

    public static void main(String[] args) {    

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter emp1 id");
        int id1 = sc.nextInt();

        System.out.println("Enter emp1 name");
        String name1 = sc.next();

        System.out.println("Enter emp1 salary");
        double salary1 = sc.nextDouble();

        Employee emp1 = new Employee(id1, name1, salary1);

        System.out.println("Enter emp2 id");
        int id2 = sc.nextInt();

        System.out.println("Enter emp2 name");
        String name2 = sc.next();

        System.out.println("Enter emp2 salary");
        double salary2 = sc.nextDouble();

        Employee emp2 = new Employee(id2, name2, salary2);

        System.out.println("Enter emp3 id");
        int id3 = sc.nextInt();

        System.out.println("Enter emp3 name");
        String name3 = sc.next();

        System.out.println("Enter emp3 salary");
        double salary3 = sc.nextDouble();

        Employee emp3 = new Employee(id3, name3, salary3);

        System.out.println("===== Employee Details 1 =====");
        System.out.println("ID: " + emp1.id);
        System.out.println("Name: " + emp1.name);
        System.out.println("Salary: " + emp1.salary);

        System.out.println("===== Employee Details 2 =====");
        System.out.println("ID: " + emp2.id);
        System.out.println("Name: " + emp2.name);
        System.out.println("Salary: " + emp2.salary);

        System.out.println("===== Employee Details 3 =====");
        System.out.println("ID: " + emp3.id);
        System.out.println("Name: " + emp3.name);
        System.out.println("Salary: " + emp3.salary);

        System.out.println("Total Employees: " + Employee.counter);

        sc.close();
    }
}