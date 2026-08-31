public class OrderStatusProblem {

    enum OrderStatus {
        PLACED,
        PROCESSING,
        SHIPPED,
        DELIVERED,
        CANCELLED
    }

    public static void main(String[] args) {

        OrderStatus status = OrderStatus.SHIPPED;

        System.out.println("Current status: " + status);

        switch (status) {

            case PLACED:
                System.out.println("Order has been placed.");
                break;

            case PROCESSING:
                System.out.println("Your order is being processed.");
                break;

            case SHIPPED:
                System.out.println("Your order has been shipped.");
                break;

            case DELIVERED:
                System.out.println("Your order has been delivered.");
                break;

            case CANCELLED:
                System.out.println("Your order has been cancelled.");
                break;
        }
    }
}