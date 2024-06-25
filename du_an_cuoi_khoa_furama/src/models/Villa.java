package models;

import java.util.Objects;

public class Villa extends Facility {
    private String tieuChuanPhong;
    private double dienTichHoBoi;
    private int soTang;

    public Villa() {
    }

    public Villa(String tieuChuanPhong, double dienTichHoBoi, int soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public Villa(String tenDichVu, double dienTichSudung, double chiPhithue, int soLuongNguoiToiDa, String kieuThue, String tieuChuanPhong, double dienTichHoBoi, int soTang) {
        super(tenDichVu, dienTichSudung, chiPhithue, soLuongNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public double getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(double dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Villa villa = (Villa) o;
        return Double.compare(villa.dienTichHoBoi, dienTichHoBoi) == 0 && soTang == villa.soTang && Objects.equals(tieuChuanPhong, villa.tieuChuanPhong);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tieuChuanPhong, dienTichHoBoi, soTang);
    }

    @Override
    public String toString() {
        return  String.format("%s,%s,%s,%s", super.toString(),"Tieu Chuan Phong = " + tieuChuanPhong, "So Tang = " + soTang,"Dien Tich Ho Boi = " + dienTichHoBoi);
    }
}
