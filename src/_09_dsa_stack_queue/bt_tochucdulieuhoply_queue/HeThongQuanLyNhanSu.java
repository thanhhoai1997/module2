package _09_dsa_stack_queue.bt_tochucdulieuhoply_queue;

import java.util.LinkedList;
import java.util.Queue;

public class HeThongQuanLyNhanSu  {
    ThongTin thongTin;
    HeThongQuanLyNhanSu ht ;

    public HeThongQuanLyNhanSu(ThongTin thongTin) {
        this.thongTin = thongTin;

    }
    public void themNhanSu(ThongTin thongTin){
        ht = new HeThongQuanLyNhanSu(thongTin);
    }

    @Override
    public String toString() {
        return "HeThongQuanLyNhanSu{" +
                "thongTin=" + thongTin +
                ", ht=" + ht +
                '}';
    }
}
