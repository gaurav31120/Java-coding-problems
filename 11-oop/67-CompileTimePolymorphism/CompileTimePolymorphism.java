public class CompileTimePolymorphism {

    static public class Calculator {

        int calculate(int a, int b)  {

            return a + b;

        }

        double calculate(double a, double b) {
            return a+b;
        }

        int calculate(int a, int b, int c) {
            return a+b+c;
        }
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int sum1 = cal.calculate(1, 2);
        double sum2 = cal.calculate(1.1, 2.2);
        int sum3 = cal.calculate(1, 2, 3);

        System.out.println("===== Compile-Time Polymorphism =====");
        System.out.println("Sum of two integers: " + sum1);
        System.out.println("Sum of two doubles: " + sum2);
        System.out.println("Sum of three integers: " + sum3);
    }
    
}
