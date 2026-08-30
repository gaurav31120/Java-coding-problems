import java.util.HashSet;

public class SetDuplicateRemoval {

    public static void main(String[] args) {

        HashSet<String> employees = new HashSet<>();

        employees.add("Amit");
        employees.add("Rahul");
        employees.add("Gaurav");
        employees.add("Rahul");
        employees.add("Priya");
        employees.add("Amit");
        employees.add("Neha");
        employees.add("Gaurav");

        System.out.println("===== Unique Employees =====");

        for (String employee : employees) {
            System.out.println(employee);
        }

        boolean isRahulPresent = employees.contains("Rahul");
        System.out.println("Rahul present: " + isRahulPresent);

        employees.remove("Gaurav");

        System.out.println("===== After Removing Gaurav =====");

        for (String employee : employees) {
            System.out.println(employee);
        }

        int size = employees.size();
        System.out.println("Size: " + size);
    }
}