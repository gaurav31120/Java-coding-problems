import java.util.LinkedList;

public class LinkedListTaskQueue {

    public static void main(String[] args) {

        LinkedList<String> tasks = new LinkedList<>();

        tasks.add("Task-1");
        tasks.add("Task-2");
        tasks.add("Task-3");
        tasks.add("Task-4");
        tasks.add("Task-5");

        System.out.println("===== Initial Task Queue =====");
        System.out.println("Tasks: " + tasks);

        tasks.addFirst("Urgent-Task");
        tasks.addLast("Final-Task");

        System.out.println("\n===== After Adding Tasks =====");
        System.out.println("Tasks: " + tasks);
        System.out.println("First Task: " + tasks.getFirst());
        System.out.println("Last Task: " + tasks.getLast());

        tasks.removeFirst();
        tasks.removeLast();

        System.out.println("\n===== After Removing First and Last =====");
        System.out.println("Tasks: " + tasks);
        System.out.println("Task Count: " + tasks.size());
    }
}