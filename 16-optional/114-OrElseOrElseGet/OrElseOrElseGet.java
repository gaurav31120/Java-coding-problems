import java.util.Optional;

public class OrElseOrElseGet {

    static class User {
        String name;
        String email;

        User(String name, String email) {
            this.name = name;
            this.email = email;
        }
    }

    public static void main(String[] args) {

        User user1 = new User("Amit", "amit@gmail.com");
        User user2 = new User("Rahul", null);

        Optional<String> email1 =
                Optional.ofNullable(user1.email);

        String result1 =
                email1.orElse("default@gmail.com");

        String result2 =
                email1.orElseGet(() -> "generated@gmail.com");

        System.out.println("Amit orElse: " + result1);
        System.out.println("Amit orElseGet: " + result2);

        Optional<String> email2 =
                Optional.ofNullable(user2.email);

        String result3 =
                email2.orElse("default@gmail.com");

        String result4 =
                email2.orElseGet(() -> "generated@gmail.com");

        System.out.println("Rahul orElse: " + result3);
        System.out.println("Rahul orElseGet: " + result4);
    }
}