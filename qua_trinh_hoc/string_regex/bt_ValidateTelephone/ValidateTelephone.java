package string_regex.bt_ValidateTelephone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateTelephone {
    public static final String VALIDATETELEPHONE = "^\\(\\d{2}\\)-\\([0]\\d{9}\\)$";

    public ValidateTelephone() {
    }
    public boolean ckeckValidateTelephone(String regex){
        Pattern pattern = Pattern.compile(VALIDATETELEPHONE);
        Matcher matcher = pattern.matcher(regex);
        return matcher.find();
    }
}
