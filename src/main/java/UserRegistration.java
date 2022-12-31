import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    final String NAME_PATTERN = "[A-Z][a-z]{2,}";

    public boolean validateFirstName(String firstName) {
        return patternCheck(firstName, NAME_PATTERN);
    }

    public boolean patternCheck(String input, String fieldPattern) {
        Pattern pattern1 = Pattern.compile(fieldPattern);
        Matcher matcher = pattern1.matcher(input);
        return matcher.matches();
    }
}