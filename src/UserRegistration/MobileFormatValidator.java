package UserRegistration;

import java.util.function.Predicate;

public class MobileFormatValidator {
    public static void main(String[] args) {
        // Define the predefined format as a regular expression
        String mobileFormatRegex = "^(\\d{2} \\d{10})$";

        // Create a lambda expression to check if the mobile number matches the format
        Predicate<String> isValidMobileFormat = (mobileNumber) -> mobileNumber.matches(mobileFormatRegex);

        // Test the lambda expression with some example mobile numbers
        String mobileNumber1 = "91 9919819801";
        String mobileNumber2 = "1234567890";

        System.out.println("Mobile Number 1 is valid: " + isValidMobileFormat.test(mobileNumber1));
        System.out.println("Mobile Number 2 is valid: " + isValidMobileFormat.test(mobileNumber2));
    }
}
