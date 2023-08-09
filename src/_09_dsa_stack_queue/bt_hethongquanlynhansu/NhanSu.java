package _09_dsa_stack_queue.bt_hethongquanlynhansu;

public class NhanSu {
    private String hoTen;
    private String gioiTinh;
    private int namSinh;

    public NhanSu() {
    }

    public NhanSu(String hoTen, String gioiTinh, int namSinh) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    @Override
    public String toString() {
        return "{" +
                "hoTen='" + hoTen + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", namSinh=" + namSinh +
                '}';
    }
}
