package _15_io_binaryfile.bt_qlysanpham_luufilenhiphan;

import _15_io_binaryfile.th_io_dssv_rafilenhiphan.Student;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<SanPham> list = new ArrayList<>();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choose = 0;
        
        do {
            showMenu();
            choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    themSanPham();
                    break;
                case 2:
                    hienThiSanPham();
                    break;
                case 3:
                    System.out.println("nhap ma san pham muon tim");
                    String ma = sc.nextLine();
                    timSanPham(ma);
                    break;
                case 4:
                    themSanPhamVaoFile(list);
                    break;
                case 5:
                    hienThiSanPhamTuFile();
                    break;
                case 0:
                    System.out.println("bey!");
                    
            }
            
        }while (choose != 0);
    }

    private static void timSanPham(String maSanPham) {
        for (SanPham s: list
             ) {
            if (s.getMaSanPham().indexOf(maSanPham) != -1){
                System.out.println(s);

            }

        }

    }

    private static void hienThiSanPham() {
        list.forEach(v-> System.out.println(v));

    }

    private static void themSanPham() {
        SanPham sanPham = new SanPham();
        sanPham.inPut();
        list.add(sanPham);


    }



    private static void hienThiSanPhamTuFile() {
       List<SanPham> list1 = new ArrayList<>();
        try(
                FileInputStream fis = new FileInputStream("src/_15_io_binaryfile/bt_qlysanpham_luufilenhiphan/SanPham.txt");
                ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
           list1 = (List<SanPham>) ois.readObject();
           list1.forEach(v-> System.out.println(v));


            }


        catch (Exception e){
            e.printStackTrace();
        }

    }

    private static void themSanPhamVaoFile(List<SanPham> list) {

        try(
                FileOutputStream fos = new FileOutputStream("src/_15_io_binaryfile/bt_qlysanpham_luufilenhiphan/SanPham.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                ) {
            oos.writeObject(list);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void showMenu(){
            System.out.println("MENU");
            System.out.println("1.them san pham ");
            System.out.println("2. hien thi san pham ");
            System.out.println("3. tim san pham ");
             System.out.println("4. luu san pham vao file");
            System.out.println("5.doc san pham tu file");
        System.out.println("0.thoat");
    }
}
