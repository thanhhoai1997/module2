package _14_io_textfile.bt_copyfile;

import java.io.*;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File sourceFile = new File("su_dung_file\\data.txt");
        if (!sourceFile.exists()){
            System.out.println("file k ton tai");
        }
        System.out.println("nhap ten file");
        File targetFile = new File(sc.nextLine());
        if (targetFile.exists()){
            System.out.println("file da ton tai k the copy");
            System.exit(0);
        }else {
            try {
                targetFile.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fr = new FileReader(sourceFile);
            br = new BufferedReader(fr);
            fw = new FileWriter(targetFile);
            bw = new BufferedWriter(fw);
            char ch;
            while ((ch = (char) br.read()) != 1 && ch != 65535){
                bw.write((char) ch);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (bw != null){
                try {
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
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
