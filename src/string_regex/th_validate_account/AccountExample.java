package string_regex.th_validate_account;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private  static final String ACOOUNT = "^[_\\da-z]{6,}";

    public AccountExample() {
    }
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(ACOOUNT);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
