import java.util.LinkedHashMap;

public class LinkedHashMapProblem {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> employees = new LinkedHashMap<>();

        employees.put(101, "Amit");
        employees.put(105, "Neha");
        employees.put(103, "Gaurav");
        employees.put(102, "Rahul");
        employees.put(104, "Priya");

        System.out.println("===== Employee Details =====");
        System.out.println(employees);

        String emp103 = employees.get(103);
        System.out.println("Emp 103 is: " + emp103);

        boolean is104Present = employees.containsKey(104);
        System.out.println("Is 104 present: " + is104Present);

        boolean isRahulPresent = employees.containsValue("Rahul");
        System.out.println("Is Rahul present: " + isRahulPresent);

        employees.put(103, "Karan");

        employees.remove(102);

        System.out.println("===== Final Employee Details =====");
        System.out.println(employees);

        int size = employees.size();
        System.out.println("Employee count: " + size);
    }
}