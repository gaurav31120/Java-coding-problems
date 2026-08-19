class PrimitiveTypelab {
    public static void main(String[] args) {
        byte b = 10;    // 8 bits (1byte) -- -128 to 127
        short s = 100;  // 2 bytes -- -32768 to 32767
        int i = 1000;  //  4 byte
        long l = 10000; // 8 byte
        float f = 10.5f;  // 4 byte
        double d = 100.50; // 8 bytes
        char c = 'A'; // 2 bytes 
        boolean b2 = true; // 1 bytes

        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Integer: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Char: " + c);
        System.out.println("Boolean: " + b2);

    }
}