public class NumberUtility {

    public static <T extends Number> double doubleValue(T number) {
        return number.doubleValue() * 2;
    }

    public static void main(String[] args) {

        Integer integerNumber = 50;
        Double doubleNumber = 25.5;

        System.out.println("===== Number Utility =====");

        System.out.println(
                "Integer doubled: " + doubleValue(integerNumber)
        );

        System.out.println(
                "Double doubled: " + doubleValue(doubleNumber)
        );
    }
}