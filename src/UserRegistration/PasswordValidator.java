package UserRegistration;

import java.util.function.Predicate;

public class PasswordValidator {

    public static void main(String[] args) {
        // Define the password rule as a lambda expression
        Predicate<String> passwordRule = password -> password.length() >= 8;

        // Test the rule with different passwords
        System.out.println("Is 'Pass123' valid? " + passwordRule.test("Pass123"));
        System.out.println("Is 'StrongPassword' valid? " + passwordRule.test("StrongPassword"));
        System.out.println("Is 'Short' valid? " + passwordRule.test("Short"));
    }
}
