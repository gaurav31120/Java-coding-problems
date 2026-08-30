import java.util.HashMap;
import java.util.Map;

public class HashMapCRUD {

    public static void main(String[] args) {

        HashMap<Integer, String> employees = new HashMap<>();

        employees.put(101, "Amit");
        employees.put(102, "Rahul");
        employees.put(103, "Gaurav");
        employees.put(104, "Priya");
        employees.put(105, "Neha");

        System.out.println("===== Employee Details =====");

        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        String employee103 = employees.get(103);
        System.out.println("Employee 103: " + employee103);

        String previousValue = employees.put(103, "Karan");
        System.out.println("Previous value: " + previousValue);

        boolean is104Present = employees.containsKey(104);
        System.out.println("Is 104 present: " + is104Present);

        boolean isRahulPresent = employees.containsValue("Rahul");
        System.out.println("Is Rahul present: " + isRahulPresent);

        employees.remove(102);

        System.out.println("===== Final Employee Details =====");

        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        int size = employees.size();
        System.out.println("Employee Count: " + size);
    }
}