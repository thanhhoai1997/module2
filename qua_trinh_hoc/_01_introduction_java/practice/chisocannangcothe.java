package _01_introduction_java.practice;

import java.util.Scanner;

public class chisocannangcothe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight , height, bmi ;
        System.out.println("enter weight : ");
        weight = scanner.nextDouble();
        System.out.println("enter height: ");
        height = scanner.nextDouble();
        bmi = weight/Math.pow(height,2);
        if (bmi < 18.5){
            System.out.println("underWeight ");
        }else if(bmi < 25.0){
            System.out.println("normal");
        }else if(bmi < 30){
            System.out.println("Overweight");
        }else {
            System.out.println("obese");
        }


    }
}
