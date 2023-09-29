package UserRegistration;
import java.util.Scanner;
public class Uc2 {

    public class LastNameValidator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your last name: ");
            String lastName = scanner.nextLine();

            if (isValidLastName(lastName)) {
                System.out.println("Valid last name: " + lastName);
            } else {
                System.out.println("Invalid last name. Last name should start with a capital letter and have a minimum length of 3 characters.");
            }
        }

        public static boolean isValidLastName(String lastName) {
            // Check if the last name is not empty and has at least 3 characters
            if (lastName.length() >= 3) {
                // Check if the first character is an uppercase letter
                char firstChar = lastName.charAt(0);
                if (Character.isUpperCase(firstChar)) {
                    return true;
                }
            }
            return false;
        }
    }

}
