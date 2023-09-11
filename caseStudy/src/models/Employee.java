package models;

import java.util.Scanner;

public class Employee extends Person {
    private String trinhDo;
    private String viTri;
    private double luong;

    public Employee() {
    }

    public Employee(String trinhDo, String viTri, double luong) {
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }
//    Employee employee = new Employee(ma,name,cmnd,email,gioiTinh,ngaySinh,sdt,viTri,luong);
    public Employee(String ma, String hoTen, String ngaySinh, String gioiTinh, String cmnd, String sdt, String email, String trinhDo, String viTri, double luong) {
        super(ma, hoTen, ngaySinh, gioiTinh, cmnd, sdt, email);
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma nhan vien : ");
        this.setMa(sc.nextLine());
        System.out.println("nhap ho ten: ");
        this.setHoTen(sc.nextLine());
        System.out.println("nhap ngay sinh");
        this.setNgaySinh(sc.nextLine());
        System.out.println("nhap gioi tinh : ");
        this.setGioiTinh(sc.nextLine());
        System.out.println("nhap cmnn : ");
        this.setCmnd(sc.nextLine());
        System.out.println("nhap so dien thoai : ");
        this.setSdt(sc.nextLine());
        System.out.println("nhap email :");
        this.setEmail(sc.nextLine());
        System.out.println("nhap trinh do  ( rung cấp, Cao đẳng, Đại học và sau đại học ) :");
        this.trinhDo = sc.nextLine();
        System.out.println("nhap vi tri ( Lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc) :");
        this.viTri = sc.nextLine();
        System.out.println("nhap luong");
        this.luong = Double.parseDouble(sc.nextLine());


    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s","Ma Nhan Vien : " +  super.getMa(),"Ho Va Ten = "+super.getHoTen(),"CMND = "+super.getCmnd(),"Email : "+ super.getEmail()
                ,"Gioi Tinh : " + super.getGioiTinh(), "Ngay Sinh = " + super.getNgaySinh(),"SDT = "+ super.getSdt(),"Trinh Do = " +  trinhDo,"Vi Tri = " + viTri,"Luong = " + luong);
    }
}
