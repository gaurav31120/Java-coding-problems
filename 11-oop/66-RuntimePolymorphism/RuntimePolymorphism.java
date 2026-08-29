public class RuntimePolymorphism {

    static public class Payment {
        void processPayment() {

            System.out.println("Payment");


        }

    }

    static public class CardPayment extends Payment {

        @Override
        void processPayment() {
            System.out.println("Processing card payment");

        }        
    }
    static public class UPIPayment extends Payment {

        @Override
        void processPayment() {
            System.out.println("Processing UPI payment");
            
        }     

    }

    public static void main(String[] args) {
        System.out.println("===== Payment Processing =====");

        // Payment payment = new Payment();
        // payment.processPayment();

        Payment payment = new CardPayment();
        payment.processPayment();
        payment = new UPIPayment();
        payment.processPayment();


        // payment.processPayment();
        // CardPayment cp = new CardPayment();


        // UPIPayment up = new UPIPayment();
    }
    
}

// class Animal {
//     void eat() {
//         System.out.println("Animal eats");
//     }
// }

// class Dog extends Animal {
//     void bark() {
//         System.out.println("Dog barks");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // Creating a parent reference holding a child object
//         Animal myDog = new Dog();
//         myDog.eat(); // Allowed
//     }
// }

