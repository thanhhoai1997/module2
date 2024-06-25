package string_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "Hello java regex 2-12-2018, hello world 12/12/2018";
        Pattern pattern = Pattern.compile("\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}");
        Matcher matcher = pattern.matcher(text);
        System.out.println("ngay thang trong chuoi text: " + text);
        while (matcher.find()){
            System.out.println(text.substring(matcher.start(),matcher.end()));
        }
        String text2 = "2/12/2018";
        String text3 = "12/12/aaaa";

         pattern = Pattern.compile("^\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}$");
        System.out.println("\nChuỗi " + text2 + " có định dạng ngày tháng: "

                + pattern.matcher(text2).matches());

        System.out.println("Chuỗi " + text3 + " có định dạng ngày tháng: "

                + pattern.matcher(text3).matches());
    }


}
