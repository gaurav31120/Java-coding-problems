import java.util.Scanner;

public class PrimeNumbersInRange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter start number:");
        int start = sc.nextInt();

        System.out.println("Enter end number:");
        int end = sc.nextInt();

        if (start > end) {
            System.out.println("Invalid range");
            return;
        }

        int primeCount = 0;
        int primeSum = 0;
        String primes = "";

        for (int number = start; number <= end; number++) {

            boolean isPrime = true;

            if (number <= 1) {
                isPrime = false;
            } else {

                for (int divisor = 2; divisor <= number / 2; divisor++) {

                    if (number % divisor == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                primeCount++;
                primeSum += number;
                primes += number + " ";
            }
        }

        System.out.println("===== Prime Numbers =====");
        System.out.println("Primes: " + primes);
        System.out.println("Prime Count: " + primeCount);
        System.out.println("Prime Sum: " + primeSum);
    }
}