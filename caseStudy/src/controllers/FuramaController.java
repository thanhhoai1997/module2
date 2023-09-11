package controllers;

import services.*;

import java.util.Scanner;

public class FuramaController {


    public static void main(String[] args) {
        displayMainMenu();

    }
    public static void displayMainMenu(){
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        BookingServiceImpl bookingService = new BookingServiceImpl();
        PromotionServiceImpl promotionService = new PromotionServiceImpl();




        Scanner sc = new Scanner(System.in);
        System.out.println("MENU");
        while (true){
            try {

                int choose = 0;
                do {
                    System.out.println("1.Quản lý nhân viên ( Employee Management ) \n" +
                            "2.Quản lý khách hàng ( Customer Management )\n" +
                            "3.Quản lý cơ sở vật chất ( Facility Management ) \n" +
                            "4. Quản lý đặt chỗ ( Booking Management ) \n" +
                            "5.Quản lý khuyến mại ( Promotion Management ) \n" +
                            "6.Exit");

                    choose = Integer.parseInt(sc.nextLine());
                    switch (choose){
                        case 1:
                            while (true){
                                try {
                                    int choose1 = 0;
                                    do {
                                        System.out.println("1 Hiển thị danh sách nhân viên\n" +
                                                "2 Thêm nhân viên mới\n" +
                                                "3 Chỉnh sửa nhân viên\n" +
                                                "4. ghi du lieu vao file\n" +
                                                "5. doc du lieu tu file\n" +
                                                "6. Quay lại menu chính");
                                        choose1 = Integer.parseInt(sc.nextLine());
                                        switch (choose1){
                                            case 1:
                                                employeeService.hienThiDanhSachNhanVien();
                                                break;
                                            case 2:
                                                employeeService.themMoiNhanVien();
                                                break;
                                            case 3:
                                                employeeService.chinhSuaThongTinNhanVien();
                                                break;
                                            case 4:
                                                employeeService.ghiDuLieu();
                                                break;
                                            case 5:
                                               employeeService.docDuLieu().forEach(v-> System.out.println(v));
                                              break;

                                        }

                                    }while (choose1 != 6);
                                    break;
                                }catch (NumberFormatException e){
                                    System.out.println("nhap sai kieu du lieu , moi ban nhap lai : ");
                                }

                            }
                                break;

                        case 2:
                            while (true){
                                try {

                                    int choose2 = 0;
                                    do {
                                        System.out.println("1. Hiển thị danh sách khách hàng\n" +
                                                "2. Thêm khách hàng mới\n" +
                                                "3. Chỉnh sửa khách hàng\n" +
                                                "4.ghi du lieu Khach Hang\n" +
                                                "5. doc du lieu tu file\n" +
                                                "6. Quay lại menu chính");
                                        choose2 = Integer.parseInt(sc.nextLine());
                                        switch (choose2){
                                            case 1:
                                                customerService.hienThiDanhSachKhachHang();
                                                break;
                                            case 2:
                                                customerService.themMoiKhachHang();
                                                break;
                                            case 3:
                                                customerService.chinhSuaThongTinKhachHang();
                                                break;
                                            case 4:
                                                customerService.ghiDuLieu();
                                                break;
                                            case 5:
                                                customerService.docDuLieu().forEach(c-> System.out.println(c));
                                                break;
                                        }
                                    }while (choose2 != 6);

                                    break;
                                }catch (NumberFormatException e){
                                    System.out.println("nhap sai moi ban nhap lai : ");
                                }

                            }

                            break;
                        case 3:
                            while (true){
                                try {
                                    int choose3 = 0;
                                    do {
                                        System.out.println("1. hiển thị danh sách Cơ sở\n" +
                                                "2. Thêm cơ sở mới\n" +
                                                "3. hiển thị Danh sách cơ sở bảo trì \n" +
                                                "4 Quay lại menu chính");
                                        choose3 = Integer.parseInt(sc.nextLine());
                                        switch (choose3){
                                            case 1:
                                                facilityService.hienThiDanhSachFacility();
                                                break;
                                            case 2:
                                                int choose4 = 0;
                                                do {
                                                    System.out.println("1. Thêm mới Villa \n" +
                                                            "2. Thêm mới House\n" +
                                                            "3. Thêm mới Room\n" +
                                                            "4.ghi du lieu : \n" +
                                                            "5.doc du lieu\n"+
                                                            "6. Quay lại menu");
                                                    choose4 = Integer.parseInt(sc.nextLine());
                                                    switch (choose4){
                                                        case 1:
                                                            facilityService.addNewVilla();
                                                            break;
                                                        case 2:
                                                            facilityService.addNewHouse();
                                                            break;
                                                        case 3:
                                                            facilityService.addNewRoom();
                                                            break;
                                                        case 5:
                                                            facilityService.docDuLieu();
                                                            break;
                                                        case 4:
                                                            facilityService.ghiDuLieu();
                                                            break;
                                                    }

                                                }while (choose4 != 6);
                                                break;
                                            case 3:
                                                facilityService.dsFacilityCanBaoTri();
                                                break;
                                        }


                                    }while (choose3 != 4);

                                    break;
                                }catch (NumberFormatException e){
                                    System.out.println("nhap sai moi ban nhap lai : ");
                                }
                            }
                            break;

                        case 4:
                            while (true){
                                try {

                                    int choose4 = 0;
                                    do {
                                        System.out.println("1. Thêm đặt chỗ mới\n" +
                                                "2. Hiển thị danh sách đặt phòng\n" +
                                                "3. ghi du lieu booking\n "+
                                                "4. doc du lieu booking\n" +
                                                "5. Tạo hợp đồng mới\n" +
                                                "6. Hiển thị danh sách hợp đồng\n" +
                                                "7. Chỉnh sửa hợp đồng\n" +
                                                "8. ghi du lieu hop dong\n"+
                                                "9. doc du lieu hop dong\n"+


                                                "10. Quay lại menu chính");
                                        choose4 = Integer.parseInt(sc.nextLine());
                                        switch (choose4){
                                            case 1:

                                                bookingService.themMoiBooking(customerService,facilityService);
                                                break;
                                            case 2:
                                                bookingService.hienthiDanhSachBooking();
                                                break;

                                            case 3:
                                                bookingService.ghiDuLieuBooking();
                                                break;
                                            case 4:
                                                bookingService.docDuLieuBooking();
                                                break;
                                            case 5:
                                                bookingService.taoHopDong();
                                                break;
                                            case 6:
                                                bookingService.danhSachHopDong();
                                                break;
                                            case 7:
                                                bookingService.chinhSuaDanhSachHopDong();
                                                break;
                                            case 8:
                                                bookingService.ghiDuLieuHopDong();
                                                break;
                                            case 9:
                                                bookingService.docDuLieuHopDong().forEach(v-> System.out.println(v));
                                                break;

                                        }

                                    }while (choose4 != 10);
                                    break;

                                }catch (NumberFormatException e){
                                    System.out.println("nhap sai moi ban nhap lai : ");
                                }
                            }
                            break;


                        case 5:
                            while (true){
                                try {

                                    int choose5 = 0;
                                    do {
                                        System.out.println("1. Hiển thị danh sách khách hàng sử dụng dịch vụ theo nam\n" +
                                                "2. Hiển thị danh sách khách hàng nhận voucher\n" +
                                                "3. Quay lại menu chính");
                                        choose5 = Integer.parseInt(sc.nextLine());
                                        switch (choose5){
                                            case 1:
                                                promotionService.dSKhachHangSuDungDVTheoNam(bookingService);
                                                break;
                                            case 2:
                                                promotionService.dsKhachHangNhanVoucher(customerService,bookingService);
                                        }
                                    }while (choose5 != 3);

                                    break;

                                }catch (NumberFormatException e){
                                    System.out.println("nhap sai moi ban nhap lai : ");
                                }
                            }
                            break;
                        case 6:
                            System.out.println("bey");
                            System.exit(0);
                    }
                }while (choose != 0);


            }catch (NumberFormatException e){
                System.out.println("nhap sai kieu du du lieu , moi ban nhap lai");
            }


        }

    }
}
