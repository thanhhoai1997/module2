package _15_io_binaryfile.th_copy_file;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    private static void copyFileUsingJava7Files(File source,File dest){
        try {
            Files.copy(source.toPath(),dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    private static void copyFileUsingStream(File source, File dest){
        InputStream is =null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length ;
            while ((length = is.read(buffer)) > 0){
                os.write(buffer,0,length);

            }

        }catch (Exception e){

        }finally {
            try {
                is.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                os.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
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
        copyFileUsingJava7Files(source,dest);
    }
}
