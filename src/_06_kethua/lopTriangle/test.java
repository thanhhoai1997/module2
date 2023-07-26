package _06_kethua.lopTriangle;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        Triangle  triangles = new Triangle ();
        System.out.println("nhap do dai canh 1 cua tam giac:");
        double a = Double.parseDouble(input.nextLine());
        triangles.setSize1(a);
        System.out.println("nhap do dai canh 2 cua tam giac : ");
        double b = Double.parseDouble(input.nextLine());
        triangles.setSize2(b);
        System.out.println("nhap do dai canh 3 cua tam giac");
        double c = Double.parseDouble(input.nextLine());
        triangles.setSize3(c);

        System.out.println("nhap mau sac cua tam giac: ");
        String color = input.nextLine();
        triangles.setColor(color);
        kiemTra(triangles);

    }
    public static void kiemTra (Triangle triangle){
        Scanner input  = new Scanner(System.in);
        int chon ;

        do{
            System.out.println("moi ban kiem tra cac thuoc tinh cua tam giac: ");
            System.out.println("1. kiem tra mau sac cua tam giac : ");
            System.out.println("2. kiem tra dien tich tam giac :");
            System.out.println("3. kiem tra chu vi tam giac :");
            System.out.println("4. hien thi thong tin cua tam giac :");
            System.out.println("5. thoat chuong trinh");
            chon = input.nextInt();

            switch (chon){
                case 2:
                    System.out.println("dien tich tam giac = " + triangle.getArea());
                    break;
                case 1:
                    System.out.println("mau sac cua lam giac = " + triangle.getColor());
                    break;
                case 3:
                    System.out.println("chu vi cua tam giac =  " + triangle.getPerimeter() );
                    break;
                case 4:
                    System.out.println("Tam Giac: " + triangle.toString());
                    break;
                case 5:
                    System.out.println("bey bey");
                    break;
                default:
                    System.out.println("nhap ngoai lua chon, moi ban chon lai");
                    break;

            }
            System.out.println("---------------------");

        }while (chon != 5);
    }
}
