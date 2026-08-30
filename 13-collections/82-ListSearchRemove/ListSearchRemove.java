import java.util.ArrayList;

public class ListSearchRemove {

    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();

        employees.add("Amit");
        employees.add("Rahul");
        employees.add("Gaurav");
        employees.add("Priya");
        employees.add("Neha");

        System.out.println("===== Employee List =====");
        System.out.println("Employees: " + employees);

        boolean containsRahul = employees.contains("Rahul");
        System.out.println("Contains Rahul: " + containsRahul);

        int rahulIndex = employees.indexOf("Rahul");
        System.out.println("Rahul Index: " + rahulIndex);

        employees.remove("Rahul");

        System.out.println("\n===== After Removing Rahul =====");
        System.out.println("Employees: " + employees);

        containsRahul = employees.contains("Rahul");
        System.out.println("Contains Rahul: " + containsRahul);

        System.out.println("Employee Count: " + employees.size());
    }
}