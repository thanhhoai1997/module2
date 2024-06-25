package models;

public class House extends Facility{
    private String tieuChuanPhong;
    private int soTang;

    public House() {
    }

    public House(String tieuChuanPhong, int soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public House(String tenDichVu, double dienTichSudung, double chiPhithue, int soLuongNguoiToiDa, String kieuThue, String tieuChuanPhong, int soTang) {
        super(tenDichVu, dienTichSudung, chiPhithue, soLuongNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s", super.toString(),"Tieu Chuan Phong = " + tieuChuanPhong, "So Tang = " + soTang);
    }
}
