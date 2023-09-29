package UserRegistration;

import java.util.function.Predicate;

public class UserValidation {

    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String email = "john.doe@example.com";
        String mobile = "1234567890";

        validateInput(firstName, str -> str.matches("^[A-Za-z]+$"), "First Name");
        validateInput(lastName, str -> str.matches("^[A-Za-z]+$"), "Last Name");
        validateInput(email, str -> str.matches("^[A-Za-z0-9+_.-]+@(.+)$"), "Email");
        validateInput(mobile, str -> str.matches("^[0-9]{10}$"), "Mobile");
    }

    public static void validateInput(String input, Predicate<String> validator, String fieldName) {
        if (validator.test(input)) {
            System.out.println(fieldName + " is valid: " + input);
        } else {
            System.out.println(fieldName + " is not valid: " + input);
        }
    }
}
