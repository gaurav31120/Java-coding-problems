import java.util.Scanner;

public class MultiplicationTableAnalyzer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int sum = 0;
        int countEven = 0;
        int countOdd = 0;
        System.out.println("===== Multiplication Table =====");

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
            if ((num * i) % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
            sum += num * i;

        }

        System.out.println("Sum: " + sum);
        System.out.println("Even Results: " + countEven);
        System.out.println("Odd Results: " + countOdd);
    }

}
