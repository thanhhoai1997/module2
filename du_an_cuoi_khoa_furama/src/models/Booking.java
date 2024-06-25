package models;


import java.time.LocalDate;
import java.time.ZoneId;

public class Booking implements Comparable<Booking> {
    private String maBooking;
    private Date ngayBatDau;
    private Date ngayKetThuc;
    private String maDichVu;
    private String maKhachHang;
    private String tenDichVu;
    private Facility facility;


    public Booking() {
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public Booking(String maBooking, Date ngayBatDau, Date ngayKetThuc, String maDichVu, String maKhachHang, String tenDichVu, Facility facility) {
        this.maBooking = maBooking;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.maDichVu = maDichVu;
        this.maKhachHang = maKhachHang;
        this.tenDichVu = tenDichVu;
        this.facility = facility;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public String getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(String maBooking) {
        this.maBooking = maBooking;
    }


    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(String maDichVu) {
        this.maDichVu = maDichVu;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }


//    @Override
//    public int compare(Object o1, Object o2) {
//        Booking a =(Booking) o1;
//        Booking b = (Booking) o2;
//        if (((Booking) o1).ngayBatDau > ((Booking) o2).ngayBatDau){
//            return 1;
//        }else if (((Booking) o1).ngayBatDau < ((Booking) o2).getNgayBatDau()){
//            return -1;
//
//        }else {
//            if (((Booking) o1).ngayKetThuc > ((Booking) o2).ngayKetThuc){
//                return 1;
//            } else if (((Booking) o1).ngayKetThuc < ((Booking) o1).ngayKetThuc) {
//                return -1;
//
//            }else {
//                return 0;
//            }

//        }
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Booking that = (Booking) o;
//        return ngayBatDau == that.ngayBatDau && ngayKetThuc == that.ngayKetThuc && Objects.equals(maBooking, that.maBooking) && Objects.equals(maDichVu, that.maDichVu) && Objects.equals(maKhachHang, that.maKhachHang);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(maBooking, ngayBatDau, ngayKetThuc, maDichVu, maKhachHang);
//    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s,%s,%s","Ma Booking = " + maBooking,
                "Ngay Bat Dau = " + ngayBatDau,"Ngay Ket Thuc = " + ngayKetThuc,"Ma Dich Vu = " + maDichVu,
                "Ma Khach Hang = " + maKhachHang, "Ten Dich Vu = " + tenDichVu,"Dich Vu : " + facility);

    }

    @Override
    public int compareTo(Booking o) {
        int nam = ngayBatDau.getNam() - o.ngayBatDau.getNam();
        int thang = ngayBatDau.getThang() - o.ngayBatDau.getThang();
        int ngay = ngayBatDau.getNgay() - o.ngayBatDau.getNgay();

        if(nam != 0){
            return nam;
        }

        if(thang != 0){
            return thang;
        }

        if (ngay!=0){
            return ngay;
        }

        return 1;
//        if (this.ngayBatDau.getNam()- o.ngayBatDau.getNam() > 0){
//            return 1;
//        } else if (this.ngayBatDau.getNam() - ((Booking) o).ngayBatDau.getNam() < 0) {
//            return -1;
//        }else {
//            if (this.ngayBatDau.getThang() -((Booking) o).ngayBatDau.getThang() > 0 ){
//                return 1;
//            } else if (this.ngayBatDau.getThang() -((Booking) o).ngayBatDau.getThang() < 0 ) {
//                return -1;
//            }else {
//                if (this.ngayBatDau.getNgay() -((Booking) o).ngayBatDau.getNgay() > 0 ){
//                    return 1;
//                } else if (this.ngayBatDau.getNgay() -((Booking) o).ngayBatDau.getNgay() < 0 ) {
//                    return -1;
//                }else {
//                    return 0;
//                }
//
//            }
//        }

    }
}
