package string_regex.bt_validate_tenlophoc;

import java.util.Scanner;

public class Ckeck {
    public static void main(String[] args) {
        ValidateNameClass validateNameClass = new ValidateNameClass();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter regex");
        String regex = sc.nextLine();
        System.out.println("ClassName :  " + regex + " is a " + validateNameClass.ckeckValidateNameClass(regex));
    }
}
