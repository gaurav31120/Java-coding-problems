import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapProblem {

    public static void main(String[] args) {

        ConcurrentHashMap<Integer, String> emp = new ConcurrentHashMap<>();

        emp.put(101, "Amit");
        emp.put(102, "Rahul");
        emp.put(103, "Gaurav");
        emp.put(104, "Priya");
        emp.put(105, "Neha");

        System.out.println("===== Employee Details =====");
        System.out.println(emp);

        String emp103 = emp.get(103);
        System.out.println("Emp 103 is: " + emp103);

        boolean is104Present = emp.containsKey(104);
        System.out.println("Is 104 present: " + is104Present);

        boolean isRahulPresent = emp.containsValue("Rahul");
        System.out.println("Is Rahul present: " + isRahulPresent);

        emp.put(103, "Karan");
        emp.remove(102);

        System.out.println("===== Employee Details Before Threads =====");
        System.out.println(emp);

        Thread t1 = new Thread(() -> {
            emp.put(106, "Arjun");
        });

        Thread t2 = new Thread(() -> {
            emp.put(107, "Sneha");
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("===== Final Employee Details =====");
        System.out.println(emp);

        System.out.println("Employee count: " + emp.size());
    }
}