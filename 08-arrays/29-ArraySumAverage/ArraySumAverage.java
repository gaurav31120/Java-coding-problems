public class ArraySumAverage {

    public static void main(String[] args) {

        int[] arr = {50000, 75000, 45000, 90000, 60000};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Total Salary: " + sum);

        double averageSalary = (double) sum / arr.length;

        System.out.println("Average Salary: " + averageSalary);
    }
}