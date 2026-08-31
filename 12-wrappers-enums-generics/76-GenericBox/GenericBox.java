public class GenericBox {

    static class Box<T> {

        private T value;

        public void setValue(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }
    }

    public static void main(String[] args) {

        Box<Integer> integerBox = new Box<>();
        integerBox.setValue(50000);
        System.out.println("Integer value: " + integerBox.getValue());

        Box<String> stringBox = new Box<>();
        stringBox.setValue("Java");
        System.out.println("String value: " + stringBox.getValue());

        Box<Double> doubleBox = new Box<>();
        doubleBox.setValue(99.99);
        System.out.println("Double value: " + doubleBox.getValue());
    }
}