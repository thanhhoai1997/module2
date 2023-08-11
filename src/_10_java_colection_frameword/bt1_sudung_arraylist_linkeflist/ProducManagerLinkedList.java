package _10_java_colection_frameword.bt1_sudung_arraylist_linkeflist;

import java.util.*;

public class ProducManagerLinkedList {
    private Product product;
    private LinkedList<Product> linkedListt;
    Scanner sc = new Scanner(System.in);

    public ProducManagerLinkedList() {
        linkedListt = new LinkedList<>();
    }

    public void themSanPham(Product p) {

        linkedListt.add(p);


    }

    public void suaSanPham(Integer id) {
        for (int i = 0; i < linkedListt.size(); i++) {
            if (linkedListt.get(i).getId() == id) {
                System.out.println("nhap lai ten muon sua");
                String tenMoi = sc.nextLine();

                System.out.println("nhap lai gia san pham");
                Double giaMoi = sc.nextDouble();

                Product p = new Product(tenMoi, id, giaMoi);
                linkedListt.set(i, p);
            }
        }


    }

    public void hienThiDanhSachSanPham() {
        System.out.println(linkedListt);
    }

    public void timKiemSanPham(String tenSanPham) {
        for (Product element: linkedListt
        ) {
            if (element.getTenSanPham().indexOf(tenSanPham)  >= 0){
                System.out.println(element);
            }

        }
    }
    public void sapXepTang(){
        Collections.sort(linkedListt, new Comparator<Product>() {
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
        Collections.sort(linkedListt, (o1, o2) -> {
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
