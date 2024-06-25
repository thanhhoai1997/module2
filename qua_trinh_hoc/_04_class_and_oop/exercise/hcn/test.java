package _04_class_and_oop.exercise.hcn;

public class test {
    public static void main(String[] args) {
        hinhChuNhat hcn = new hinhChuNhat(4,2);
        System.out.println("dien tich =" + hcn.getArea());
        System.out.println("chu vi =" + hcn.getPerimeter());
        System.out.println("hinh chu nhat: " +hcn.display());
    }
}
