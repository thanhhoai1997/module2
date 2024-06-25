package _15_io_binaryfile.bt_qlysanpham_luufilenhiphan;

import java.io.Serializable;
import java.util.Scanner;

public class SanPham implements Serializable {
    private String maSanPham;
    private String tenSanPham;
    private String hangSanXuat;
    private double gia;

    public SanPham() {
    }

    public SanPham(String maSanPham, String tenSanPham, String hangSanXuat, double gia) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.hangSanXuat = hangSanXuat;
        this.gia = gia;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    public void inPut(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma San Pham");
        maSanPham = sc.nextLine();
        System.out.println("nhap ten san pham ");
        tenSanPham = sc.nextLine();
        System.out.println("nhap hang san xuat");
        hangSanXuat = sc.nextLine();
        System.out.println("nhap gia ban");
        gia = Double.parseDouble(sc.nextLine());

    }

    @Override
    public String toString() {
        return "SanPham{" +
                "maSanPham='" + maSanPham + '\'' +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", gia=" + gia +
                '}';
    }
}
