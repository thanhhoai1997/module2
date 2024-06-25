package _14_io_textfile.tinhtong_trongfiletext;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public static   void readFileText(String filePath){
        FileReader rd = null;
        BufferedReader br = null;

        try {
            File file = new File(filePath);
            file.createNewFile();
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            String line = "";
            int sum = 0;
             rd = new FileReader(file);
             br = new BufferedReader(rd);
            while ((line = br.readLine()) != null ){
                sum += Integer.parseInt(line);
            }
            System.out.println("tong la : " + sum);



        }catch (Exception e){
            e.printStackTrace();

        }finally {
            if (br!= null){
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (rd != null){
                try {
                    rd.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String duongDan = sc.nextLine();
        readFileText(duongDan);

    }
}
