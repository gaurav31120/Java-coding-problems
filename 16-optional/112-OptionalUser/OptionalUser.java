import java.util.Optional;

public class OptionalUser {

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

        Optional<String> email1 = Optional.ofNullable(user1.email);

        if (email1.isPresent()) {
            System.out.println(email1.get());

        } else {
            System.out.println("No email found");

        }

        Optional<String> email2 = Optional.ofNullable(user2.email);

        if (email2.isPresent()) {
            System.out.println(email2.get());

        } else {
            System.out.println("No email found");

        }

    }

}
