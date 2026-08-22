
import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        boolean divisor = false;

        if (num <= 1) {
            divisor = false;
        } else {

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    divisor = true;
                    break;

                }

            }
        }
        System.out.println("===== Prime Number Check =====");
        System.out.println("Number: " + num);
        System.out.println("Result: " + (divisor ? " Not Prime " : " Prime "));
    }

}
