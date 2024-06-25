package _01_introduction_java.exercise;

import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so can doc : ");
        int nhapso = scanner.nextInt();
        int donvi = nhapso % 10;
        int hangchuc = (nhapso %100)/10;
        int hangtram = nhapso/100;
        String [] arr = {"zero","one","tow","three","for","five","six","seven","eight","nine"};
        String [] arr2 = {"twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        String [] arr3 = {"one hundred","tow hundred","three hundred","for hundred","five hundred","six hundred",
                "seven hundred","eight hundred","nine hundred"};

        String docDonVi = "";
        String docHangChuc ="";
        String docHangTram ="";

        for (int i = 0; i < arr.length; i++){
            if (donvi == i){
                docDonVi = arr[i];
            }
            }
        for (int i = 0; i < arr2.length;i++){
            if (hangchuc == i+2){
                docHangChuc = arr2[i];
            }
        }
        for (int i = 1 ; i <= arr3.length ;i++){
            if (hangtram == i){
                docHangTram = arr3[i];

            }
        }

    if (nhapso < 10 && nhapso >= 0) {
        switch (nhapso) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("tow");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("for");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("sevent");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
        }
    }
        else if (nhapso < 20){

            switch (nhapso){
                case 10:
                    System.out.println("ten");
                    break;
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("thirteen");
                    break;
                case 14:
                    System.out.println("fourteen");
                    break;
                case 15:
                    System.out.println("fifteen");
                    break;

            }
            switch (donvi){

                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println(docDonVi + "teen");
                    break;

            }
        }else if (nhapso < 100){
            switch (hangchuc){

                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println(docHangChuc +"-"+ docDonVi);
                }

            }else {
            switch (hangtram){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println(docHangTram +" " +  docHangChuc +" " + docDonVi);
            }

    }

        }

    }








