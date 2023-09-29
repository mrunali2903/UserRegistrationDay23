package UserRegistration;
import java.util.function.Predicate;
public class Uc1  {


    public class FirstNameValidator {
        public static void main(String[] args) {
            String firstName = "John"; // Replace with the first name you want to validate

            Predicate<String> isValidFirstName = (name) -> {
                if (name == null || name.isEmpty()) {
                    return false;
                }
                char firstChar = name.charAt(0);
                return Character.isUpperCase(firstChar) && name.length() >= 3;
            };

            if (isValidFirstName.test(firstName)) {
                System.out.println("Valid first name: " + firstName);
            } else {
                System.out.println("Invalid first name: " + firstName);
            }
        }
    }

}
