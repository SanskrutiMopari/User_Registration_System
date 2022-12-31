import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstName_WhenFirstLetterUpperCase_ShouldReturnTrue() {
        boolean result = userRegistration.validateFirstName("Sanskruti");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenLessThanThreeChars_ShouldReturnFalse() {
        boolean result = userRegistration.validateFirstName("Sa");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenLessThanThreeChars_ShouldReturnFalse() {
        boolean result = userRegistration.validateLastName("Mo");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenHasNumber_ShouldReturnFalse() {
        boolean result = userRegistration.validateLastName("Mopari1");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenFirstLetterInUpperCase_ShouldReturnTrue() {
        boolean result = userRegistration.validateLastName("Mopari");
        Assert.assertTrue(result);
    }
}