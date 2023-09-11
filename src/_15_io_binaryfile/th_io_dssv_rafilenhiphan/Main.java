package _15_io_binaryfile.th_io_dssv_rafilenhiphan;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToFile(String filePath, List<Student> list){

        try(FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(list);


        }catch (Exception e){
            e.printStackTrace();
        }


    }
    public static List<Student> readTopFile(String filePath){
        List<Student> list = new ArrayList<>();
        try(
                FileInputStream fis = new FileInputStream(filePath);
                ObjectInputStream ois = new ObjectInputStream(fis)
                ) {
            list = (List<Student>) ois.readObject();

        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student s1 = new Student(1,"A","DN");
        Student s2 = new Student(2,"B","HN");
        Student s3 = new Student(3,"C","QN");
        Student s4 = new Student(4,"D","TH");
        Student s5 = new Student(5,"E","DN");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        writeToFile("src/_15_io_binaryfile/th_io_dssv_rafilenhiphan/student.txt",list);
        List<Student> list1 = readTopFile("src/_15_io_binaryfile/th_io_dssv_rafilenhiphan/student.txt");
        list1.forEach(student -> System.out.println(student));


    }
}
