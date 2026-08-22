import java.util.Scanner;

class MenuCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("First number: ");
        double firstNo = sc.nextDouble();
        System.out.println("Second number: ");
        double secondNo = sc.nextDouble();
        System.out.println("Please select the choice: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        int choice = sc.nextInt();

        double result = 0.0;
        String operation = "";

        switch (choice) {
            case 1:
                result = (firstNo + secondNo);
                operation = "Addition";
                break;
            case 2:
                result = (firstNo - secondNo);
                operation = "Subtraction";
                break;
            case 3:
                result = (firstNo * secondNo);
                operation = "Multiplication";
                break;
            case 4:
                if (secondNo == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    result = (firstNo / secondNo);
                    operation = "Division";

                }
                break;
            case 5:
                if (secondNo == 0) {
                    System.out.println("Cannot perform modulus by zero");
                } else {
                    result = firstNo % secondNo;
                    operation = "Modulus";
                }
                break;
            default:
                System.out.println("Invalid input");

        }

        System.out.println("===== Calculator Result =====");
        System.out.println("Operation: " + operation);
        System.out.println("Result: " + result);

    }

}
