package _09_dsa_stack_queue.bt_tochucdulieuhoply_queue;

public class ThongTin {
    private String hoTen;
    private String gioiTinh;
    private int ngaySinh;

    public ThongTin(String hoTen, String gioiTinh, int ngaySinh) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public int getNgaySinh() {
        return ngaySinh;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setNgaySinh(int ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    @Override
    public String toString() {
        return "ThongTin{" +
                "hoTen='" + hoTen + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                '}';
    }
}
