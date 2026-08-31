public class Unboxing {

    public static void main(String[] args) {

        Integer num1 = 50000;

        int unboxedNumber = num1;

        int addition = unboxedNumber + 10000;

        System.out.println("Wrapper value: " + num1);
        System.out.println("Primitive value: " + unboxedNumber);
        System.out.println("After adding 10000: " + addition);
    }
}