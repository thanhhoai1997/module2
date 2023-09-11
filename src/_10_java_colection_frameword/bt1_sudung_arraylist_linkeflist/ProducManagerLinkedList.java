package _10_java_colection_frameword.bt1_sudung_arraylist_linkeflist;

import java.io.*;
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

    public void ghiDuLieu() {

        try(
                FileWriter fw =  new FileWriter("D:\\A0423I1_Nguyen_Thanh_Hoai\\module2\\src\\_10_java_colection_frameword\\bt1_sudung_arraylist_linkeflist\\student.csv",true);
                BufferedWriter bw = new BufferedWriter(fw) ;
                ) {

            String line = "";
            for (Product st : linkedListt
                 ) {
                line =  st.getTenSanPham()+"," + st.getId() + "," + st.getGiaSanPham();
                bw.write(line);
                bw.newLine();



            }

        }catch (Exception e){
            System.out.println("loi file");
        }

    }

    public void docDuLieu() {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader("D:\\A0423I1_Nguyen_Thanh_Hoai\\module2\\src\\_10_java_colection_frameword\\bt1_sudung_arraylist_linkeflist\\student.csv");
            br = new BufferedReader(fr);
            String line ="";
            Product product1;
            String arr[];
            while ((line = br.readLine()) != null){
                arr = line.split(",");
                int id = Integer.parseInt(arr[1]);
                String tenSanPham = arr[0];
                double giaSanPham = Double.parseDouble(arr[2]);
                product1 = new Product(tenSanPham,id,giaSanPham);
                linkedListt.add(product1);


            }

        }catch (Exception e){
            System.out.println("loi file");
        }finally {
            if (br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (fr != null){
                try {
                    fr.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
