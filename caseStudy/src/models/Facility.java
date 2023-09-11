package models;

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


    public void setDienTichSudung(double dienTichSudung) {
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
                System.out.println("nhap ma dich vu (ten Dich Vu + Ma So) : ");
                this.maDichVu = sc.nextLine();
                System.out.println("nhap dien tich su dung: ");
                this.dienTichSudung = Double.parseDouble(sc.nextLine());
                System.out.println("nhap chi phi thue: ");
                this.setChiPhithue(Double.parseDouble(sc.nextLine()));
                System.out.println("nhap so luong nguoi toi da : ");
                this.soLuongNguoiToiDa = Integer.parseInt(sc.nextLine());
                System.out.println("nhap kieu thue (bao gồm thuê theo năm, tháng, ngày, giờ)");
                this.kieuThue = sc.nextLine();
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
        return String.format("%s,%s,%s,%s,%s","Ma Dich Vu = " +maDichVu,"Dien Tich = " + dienTichSudung
        + "Chi Phi Thue = "+ chiPhithue,"So Luong Toi Da = " + soLuongNguoiToiDa ,"Kieu Thue = " + kieuThue );
    }
}
