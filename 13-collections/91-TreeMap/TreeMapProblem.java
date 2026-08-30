import java.util.TreeMap;

public class TreeMapProblem {

    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(101, "Amit");
        map.put(105, "Neha");
        map.put(103, "Gaurav");
        map.put(102, "Rahul");
        map.put(104, "Priya");

        System.out.println("===== Employee Details =====");
        System.out.println(map);

        String emp103 = map.get(103);
        System.out.println("Emp 103: " + emp103);

        boolean isKey104Present = map.containsKey(104);
        System.out.println("Is key 104 present: " + isKey104Present);

        boolean isRahulPresent = map.containsValue("Rahul");
        System.out.println("Is Rahul present: " + isRahulPresent);

        map.remove(102);

        System.out.println("First key: " + map.firstKey());
        System.out.println("Last key: " + map.lastKey());

        System.out.println("===== Final Employee Details =====");
        System.out.println(map);

        int size = map.size();
        System.out.println("Employee count: " + size);
    }
}