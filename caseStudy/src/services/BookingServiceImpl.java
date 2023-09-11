package services;

import models.Booking;
import models.Customer;
import models.Date;
import models.Facility;
import models.HopDongChoThue;
import utils.ConstantUtil;
import utils.doc_ghi_file.DocGhiFile;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    DocGhiFile docGhiFile = new DocGhiFile();
    Scanner sc = new Scanner(System.in);

    TreeSet<Booking> bookingsSet;
    ArrayList<HopDongChoThue> arrayList = new ArrayList<>();




    public BookingServiceImpl() {
        bookingsSet = new TreeSet<>();


    }

    public void hienthiDanhSachBooking() {


        for (Booking booking : bookingsSet
        ) {
            System.out.println(booking);
            System.out.println("------------");

        }


    }

    public void themMoiBooking(CustomerServiceImpl customerService, FacilityServiceImpl facilityService) {

        Scanner sc = new Scanner(System.in);

        Booking booking = new Booking();

        System.out.println("DANH SACH KHACH HANG");
        customerService.hienThiDanhSachKhachHang();
        System.out.println("nhap ma khach hang muon booking");
        String maKH = sc.nextLine();
        for (Customer customer : customerService.list
        ) {
            if (customer.getMa().equals(maKH)) {
                booking.setMaKhachHang(maKH);
            }

        }

        System.out.println("DANH SACH DICH VU:");
        facilityService.hienThiDanhSachFacility();
        System.out.println("nhap ma dich vu muon booking: ");
        String maDV = sc.nextLine();
        for (Map.Entry<Facility, Integer> entry : facilityService.linkedHashMap.entrySet()) {
//            System.out.println(entry.getKey().getMaDichVu());
            if (entry.getKey().getMaDichVu().equals(maDV)) {
                booking.setFacility(entry.getKey());
                entry.setValue(entry.getValue() + 1);
                booking.setMaDichVu(entry.getKey().getMaDichVu());
                break;
//            }else {
//                System.out.println("khong tim thay");
//            }

            }
        }

        System.out.println("nhap ma booking");
        booking.setMaBooking(sc.nextLine());
        System.out.println("nhap ngay thang nam bat dau : ");
        System.out.println("---------------------------");

        while (true){
            try {
                Date date1 = new Date();
                System.out.println("nhap ngay bat dau : ");
                date1.setNgay(Integer.parseInt(sc.nextLine()));
                System.out.println("nhap thang : ");
                date1.setThang(Integer.parseInt(sc.nextLine()));
                System.out.println("nhap nam : ");
                date1.setNam(Integer.parseInt(sc.nextLine()));
                booking.setNgayBatDau(date1);
                System.out.println("------------------------");
                System.out.println("nhap ngay thang nam ket thuc : ");
                System.out.println("-----------------------");
                Date date2 = new Date();
                System.out.println("nhap ngay ket thuc : ");
                date2.setNgay(Integer.parseInt(sc.nextLine()));
                System.out.println("nhap thang : ");
                date2.setThang(Integer.parseInt(sc.nextLine()));
                System.out.println("nhap nam : ");
                date2.setNam(Integer.parseInt(sc.nextLine()));
                booking.setNgayKetThuc(date2);
                break;
            }catch (NumberFormatException e){
                System.out.println("nhap sai du lieu moi ban nhap lai : ");
            }
        }

        System.out.println("---------------------");
        System.out.println("nhap ten dich vu: ");
        booking.setTenDichVu(sc.nextLine());
//       for (Booking b: set
//          ) {
//         if (b.hashCode() != booking.hashCode()){
//               set.remove(b);
//              break;
//           }
//
//       }



        bookingsSet.add(booking);


    }

    public void taoHopDong() {
        Queue<Booking> queue = new LinkedList<>();
        for (Booking b : bookingsSet
             ) {
            if (b != null){
                queue.offer(b);
            }

        }
        for (HopDongChoThue h: arrayList
             ) {
            for (Booking b: queue
                 ) {
                if (h.getMaBooking().equals(b.getMaBooking()) ){
                    queue.remove();
                    break;
                }

            }


        }

        HopDongChoThue hopDongChoThue = new HopDongChoThue();
        Scanner sc = new Scanner(System.in);
        System.out.println("DANH SACH BOOKING");
        if (queue.size() != 0){
            queue.forEach(v-> System.out.println(v));
            System.out.println("moi ban nhap ma booking muon lam hop dong: \n" +
                    "- yeu cau : tao hop dong co ngay bat dau booking som nhat !");
            System.out.println("-------------------------------------------");
            System.out.println("nhap ma booking muon tao hop dong : ");
            String maBK = sc.nextLine();


            if (queue.peek().getMaBooking().equals(maBK)){
                hopDongChoThue.setMaBooking(queue.peek().getMaBooking());
                System.out.println("nhap so hop dong");
                hopDongChoThue.setSoHopDong(sc.nextLine());
                System.out.println("nhap ma Khach Hang");
                hopDongChoThue.setMaKhachHang(sc.nextLine());
                while (true){
                    try {
                        System.out.println("nhap so tien coc");
                        hopDongChoThue.setSoTienCoc(Double.parseDouble(sc.nextLine()));
                        System.out.println("nhap so tien can phai thanh toan : ");
                        hopDongChoThue.setTongTienThanhToan(Double.parseDouble(sc.nextLine()));
                        break;
                    }catch (NumberFormatException e){
                        System.out.println("nhap sai du lieu moi ban nhap lai : ");
                        System.out.println("-----------------------------");
                    }
                }

                arrayList.add(hopDongChoThue);

            }else {
                System.out.println("nhap k dung thu tu ma Booking");
            }


        }else {
            System.out.println("HIEN TAI K CO BOOKING NAO !");
        }
        }
        public void danhSachHopDong(){
        arrayList.forEach(v-> System.out.println(v));
        }

    public void chinhSuaDanhSachHopDong() {
        Scanner sc =new Scanner(System.in);
        System.out.println("DANH SACH HOP DONG: ");
        arrayList.forEach(c-> System.out.println(c));
        System.out.println("----------------------------------");
        System.out.println("nhap ma Hop Dong muon chinh sua : ");
        String maHD = sc.nextLine();
        for (HopDongChoThue hopDong: arrayList
             ) {
            if (hopDong.getSoHopDong().equals(maHD)){
                hopDong.setSoHopDong(maHD);
                System.out.println("nhap lai ma booking : ");
                hopDong.setMaBooking(sc.nextLine());
                while (true){
                    try {
                        System.out.println(" nhap lai so tien coc: ");
                        hopDong.setSoTienCoc(Double.parseDouble(sc.nextLine()));
                        System.out.println(" nhap lai so tien phai thanh toan : ");
                        hopDong.setTongTienThanhToan(Double.parseDouble(sc.nextLine()));
                        break;
                    }catch (NumberFormatException e){
                        System.out.println("nhap sai du lieu , moi ban nhap lai : ");
                        System.out.println("----------------");
                    }
                }

                System.out.println(" nhap lai ma khach hang : ");
                hopDong.setMaKhachHang(sc.nextLine());
                System.out.println(hopDong);
                break;
            }


        }
    }

    public void ghiDuLieuBooking() {
        System.out.println("nhap duong dan : ");
        String toPath = sc.nextLine();
        System.out.println("Nhap so nguyen bat ki neu ban muon appen :\n" +
                "Nhap chu bat ki neu ban  muon Override :   ");
        boolean isAppen = sc.hasNextInt();
        DocGhiFile docGhiFile = new DocGhiFile();


        docGhiFile.writeFile((List<?>) bookingsSet, toPath, isAppen);
    }

    public void docDuLieuBooking() {
    }

    public void ghiDuLieuHopDong() {




        docGhiFile.writeFile(arrayList, ConstantUtil.contractpath, false);
    }

    public List<HopDongChoThue> docDuLieuHopDong() {
        List<HopDongChoThue> hopDongChoThueList = new ArrayList<>();
      List<String> stringList =  docGhiFile.readFile(ConstantUtil.contractpath);
      String arr[] ;
        for (String s: stringList
             ) {
            arr = s.split(",");
            String soHopDong = arr[0];
            String maBooking = arr[1];
            double sotienCoc = Double.parseDouble(arr[2]);
            double soTienThanhToan = Double.parseDouble(arr[3]);
            String maKhachhang = arr[4];
            HopDongChoThue hopDongChoThue = new HopDongChoThue(soHopDong,maBooking,sotienCoc,soTienThanhToan,maKhachhang);
            hopDongChoThueList.add(hopDongChoThue);
        }
        return hopDongChoThueList;
    }
}


