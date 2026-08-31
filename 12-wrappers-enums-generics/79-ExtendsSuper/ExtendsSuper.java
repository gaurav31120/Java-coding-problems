import java.util.ArrayList;
import java.util.List;

public class ExtendsSuper {

    // Producer: we mainly READ values
    public static void printNumbers(List<? extends Number> numbers) {

        for (Number number : numbers) {
            System.out.println(number);
        }
    }

    // Consumer: we ADD Integer values
    public static void addIntegers(List<? super Integer> numbers) {

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
    }

    public static void main(String[] args) {

        List<Integer> integerNumbers = new ArrayList<>();

        integerNumbers.add(10);
        integerNumbers.add(20);
        integerNumbers.add(30);

        System.out.println("===== extends Example =====");
        printNumbers(integerNumbers);

        List<Number> numberList = new ArrayList<>();

        System.out.println("===== super Example =====");
        addIntegers(numberList);

        System.out.println(numberList);
    }
}