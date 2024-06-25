package models;

public class HopDongChoThue {
    private String soHopDong;
    private String maBooking;
    private double soTienCoc;
    private double tongTienThanhToan;
    private String maKhachHang;

    public HopDongChoThue() {
    }

    public HopDongChoThue(String soHopDong, String maBooking, double soTienCoc, double tongTienThanhToan, String maKhachHang) {
        this.soHopDong = soHopDong;
        this.maBooking = maBooking;
        this.soTienCoc = soTienCoc;
        this.tongTienThanhToan = tongTienThanhToan;
        this.maKhachHang = maKhachHang;
    }

    public String getSoHopDong() {
        return soHopDong;
    }

    public void setSoHopDong(String soHopDong) {
        this.soHopDong = soHopDong;
    }

    public String getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(String maBooking) {
        this.maBooking = maBooking;
    }

    public double getSoTienCoc() {
        return soTienCoc;
    }

    public void setSoTienCoc(double soTienCoc) {
        this.soTienCoc = soTienCoc;
    }

    public double getTongTienThanhToan() {
        return tongTienThanhToan;
    }

    public void setTongTienThanhToan(double tongTienThanhToan) {
        this.tongTienThanhToan = tongTienThanhToan;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s","So Hop Dong = " + soHopDong,"Ma Booking = " + maBooking,
                "So Tien Coc = " + soTienCoc, "Tong Tien = " + tongTienThanhToan,"Ma Khach Hang = " + maKhachHang);
//        private String soHopDong;
//        private String maBooking;
//        private double soTienCoc;
//        private double tongTienThanhToan;
//        private String maKhachHang;

    }
}
