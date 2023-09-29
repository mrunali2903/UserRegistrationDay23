package UserRegistration;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserValidationTest {

    @Test
    public void testHappyPath() {
        // Create a User instance with valid data
        User user = new User("John", "Doe", "john.doe@example.com", "1234567890", "Passw0rd");

        // Validate the user data
        hashCode(UserValidator.validateFirstName(user.getFirstName()));
        hashCode(UserValidator.validateLastName(user.getLastName()));
        hashCode(UserValidator.validateEmail(user.getEmail()));
        hashCode(UserValidator.validateMobile(user.getMobile()));
        hashCode(UserValidator.validatePassword(user.getPassword()));
    }

    @Test
    public void testSadPath() {
        // Create a User instance with invalid data
        User user = new User("John123", "", "john.doe@example", "1234", "pass");

        // Validate the user data
        assertFalse(UserValidator.validateFirstName(user.getFirstName()));
        assertFalse(UserValidator.validateLastName(user.getLastName()));
        assertFalse(UserValidator.validateEmail(user.getEmail()));
        assertFalse(UserValidator.validateMobile(user.getMobile()));
        assertFalse(UserValidator.validatePassword(user.getPassword()));
    }
}
