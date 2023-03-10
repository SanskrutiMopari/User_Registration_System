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

    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.validateEmaiId("abc.100@yahoo.com");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNo_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.validateMobileNumber("91 9919819801");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNo_WhenNotStartWith91_ShouldReturnFalse() {
        boolean result = userRegistration.validateMobileNumber("9919819801");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordPattern_WhenMin8Char_ShouldReturnTrue() {
        boolean result = userRegistration.validatePasswordPattern("amr@156A");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenHasMoreThan1SpecialChar_ShouldReturnTrue() {
        boolean result = userRegistration.validatePasswordPattern("bHar%a#T1");
        Assert.assertTrue(result);
    }
}