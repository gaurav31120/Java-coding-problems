public class MaxMin {

    public static void main(String[] args) {

        int[] arr = {
                50000,
                75000,
                45000,
                90000,
                60000
        };

        int min = arr[0];
        int max = arr[0];

        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }

            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }

        System.out.println("Maximum salary: " + max);
        System.out.println("Maximum salary index: " + maxIndex);

        System.out.println("Minimum salary: " + min);
        System.out.println("Minimum salary index: " + minIndex);
    }
}