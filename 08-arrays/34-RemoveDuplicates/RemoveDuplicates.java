public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr = {
                10,
                20,
                10,
                30,
                20,
                40,
                10
        };

        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            int j;

            for (j = 0; j < i; j++) {

                if (arr[i] == arr[j]) {
                    break;
                }
            }

            if (i == j) {
                arr[index] = arr[i];
                index++;
            }
        }

        System.out.println("===== After Removing Duplicates =====");

        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Unique element count: " + index);
    }
}