public class GenericUtility {

    public static <T> void printValue(T value) {
        System.out.println(value);
    }

    public static void main(String[] args) {

        printValue(50000);
        printValue("Java");
        printValue(99.99);
    }
}