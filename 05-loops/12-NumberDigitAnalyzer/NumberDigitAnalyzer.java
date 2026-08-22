
import java.util.Scanner;

public class NumberDigitAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        int num = number;
        int digits = 0;
        int val = 0;
        int sum = 0;
        int product = 1;
        int rev = 0;

        do {

            digits++;
            val = num % 10;
            sum += val;
            product *= val;
            rev = rev * 10 + val;
            num = num / 10;

        } while (num != 0);
        System.out.println("===== Number Analysis =====");
        System.out.println("Number: " + number);
        System.out.println("Digit Count: " + digits);
        System.out.println("Digit Sum " + sum);
        System.out.println("Digit Product: " + product);
        System.out.println("Reverse: " + rev);
    }

}
