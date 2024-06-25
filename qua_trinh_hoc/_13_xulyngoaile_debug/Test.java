package _13_xulyngoaile_debug;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("numerator");
            int numerator = scanner.nextInt();
            System.out.println("denominator");
            int denominator = scanner.nextInt();
            int result = numerator/denominator;
            System.out.println(numerator + " / " + denominator + " = " + result);
        }catch (InputMismatchException e){
            System.out.println("input error");

        }catch (ArithmeticException e){
            System.out.println("arithmetic error");
        }
        System.out.println("no expesion");



    }
}
