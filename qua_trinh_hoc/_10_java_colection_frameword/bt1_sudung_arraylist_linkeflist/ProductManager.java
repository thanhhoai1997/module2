package _10_java_colection_frameword.bt1_sudung_arraylist_linkeflist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManager {
    private Product product;
    private ArrayList<Product> arrayList;
    Scanner sc = new Scanner(System.in);

    public ProductManager() {
        arrayList = new ArrayList<>();
    }

    public void themSanPham(Product p) {

        arrayList.add(p);


    }

    public void suaSanPham(Integer id) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getId() == id) {
                System.out.println("nhap lai ten muon sua");
                String tenMoi = sc.nextLine();

                System.out.println("nhap lai gia san pham");
                Double giaMoi = sc.nextDouble();

                Product p = new Product(tenMoi, id, giaMoi);
                arrayList.set(i, p);
            }
        }


    }

    public void hienThiDanhSachSanPham() {
        System.out.println(arrayList);
    }

    public void timKiemSanPham(String tenSanPham) {
        for (Product element: arrayList
             ) {
            if (element.getTenSanPham().indexOf(tenSanPham)  >= 0){
                System.out.println(element);
            }

        }
    }
    public void sapXepTang(){
        Collections.sort(arrayList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getGiaSanPham() < o2.getGiaSanPham()){
                    return -1;
                } else if (o1.getGiaSanPham() > o2.getGiaSanPham()) {
                    return 1;
                    
                }else {
                    return 0;
                }
            }
        });
    }
    public void sapXepGiam(){
        Collections.sort(arrayList, (o1, o2) -> {
            if (o1.getGiaSanPham() > o2.getGiaSanPham()){
                return -1;
            } else if (o1.getGiaSanPham() < o2.getGiaSanPham()) {
                return 1;

            }else {
                return 0;
            }
        });
    }
}
