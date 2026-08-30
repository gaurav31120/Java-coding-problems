import java.util.TreeSet;

public class TreeSetSortedSet {

    public static void main(String[] args) {

        TreeSet<Integer> salaries = new TreeSet<>();

        salaries.add(50000);
        salaries.add(75000);
        salaries.add(45000);
        salaries.add(90000);
        salaries.add(60000);
        salaries.add(75000);
        salaries.add(45000);

        System.out.println("===== Sorted Salaries =====");

        for (int salary : salaries) {
            System.out.println(salary);
        }

        int smallestSalary = salaries.first();
        System.out.println("Smallest Salary: " + smallestSalary);

        int greatestSalary = salaries.last();
        System.out.println("Greatest Salary: " + greatestSalary);

        boolean is60000Exists = salaries.contains(60000);
        System.out.println("Is 60000 present: " + is60000Exists);

        salaries.remove(75000);

        System.out.println("Final Sorted Salary: " + salaries);

        int size = salaries.size();
        System.out.println("Unique Salary Count: " + size);
    }
}