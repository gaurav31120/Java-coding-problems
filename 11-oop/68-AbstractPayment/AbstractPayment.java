import java.util.Scanner;

public class AbstractPayment {

    static abstract class Payment {
        double amount;

        Payment(double amount) {
            this.amount = amount;
        }

        abstract void processPayment();
    }

    static class CardPayment extends Payment {
        CardPayment(double amount) {
            super(amount);
        }

        @Override
        void processPayment() {
            System.out.println("Processing card payment of " + amount);
        }

    }

    static class UPIPayment extends Payment {
        UPIPayment(double amount) {
            super(amount);
        }

        @Override
        void processPayment() {
            System.out.println("Processing UPI payment of " + amount);
        }

    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // double amount = sc.nextDouble();
        // Payment payment = new Payment();
        CardPayment cp = new CardPayment(5000);
        cp.processPayment();
        // double cardPayment = cp.processPayment();
        // System.out.println("Processing card payment of " + cp.amount);
        UPIPayment up = new UPIPayment(3000);
        up.processPayment();
        // double upi = up.processPayment();
        // System.out.println("Processing UPI payment of " + up.amount);
    }

}

// // Abstract class definition
// abstract class Animal {
// String name;

// // Constructor allowed
// Animal(String name) {
// this.name = name;
// }

// // Abstract method (no body)
// abstract void makeNoise();

// // Concrete method (has body)
// void breathe() {
// System.out.println(name + " is breathing.");
// }
// }

// // Concrete subclass
// class Dog extends Animal {
// Dog(String name) {
// super(name);
// }

// // Implementing the abstract method
// @Override
// void makeNoise() {
// System.out.println(name + " says: Woof!");
// }
// }

// public class Main {
// public static void main(String[] args) {
// // Animal a = new Animal("Generic"); // ERROR: Cannot instantiate

// Dog myDog = new Dog("Buddy");
// myDog.breathe(); // Inherited concrete method
// myDog.makeNoise(); // Implemented abstract method
// }
// }
