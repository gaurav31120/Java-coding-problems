class IntegerToDouble {
    public static void main(String[] args) {
        // implicit -- int to double -- smaller to larger  -- widning
        // explicit -- double to int -- larger to smaller  -- narrowing

        int intValue = 100;
        double doubleValue = intValue;
        System.out.println("Integer: " + intValue);

        System.out.println("Double: " + doubleValue);

        // Explicit
        double doubleValue2 = (double) intValue;
         System.out.println("Double: " + doubleValue2);

    }
}