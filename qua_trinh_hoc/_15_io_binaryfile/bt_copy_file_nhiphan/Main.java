package _15_io_binaryfile.bt_copy_file_nhiphan;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Main {
    public static void copyFile(File source,File target){
        if (!source.exists()){
            System.out.println("file k ton tai");
        }
        if (target.exists()){
            System.out.println("file da ton tai");
        }
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(target)
        ){
            byte[] bytes = new byte[1024];
            int data ;
            while ((data = fis.read(bytes)) > 0){
                fos.write(bytes,0,data);
            }

        }catch (Exception e){
            System.out.println("loi file");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter sourceFile");
        String s = sc.nextLine();
        System.out.println("Enter destination file:");
        String d = sc.nextLine();
        File source = new File(s);
        File dest  = new File(d);
        copyFile(source,dest);

    }

}
