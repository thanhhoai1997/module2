package _10_java_colection_frameword.bt1_sudung_arraylist_linkeflist;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        ProductManager productManager = new ProductManager();
        ProducManagerLinkedList producManagerLinkedList = new ProducManagerLinkedList();
        Scanner sc = new Scanner(System.in);
        int chon = 0;
        do {
            System.out.println("MENU");
            System.out.println("1.Thêm sản phẩm");
            System.out.println("2.Sửa thông tin sản phẩm");
            System.out.println("3.Hiển thị danh sách sản phẩm");
            System.out.println("4.Tìm kiếm sản phẩm");
            System.out.println("5.Sắp xếp sản phẩm tăng dần, giảm dần theo giá");
            System.out.println("6. ghi du lieu vao file student.csv");
            System.out.println("doc du lieu tu file student.csv");
            System.out.println("0. thoat");

            System.out.println("-----------------------------");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon){
                case 1:
                    System.out.println("nhap ten san pham");
                    String ten = sc.nextLine();
                    System.out.println("nhap id san pham");
                    int id = sc.nextInt();
                    System.out.println("nhap gia san pham");
                    double gia = sc.nextDouble();
                Product product = new Product(ten,id,gia);
                producManagerLinkedList.themSanPham(product);
                break;
                case 2:
                    System.out.println("nhap id san pham muon sua");
                    int id1  =  sc.nextInt();
                    sc.nextLine();
                    producManagerLinkedList.suaSanPham(id1);
                    break;
                case 3:
                    System.out.println("danh sach san pham: ");
                    producManagerLinkedList.hienThiDanhSachSanPham();
                    break;
                case 4:
                    System.out.println("nhap ten  san pham muon tim");
                    String tenSanPham = sc.nextLine();
                    producManagerLinkedList.timKiemSanPham(tenSanPham);
                    break;
                case 5:
                    System.out.println("1.sap xep tang");
                    System.out.println("2.sap xep giam");
                    int tangGiam = sc.nextInt();
                    if (tangGiam == 1){
                        producManagerLinkedList.sapXepTang();

                    }else if (tangGiam == 2){
                        producManagerLinkedList.sapXepGiam();

                    }
                    break;

                case 6:
                    producManagerLinkedList.ghiDuLieu();
                case 7:
                    producManagerLinkedList.docDuLieu();
                    break;




            }
        }while (chon != 0);
    }
}
