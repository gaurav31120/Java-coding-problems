import java.util.HashSet;

public class HashSetUniqueValues {

    public static void main(String[] args) {

        HashSet<Integer> empId = new HashSet<>();

        empId.add(101);
        empId.add(102);
        empId.add(103);
        empId.add(101);
        empId.add(104);
        empId.add(102);
        empId.add(105);

        System.out.println("===== Unique Employee IDs =====");

        for (int id : empId) {
            System.out.println(id);
        }

        boolean is103Present = empId.contains(103);
        System.out.println("Is 103 Present: " + is103Present);

        boolean is999Present = empId.contains(999);
        System.out.println("Is 999 Present: " + is999Present);

        int size = empId.size();
        System.out.println("Unique ID Count: " + size);
    }
}