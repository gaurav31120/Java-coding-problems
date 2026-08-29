import java.util.Scanner;

public class EmployeeEncapsulation {

    static class Employee {
        private int id;
        private String name;
        private double salary;

        // Method 1 - Getter
        public int getId() {
            return id;
        }

        // Method 2 - Setter
        public void setId(int i) {

            // This keyword refers to current instance itself
            this.id = i;
        }

        ////////////////////////////////////////
        public String getName() {
            return name;
        }

        // Method 2 - Setter
        public void setName(String N) {

            // This keyword refers to current instance itself
            this.name = N;
        }

        ///////////////////////
        public double getSalary() {
            return salary;
        }

        // Method 2 - Setter
        public void setSalary(double s) {

            // This keyword refers to current instance itself
            this.salary = s;
        }

        Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;

        }

        // void display() {

        // }

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

        System.out.println("Enter emp id");
        int updatedId = sc.nextInt();
        System.out.println("Enter emp name");
        String updatedName = sc.next();
        System.out.println("Enter emp salary");
        double updatedSalary = sc.nextDouble();
        emp.setId(updatedId);
        emp.setName(updatedName);
        emp.setSalary(updatedSalary);

        System.out.println("===== Employee Details =====");
        System.out.println("ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());

        System.out.println("===== Updated Employee Details =====");
        System.out.println("Updated ID: " + emp.getId());
        System.out.println("Updated Name: " + emp.getName());
        System.out.println("Updated Salary: " + emp.getSalary());

    }

}
