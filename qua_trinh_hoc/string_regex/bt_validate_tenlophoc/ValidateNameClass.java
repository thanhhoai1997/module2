package string_regex.bt_validate_tenlophoc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNameClass {
    public static final String ValidateClassName = "^[C|A|B]\\d{4}[G-M]$";

    public ValidateNameClass() {
    }

    public boolean ckeckValidateNameClass(String regex){
        Pattern pattern = Pattern.compile(ValidateClassName);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();

    }

}
