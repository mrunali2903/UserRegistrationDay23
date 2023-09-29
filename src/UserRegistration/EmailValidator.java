package UserRegistration;

    import java.util.function.Predicate;

    public class EmailValidator {
        public static void main(String[] args) {
            String email = "abc.xyz@bl.co.in";

            Predicate<String> emailValidator = (str) -> {
                // Define the regular expression for a valid email
                String regex = "^[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)*@([a-zA-Z]+)\\.(co)\\.(in)$";

                // Check if the email matches the regular expression
                return str.matches(regex);
            };

            if (emailValidator.test(email)) {
                System.out.println("Valid email: " + email);
            } else {
                System.out.println("Invalid email: " + email);
            }
        }
    }


