import java.util.Scanner;

public class RangeNumberAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter start number: ");
        int start = sc.nextInt();

        System.out.println("Enter end number: ");
        int end = sc.nextInt();

        if (start > end) {
            System.out.println("Invalid range");
        } else {

            int count = 0;
            int evenCount = 0;
            int oddCount = 0;
            int evenSum = 0;
            int oddSum = 0;
            for (int i = start; i <= end; i++) {
                if (i % 2 == 0) {
                    evenCount++;
                    evenSum += i;
                } else {
                    oddCount++;
                    oddSum += i;
                }
                count++;
            }

            System.out.println("===== Range Analysis =====");
            System.out.println("Range: " + start + " to " + end);
            System.out.println("Total Numbers: " + count);
            System.out.println("Even Count: " + evenCount);
            System.out.println("Odd Count: " + oddCount);
            System.out.println("Even Sum: " + evenSum);
            System.out.println("Odd Sum: " + oddSum);
        }

    }

}
