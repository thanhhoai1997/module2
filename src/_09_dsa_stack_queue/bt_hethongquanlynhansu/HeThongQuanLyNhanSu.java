package _09_dsa_stack_queue.bt_hethongquanlynhansu;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;


public class HeThongQuanLyNhanSu {
    public static void main(String[] args) {
        NhanSu nhanSu1 = new NhanSu("A","nam",1997);
        NhanSu nhanSu2 = new NhanSu("B","nu",1999);
        NhanSu nhanSu3 = new NhanSu("C","nam",1998);
        NhanSu nhanSu4 = new NhanSu("D","nu",1997);
        NhanSu[] nhanSus = new NhanSu[]{nhanSu1,nhanSu2,nhanSu3,nhanSu4};



     Arrays.sort(nhanSus);
     Arrays.stream(nhanSus).forEach(System.out::println);




        Queue nu = new LinkedList<NhanSu>();
        Queue nam = new LinkedList<NhanSu>();
        for (int i = 0; i < nhanSus.length;i++){
            if (nhanSus[i].getGioiTinh() == "nu"){
                nu.offer((nhanSus[i]));
            }else if (nhanSus[i].getGioiTinh() =="nam"){
                nam.offer(nhanSus[i]);
            }
        }
        Queue<NhanSu> outPut = new LinkedList<>();
//        while (!nu.isEmpty()){
//            sapXepNhanSu
//        }
        outPut.addAll(nu);
        outPut.addAll(nam);
        System.out.println(outPut);

    }


}
