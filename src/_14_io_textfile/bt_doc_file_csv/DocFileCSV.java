package _14_io_textfile.bt_doc_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DocFileCSV {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<QuocGia> list = new ArrayList<>();
        list.add(new QuocGia("US","My"));
        list.add(new QuocGia("CN","China"));
        list.add(new QuocGia("AU","Australia"));
        list.add(new QuocGia("JP","JaPan"));
        System.out.println("nhap ten file muon ghi");
        String tenFile = sc.nextLine();
        writeFile(list,tenFile);
        System.out.println("nhap ten file muon doc");
        String tenFile1 = sc.nextLine();
         readFile(tenFile1);



    }
  public static void writeFile(List<QuocGia> list,String filePath){
        FileWriter fw = null;
      BufferedWriter bw = null;
      try {
          fw = new FileWriter(filePath);
          bw = new BufferedWriter(fw);
          String line = "";
          for (QuocGia qg: list
               ) {
              line = qg.getId() + "," + qg.getCode() +"," + qg.getName();
              bw.write(line);
              bw.newLine();

          }

      }catch (Exception e){
          e.printStackTrace();
      }finally {
          if (bw!= null){
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
  public static void readFile(String filePath){

        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(filePath);
            br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null){
               String [] arr = line.split(",");
                System.out.println(arr[0] + "," + arr[1] + "," + arr[2]);

            }

        }catch (Exception e){


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

  }
}
