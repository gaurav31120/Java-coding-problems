public class Autoboxing {

    public static void main(String[] args) {

        int num1 = 50000;

        Integer boxedNumber = num1;

        System.out.println("Primitive value: " + num1);
        System.out.println("Wrapper value: " + boxedNumber);
        System.out.println("Wrapper class: " + boxedNumber.getClass());
    }
}