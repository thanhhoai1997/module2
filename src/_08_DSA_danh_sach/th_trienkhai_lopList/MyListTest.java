package _08_DSA_danh_sach.th_trienkhai_lopList;

public class MyListTest {

    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));


    }
}
