package models;

import utils.ConstantUtil;

import java.util.Date;
import java.util.Scanner;

public class Customer extends Person{
    private String loaiKhach;
    private String diaChi;

    public Customer() {
    }

    public Customer(String loaiKhach, String diaChi) {
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public Customer(String ma, String hoTen, String ngaySinh, String gioiTinh, String cmnd, String sdt, String email, String loaiKhach, String diaChi) {
        super(ma, hoTen, ngaySinh, gioiTinh, cmnd, sdt, email);
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public void input(){
        Date date = new Date();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma khach hang : ");
        this.setMa(sc.nextLine());
        System.out.println("nhap ho ten: ");
        this.setHoTen(sc.nextLine());
while (true){
    System.out.println("nhap ngay sinh : dd/mm/YYYY ");
    this.setNgaySinh(sc.nextLine());
    if (this.getNgaySinh().matches(ConstantUtil.REGEXNGAYSINH)){
        String arr[] = this.getNgaySinh().split("/");
        if ((date.getYear() + 1900) - Integer.parseInt(arr[2]) < 100){
                break;
        }else {
            System.err.println("qua 100 tuoi : ");
        }
    }else {
        System.err.println("nhap sai dinh dang ngay sinh");
    }
}




        System.out.println("nhap gioi tinh : ");
        this.setGioiTinh(sc.nextLine());
        System.out.println("nhap cmnn : ");
        this.setCmnd(sc.nextLine());
        System.out.println("nhap so dien thoai : ");
        this.setSdt(sc.nextLine());
        System.out.println("nhap email");
        this.setEmail(sc.nextLine());
        System.out.println("nhap loai khach  ( Diamond, Platinium, Gold, Silver, Member ) :");
        this.loaiKhach = sc.nextLine();
        System.out.println("nhap dia chi khach hang: ");
        this.diaChi = sc.nextLine();
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s","Ma Khach Hang : " + super.getMa(),"Ho Va Ten = "+super.getHoTen(),"CMND = "+super.getCmnd(),"Email : "+ super.getEmail()
                ,"Gioi Tinh : " + super.getGioiTinh(), "Ngay Sinh = " + super.getNgaySinh(),"SDT = "+ super.getSdt(),"Loai Khach = " + loaiKhach,"Dia Chi = " + diaChi);
    }
    }

