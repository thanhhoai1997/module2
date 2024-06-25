package _03_array_method.exercise;

import java.util.Scanner;

public class th_chuyen_doi_nhiet_do {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1: chuyen tu F sang C");
        System.out.println("2: chuyen tu C sang F");
        System.out.println("0: exit");
        System.out.println("moi ban chon: ");
        int chon = sc.nextInt();
        double c , f;



        switch (chon){
            case 1:
                System.out.println("nhap do F : ");
                f = sc.nextDouble();
                System.out.println("chuyen tu " + f +  " do f sang do c =  " + doFsangC(f) );
                break;
            case 2:
                System.out.println("nhap do C : ");
                c = sc.nextDouble();
                System.out.println("chuyen tu " + c + " do c sang do f = " + doCsangf(c));
                break;
            case 0:
                System.exit(0);
        }


    }
    public static double doFsangC(double f){
        double doc = (5.0 / 9) * (f - 32);
        return doc ;

    }
    public static double doCsangf(double c){
        double dof =  (c*9)/5.0 + 32;
        return dof ;
    }
}
