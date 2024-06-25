package services;

import models.Customer;
import models.Employee;
import utils.ConstantUtil;
import utils.doc_ghi_file.DocGhiFile;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    Scanner sc = new Scanner(System.in);
    DocGhiFile docGhiFile = new DocGhiFile();
    List<Customer> list;

    public CustomerServiceImpl() {
        list = new LinkedList<>();
    }

    public void hienThiDanhSachKhachHang() {
        list.forEach(v -> System.out.println(v));
    }

    public void themMoiKhachHang() {
        Customer khachHang = new Customer();
        khachHang.input();
        list.add(khachHang);
    }

    public void chinhSuaThongTinKhachHang() {
        System.out.println("nhap ma khach hang can chinh sua");
        String maKH = sc.nextLine();
        for (Customer khachHang : list
        ) {
            if (khachHang.getMa().equals(maKH)) {
                khachHang.setMa(maKH);
                System.out.println("nhap lai ho ten: ");
                khachHang.setHoTen(sc.nextLine());
                System.out.println("nhap lai ngay sinh");
                khachHang.setNgaySinh(sc.nextLine());
                System.out.println("nhap lai gioi tinh : ");
                khachHang.setGioiTinh(sc.nextLine());
                System.out.println("nhap lai cmnn : ");
                khachHang.setCmnd(sc.nextLine());
                System.out.println("nhap lai so dien thoai : ");
                khachHang.setSdt(sc.nextLine());
                System.out.println("nhap lai loai khach hang  ( Diamond, Platinium, Gold, Silver, Member ) :");
                khachHang.setLoaiKhach(sc.nextLine());
                System.out.println("nhap lai dia chi");
                khachHang.setDiaChi(sc.nextLine());

            }
        }
    }

    public void ghiDuLieu() {

        docGhiFile.writeFile(list, ConstantUtil.customerpath, false);

    }

    public List<Customer> docDuLieu() {
        List<Customer> customerList = new ArrayList<>();
        List<String> stringList = docGhiFile.readFile(ConstantUtil.customerpath);
        String arr[] ;
        for (String s: stringList
             ) {
            arr = s.split(",");
            String ma = arr[0];
            String name = arr[1];
            String cmnd = arr[2];
            String email = arr[3];
            String gioitinh = arr[4];
            String ngaySInh = arr[5];
            String sdt = arr[6];
            String loaiKhach = arr[7];
            String diachi = arr[8];
            Customer customer = new Customer(ma,name,ngaySInh,gioitinh,cmnd,sdt,email,loaiKhach,diachi);
            list.add(customer);
//            + super.getMa(),"Ho Va Ten = "+super.getHoTen(),"CMND = "+super.getCmnd(),"Email : "+ super.getEmail()
//                    ,"Gioi Tinh : " + super.getGioiTinh(), "Ngay Sinh = " + super.getNgaySinh(),"SDT = "+ super.getSdt(),"Loai Khach = " + loaiKhach,"Dia Chi = " + diaChi);
        }
            return list;
        }


    }
