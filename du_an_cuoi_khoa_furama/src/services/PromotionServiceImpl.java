package services;

import models.Booking;
import models.Customer;

import java.util.*;

public class PromotionServiceImpl implements PromotionService {
    Scanner sc = new Scanner(System.in);
    Stack<Customer> stack;

    public PromotionServiceImpl() {
        stack = new Stack<>();
    }

    public void dSKhachHangSuDungDVTheoNam(BookingServiceImpl bookingService) {
        for (Booking b : bookingService.bookingsSet
        ) {
            if (b.getNgayKetThuc().getNam() - b.getNgayBatDau().getNam() > 0) {
                System.out.println("Khach Hang Co Ma  : " + b.getMaKhachHang() + "\n" +
                        "Su dung dich vu : " + b.getFacility() + "\n" +
                        "Da su dung dich vu :  " + (b.getNgayKetThuc().getNam() - b.getNgayBatDau().getNam()) + " nam ");
                System.out.println("-----------------------------------------");
            }

        }

    }

    public void dsKhachHangNhanVoucher(CustomerServiceImpl customerService, BookingServiceImpl bookingService) {
        stack.clear();
        Date date = new Date();
        for (Booking b : bookingService.bookingsSet
        ) {
            if (b.getNgayBatDau().getThang() == (date.getMonth() + 1) && b.getNgayBatDau().getNam() == (1900 + date.getYear())) {
                for (Customer c : customerService.list
                ) {
                    if (b.getMaKhachHang().equals(c.getMa())) {
                        stack.push(c);
                        break;
                    }

                }
            }

        }
        List<Integer> list = new ArrayList<>();
        System.out.println("--------------------------------------------------------------");
        System.out.println("HIEN TAI CO " + stack.size() + " KHACH HANG NHAN DUOC VOUCHER KHUYEN MAI ! ");
        System.out.println("---------------------------------------------------------------");
        System.out.println("nhập số lượng voucher khuyến mãi 10% : ");
while (true){
    try {
        int sl10 = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < sl10; i++) {
            list.add(10);
        }
        System.out.println("nhập số lượng voucher khuyến mãi 20% :");
        int sl20 = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < sl20; i++) {
            list.add(20);
        }
        System.out.println("nhập số lượng voucher khuyến mãi 50% :");
        int sl50 = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < sl50; i++) {
            list.add(50);
        }

        if ((sl10 + sl20 + sl50) != stack.size()) {
            System.out.println("nhap qua so luong voucher");
        } else {
            System.out.println("---------------------------------------------------------");
            System.out.println("Danh Sach Khach Hang Booking Trong Thang Hien Tai : ");
//                stack.forEach(v-> System.out.println(v));
//                System.out.println("---------------------------------------------------------");
            for (Customer c : stack
            ) {
                for (Booking b : bookingService.bookingsSet
                ) {
                    if (c.getMa().equals(b.getMaKhachHang()) && (b.getNgayBatDau().getThang() == (date.getMonth() + 1) && b.getNgayBatDau().getNam() == (1900 + date.getYear()))) {
                        System.out.println("Khac Hang : " + c + "\n" +
                                "Ngay Booking : " + b.getNgayBatDau());
                        System.out.println("--------------");

                    }

                }

            }

            System.out.println("Danh Sách Khách Hàng Sẽ Duoc Tặng Voucher ");
            for (int i = 0; i < list.size(); i++) {
                System.out.println("- Khach Hang :  " + stack.pop() + "\n" +
                        "- Khuyến Mãi :  " + list.get(i) + "%");
                System.out.println("----------------------------");

            }


        }
        break;

    }catch (NumberFormatException e){
        System.out.println("nhap sai du lieu moi ban nhap lai : ");
    }

}

    }
}
