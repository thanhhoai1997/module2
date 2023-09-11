package string_regex.bt_ValidateTelephone;

import java.util.Scanner;

public class Ckeck {
    public static void main(String[] args) {
        ValidateTelephone validateTelephone = new ValidateTelephone();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("enter telephone number");
            String number = sc.nextLine();
            if (validateTelephone.ckeckValidateTelephone(number)){
                System.out.println("telephone number enter : " + number + " is a " + validateTelephone.ckeckValidateTelephone(number) );
                break;
            }else {
                System.out.println("not is number , enter again");
            }


        }
    }
}
