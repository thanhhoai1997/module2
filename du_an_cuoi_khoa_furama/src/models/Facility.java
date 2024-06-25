package models;

import utils.ConstantUtil;

import java.util.Objects;
import java.util.Scanner;

public abstract class Facility {
    private String maDichVu;
    private double dienTichSudung;
    private double chiPhithue;
    private int soLuongNguoiToiDa;
    private String kieuThue;

    public Facility() {
    }

    public Facility(String tenDichVu, double dienTichSudung, double chiPhithue, int soLuongNguoiToiDa, String kieuThue) {
        this.maDichVu = tenDichVu;
        this.dienTichSudung = dienTichSudung;
        this.chiPhithue = chiPhithue;
        this.soLuongNguoiToiDa = soLuongNguoiToiDa;
        this.kieuThue = kieuThue;
    }

    public String getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(String tenDichVu) {
        this.maDichVu = tenDichVu;
    }

    public double getDienTichSudung() {
        return dienTichSudung;
    }


    public void setDienTichSudung(
            double dienTichSudung) {
        this.dienTichSudung = dienTichSudung;
    }

    public double getChiPhithue() {
        return chiPhithue;
    }

    public void setChiPhithue(double chiPhithue) {
        this.chiPhithue = chiPhithue;
    }

    public int getSoLuongNguoiToiDa() {
        return soLuongNguoiToiDa;
    }

    public void setSoLuongNguoiToiDa(int soLuongNguoiToiDa) {
        this.soLuongNguoiToiDa = soLuongNguoiToiDa;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }
    public void input(){
        while (true){
            try {
                Scanner sc = new Scanner(System.in);



                System.out.println("nhap dien tich su dung: (>30) ");
                while (true){
                    this.dienTichSudung = Double.parseDouble(sc.nextLine());
                   if (this.dienTichSudung > 30){
                       break;
                   }else {
                       System.err.println("nhap dien tich su dung > 30");
                   }
                }
                System.out.println("nhap chi phi thue: (>0) ");
                while (true){

                    this.setChiPhithue(Double.parseDouble(sc.nextLine()));
                    if (this.chiPhithue > 0){
                        break;
                    }else {
                        System.err.println("chi phi thue phai > 0");
                    }
                }
                System.out.println("nhap so luong nguoi toi da (> 0 && < 20) : ");
                while (true){
                    this.soLuongNguoiToiDa = Integer.parseInt(sc.nextLine());
                    if (this.soLuongNguoiToiDa > 0 && this.soLuongNguoiToiDa < 20){
                        break;
                    }else {
                        System.err.println("nhap so luong nguoi toi da (> 0 && < 20)");
                    }
                }


                System.out.println("nhap kieu thue (bao gồm thuê theo năm, tháng, ngày, giờ va viet hoa chu cai dau tien)");
                while (true){
                    this.kieuThue = sc.nextLine();
                    if (this.kieuThue.matches(ConstantUtil.REDEXTENDICHVU)){
                        break;
                    }else {
                        System.err.println("viet hoa chu cai dau tien");

                    }
                }
                break;
            }catch (NumberFormatException e){
                System.out.println("nhap sai du lieu, moi ban nhap lai : ");
                System.out.println("----------------------------------");
            }

        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facility facility = (Facility) o;
        return Double.compare(facility.dienTichSudung, dienTichSudung) == 0 && Double.compare(facility.chiPhithue, chiPhithue) == 0 && soLuongNguoiToiDa == facility.soLuongNguoiToiDa && Objects.equals(maDichVu, facility.maDichVu) && Objects.equals(kieuThue, facility.kieuThue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maDichVu, dienTichSudung, chiPhithue, soLuongNguoiToiDa, kieuThue);
    }

    @Override
    public String toString() {
       return "Ma Dich Vu = " +maDichVu + "," + "Dien Tich = " + dienTichSudung + "," +
        "Chi Phi Thue = "+ chiPhithue+ ","+ "So Luong Toi Da = " + soLuongNguoiToiDa+"," +"Kieu Thue = " + kieuThue ;

  }

//    @Override
//    public String toString() {
//        return "Facility{" +
//                "maDichVu='" + maDichVu + '\'' +
//                ", dienTichSudung=" + dienTichSudung +
//                ", chiPhithue=" + chiPhithue +
//                ", soLuongNguoiToiDa=" + soLuongNguoiToiDa +
//                ", kieuThue='" + kieuThue + '\'' +
//                '}';
//    }
}
