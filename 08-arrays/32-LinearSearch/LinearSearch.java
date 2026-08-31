public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = {
                50000,
                75000,
                45000,
                90000,
                60000
        };

        int target = 90000;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                System.out.println("Salary found at index: " + i);
                return;
            }
        }

        System.out.println("Salary not found");
    }
}