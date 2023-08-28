package _14_io_textfile.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyFileText {

    public static List<Character> readFile() {
        List<Character> list = new ArrayList<>();
        File file = new File("D:\\A0423I1_Nguyen_Thanh_Hoai\\module2\\src\\_14_io_textfile\\copy_file_text\\data.txt");
        if (!file.exists()) {
            System.out.println("tap tin k ton tai");
        }
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line = "";
            char c = 0;

            while ((c = (char) br.read()) > 0 && c != 65535) {
                System.out.println(c);
                list.add(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return list;
    }

    public static void writeFile(List<Character> list)  {

        File file = new File("D:\\A0423I1_Nguyen_Thanh_Hoai\\module2\\src\\_14_io_textfile\\copy_file_text\\data1.txt");
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        if (!file.exists()) {
//            try {
//                file.createNewFile();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        } else {
//            System.out.println("file da ton tai");
//
//        }
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            for (Character c : list
            ) {
                if (c > 0) {
                    bw.write((char) c);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Character> list = readFile();
        System.out.println("enter target file");
        String s1 = sc.nextLine();
        writeFile(list);

    }
}
