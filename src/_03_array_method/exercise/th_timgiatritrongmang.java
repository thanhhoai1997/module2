package _03_array_method.exercise;

import java.util.Scanner;

public class th_timgiatritrongmang {
    public static void main(String[] args) {
        String[] student = {"Christian", "Michael", "Camila", "Sienna",
                "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        boolean trave = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ten sinh vien muon tim");
        String tenSV = scanner.nextLine();
        for (int i = 0; i < student.length; i++) {
            if (student[i].equals(tenSV)) {
                System.out.println("vi tri SV:  " + tenSV + " la " + (i + 1));
                trave = true;
                break;
            }


        }
        if (!trave) {
            System.out.println("khong tim thay Sv: " + tenSV + " trong mang");
        }
    }
}
