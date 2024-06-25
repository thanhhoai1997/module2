package services;

import models.Customer;
import models.Employee;
import utils.ConstantUtil;
import utils.doc_ghi_file.DocGhiFile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeeServiceImpl implements EmployeeService {
    DocGhiFile docGhiFile = new DocGhiFile();
    Scanner sc = new Scanner(System.in);
    public List<Employee> list;

    public EmployeeServiceImpl() {
        list = new ArrayList<>();
    }

    public void hienThiDanhSachNhanVien() {
        for (Employee nhanVien : list
        ) {
            System.out.println(nhanVien);
        }
    }

    public void themMoiNhanVien() {
        Employee employee = new Employee();
        employee.input();
        list.add(employee);
    }

    public void chinhSuaThongTinNhanVien() {
        System.out.println("nhap ma nhan vien can chinh sua");
        String maNV = sc.nextLine();
        for (Employee nhanVien : list
        ) {
            if (nhanVien.getMa().equals(maNV)) {
                nhanVien.setMa(maNV);
                System.out.println("nhap lai ho ten: ");
                nhanVien.setHoTen(sc.nextLine());
                System.out.println("nhap lai ngay sinh");
                nhanVien.setNgaySinh(sc.nextLine());
                System.out.println("nhap lai gioi tinh : ");
                nhanVien.setGioiTinh(sc.nextLine());
                System.out.println("nhap lai cmnn : ");
                nhanVien.setCmnd(sc.nextLine());
                System.out.println("nhap lai so dien thoai : ");
                nhanVien.setSdt(sc.nextLine());
                System.out.println("nhap lai trinh do  ( rung cấp, Cao đẳng, Đại học và sau đại học ) :");
                nhanVien.setTrinhDo(sc.nextLine());
                System.out.println("nhap lai vi tri ( Lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc) :");
                nhanVien.setViTri(sc.nextLine());
                while (true) {
                    try {
                        System.out.println("nhap lai luong");
                        nhanVien.setLuong(Double.parseDouble(sc.nextLine()));
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("nhap sai moi ban nhap lai : ");
                    }
                }

            }

        }

    }


    public void ghiDuLieu() {

        docGhiFile.writeFile(list, ConstantUtil.employeepath, true);

    }

    public List<Employee> docDuLieu() {
        List<Employee> employeeList = new ArrayList<>();
        List<String> stringList = docGhiFile.readFile(ConstantUtil.employeepath);

        String [] arr ;
        for (String s: stringList
             ) {
            arr = s.split(",");
            String ma = arr[0];
            String name = arr[1];
            String cmnd = arr[2];
            String email = arr[3];
            String gioiTinh = arr[4];
            String ngaySinh = arr[5];
            String sdt = arr[6];
            String trinhDo = arr[7];
            String viTri = arr[8];
            Double luong = Double.parseDouble(arr[9]);
            Employee employee = new Employee(ma,name,ngaySinh,gioiTinh,cmnd,sdt,email,trinhDo,viTri,luong);
            list.add(employee);
        }
        return list;
    }
}
