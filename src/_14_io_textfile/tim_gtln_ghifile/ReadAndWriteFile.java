package _14_io_textfile.tim_gtln_ghifile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWriteFile {
    public static List<Integer> readFile(String toPath){
        List<Integer> list = new ArrayList<>();
        FileReader fr = null;
        BufferedReader br = null;
        try {
            File file = new File(toPath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
             fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null){
                list.add(Integer.parseInt(line));
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
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
        return list;
        //D:\A0423I1_Nguyen_Thanh_Hoai\module2\src\_14_io_textfile
    }
    public static void writeFile(List<Integer> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten file muon ghi vao");
        String tenFile = sc.nextLine();
        FileWriter fw = null;
        BufferedWriter bw = null;
        Integer max = list.get(0);
        for (Integer number: list
             ) {
            if (number > max){
                max = number;
            }

        }
        try {
            fw = new FileWriter(tenFile,true);
            bw = new BufferedWriter(fw);
            String line = "max = " + max;
            bw.write(line);
            bw.newLine();


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
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten file muon doc ");
        String tenFile = sc.nextLine();
        readFile(tenFile);
        writeFile(readFile(tenFile));
    }
}
