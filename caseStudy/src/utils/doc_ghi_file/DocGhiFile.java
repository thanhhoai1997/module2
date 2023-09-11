package utils.doc_ghi_file;

import models.Employee;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class DocGhiFile {
//    private T obj;
//
//    public DocGhiFile(Class<T> tClass) throws InstantiationException, IllegalAccessException {
//        this.obj = (T) tClass.newInstance();
//    }
//
//    public T getObj() {
//        return obj;
//    }
//
//    public void setObj(T obj) {
//        this.obj = obj;
//    }

    public  void writeFile(List<?> ts, String path, boolean isAppend){


        try(
                FileWriter fw = new FileWriter(path,isAppend);
                BufferedWriter bw = new BufferedWriter(fw)
                ) {
            String line ="";
            for (Object t: ts) {
                bw.write(t.toString());
                bw.newLine();
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public  List<String> readFile(String path){
        List<String> stringList = new ArrayList<>();
        try (
                FileReader fr = new FileReader(path);
                BufferedReader br = new BufferedReader(fr);
                ){
        String line ="";


        while ((line = br.readLine()) != null){
                br.readLine();

            }


        }catch (Exception e){
            e.printStackTrace();
        }
        return stringList;
    }
}
