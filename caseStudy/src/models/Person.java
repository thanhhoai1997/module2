package models;

public abstract class Person {
    private String ma;
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String cmnd;
    private String sdt;
    private String email;

    public Person() {
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Person(String ma, String hoTen, String ngaySinh, String gioiTinh, String cmnd, String sdt, String email) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.cmnd = cmnd;
        this.sdt = sdt;
        this.email = email;

    }

    @Override
    public String toString() {
        return
                "Ma='" + ma + '\'' +
                ", HoTen =" + hoTen + '\'' +
                ", NgaySinh =" + ngaySinh + '\'' +
                ", GioiTinh =" + gioiTinh + '\'' +
                ", CMND =" + cmnd + '\'' +
                ", SDT=" + sdt + '\'' +
                ", Email=" + email + ",";
    }
}
