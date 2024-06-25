package utils.doc_ghi_file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Set;
import java.util.TreeSet;

public class DocGhiFileSet {
    public void writteFile(Set<?> set,String toPath,boolean isAppen){
        try(
                FileWriter fw = new FileWriter(toPath,isAppen);
                BufferedWriter bw = new BufferedWriter(fw);
                ) {
            String line = "";
            for (Object obj: set
                 ) {
                bw.write(obj.toString());
                bw.newLine();
            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public Set<String> readFile(String toPath){
        Set<String> set = new TreeSet<>();
        try (
                FileReader fr = new FileReader(toPath);
                BufferedReader br  = new BufferedReader(fr)
                ){

            String line = "";
            while ((line = br.readLine()) != null)  {
                set.add(line);

            }


        }catch (Exception e){
            e.printStackTrace();
        }
        return set;
    }
}
