import java.util.Optional;

public class OptionalMapping {

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

        String domain1 = email1
                .map(e -> e.substring(e.indexOf("@") + 1))
                .orElse("No domain found");

        System.out.println("Amit domain: " + domain1);

        Optional<String> email2 =
                Optional.ofNullable(user2.email);

        String domain2 = email2
                .map(e -> e.substring(e.indexOf("@") + 1))
                .orElse("No domain found");

        System.out.println("Rahul domain: " + domain2);
    }
}