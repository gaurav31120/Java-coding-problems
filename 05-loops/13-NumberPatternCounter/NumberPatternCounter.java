import java.util.Scanner;

public class NumberPatternCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        
        if(num <= 0) {
            System.out.println("Invalid size");
            return;
        }
        System.out.println("===== Number Pattern =====");

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

}
