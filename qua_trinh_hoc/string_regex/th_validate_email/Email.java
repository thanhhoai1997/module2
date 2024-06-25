package string_regex.th_validate_email;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Email {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("nhap e mail : ");
            String email = sc.nextLine();
            Pattern pattern = Pattern.compile("^\\w+\\w*@\\w+(\\.\\w+)$");
            if (pattern.matcher(email).matches()){
                System.out.println(email);
                break;
            }else {
                System.out.println("nhap sai moi ban nhap lai : ");
            }
        }
    }
}
