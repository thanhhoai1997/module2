package _08_DSA_danh_sach.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(20);
        list.add("hue");
        list.add("dn");
        list.add("Qt");
        System.out.println(list);
//        for (int i = 0; i < list.size();i++){
//            System.out.println(list.get(i));
//        }
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("quang nam");
        list1.add("hoi an");
        list1.add(2,"h");
        list1.addAll(list);
        System.out.println(list1);
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("quang nam");
//        list1.retainAll(list2);
//        System.out.println(list1);
        list1.removeAll(list2);
        System.out.println(list1);
//        for (String value: list1
//             ) {
//            System.out.println(value);
//
//        }
        // truy cap phan tu cua arrayList
        System.out.println(list1.get(2));
        // cap nhat gia tri cua pt
        System.out.println(list1.set(0,"nha trang"));
        System.out.println(list1);
        // xoa tat ca cac pt : clear
//        list1.clear();
//        System.out.println(list1);
        // remove xoa dua vvao chi so
        list1.remove(0);
        System.out.println(list1);
        // remove: xoa truc tiep khi biet gia tri
        list1.remove("Qt");
        System.out.println(list1);
        list1.add("thuan phuoc");
        list1.add("quy nhon");
        list1.add("viet nam");
        System.out.println(list1);
        // tim kiem truc tiep phan tu : contains
        System.out.println(list1.contains("viet nam"));
        list1.add("viet nam");
        System.out.println(list1);
        // tim kiem tra ve vi tri dau tien;
        System.out.println(list1.indexOf("viet nam"));
        System.out.println(list1.indexOf("tuoi"));
        //tim kiem vi tri xuat hien cuoi cung;
        System.out.println(list1.lastIndexOf("viet nam"));
//        list.get()
        // chuyen array list sang mang
        String [] arr = new String[list2.size()];
        arr = list1.toArray(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }


    }
}
