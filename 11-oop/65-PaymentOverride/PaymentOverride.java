public class PaymentOverride {

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
        CardPayment cp = new CardPayment();

        cp.processPayment();

        UPIPayment up = new UPIPayment();
        up.processPayment();
    }
    
}
