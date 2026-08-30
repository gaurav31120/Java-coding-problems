import java.util.HashMap;
import java.util.Map;

public class HashMapKeySetEntrySet {

    public static void main(String[] args) {

        HashMap<Integer, String> employees = new HashMap<>();

        employees.put(101, "Amit");
        employees.put(102, "Rahul");
        employees.put(103, "Gaurav");
        employees.put(104, "Priya");
        employees.put(105, "Neha");

        System.out.println("===== Employee IDs =====");

        for (Integer id : employees.keySet()) {
            System.out.println(id);
        }

        System.out.println("===== Employee Names =====");

        for (Integer id : employees.keySet()) {
            System.out.println(employees.get(id));
        }

        System.out.println("===== Employee Details =====");

        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        int size = employees.size();
        System.out.println("Employee Count: " + size);
    }
}