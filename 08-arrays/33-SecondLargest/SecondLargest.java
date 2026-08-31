public class SecondLargest {

    public static void main(String[] args) {

        int[] arr = {10, 10, 8, 7};

        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];

            } else if (arr[i] < max && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }

        System.out.println("Largest: " + max);

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("Second largest: No second largest value");
        } else {
            System.out.println("Second largest: " + secondMax);
        }
    }
}