public class ArrayExplorer {

    public static void main(String[] args) {

        int[] arr = {50000, 75000, 45000, 90000, 60000};

        System.out.println("===== Salaries =====");

        for (int salary : arr) {
            System.out.println(salary);
        }

        System.out.println("\n===== Index + Salary =====");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + " -> " + arr[i]);
        }

        int countTotalEmp = arr.length;

        System.out.println("\nTotal employees: " + countTotalEmp);

        System.out.println("First salary: " + arr[0]);

        System.out.println("Last salary: " + arr[arr.length - 1]);
    }
}