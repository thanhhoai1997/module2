package docghifile;

import models.Employee;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class DocGhiEmployee {
    public static final String COMMA = ",";
    public void writeFile(String toPath, List<Employee> list,boolean isAppen){
        try(
                FileWriter fw = new FileWriter(toPath,isAppen);
                BufferedWriter bw = new BufferedWriter(fw);
                ) {
            String line = "";
            for (Employee e: list
                 ) {
                line = e.getHoTen() + COMMA + e.getMa() + COMMA + e.getCmnd() + COMMA+
                        e.getSdt() + COMMA + e.getEmail() + COMMA + e.getGioiTinh() +COMMA+ e.getNgaySinh()+
                        e.getViTri() + COMMA + e.getTrinhDo() + COMMA + e.getLuong();
                bw.write(line);
                bw.newLine();

            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public  List<Employee> readFile(String toPath){
        List<Employee> list = new ArrayList<>();
        try(
                FileReader fr = new FileReader(toPath);
                BufferedReader br = new BufferedReader(fr);
                ) {


            String line ="";
            String arr[] ;
            while ((line = br.readLine()) != null){
                Employee employee = new Employee();
                arr = line.split(COMMA);
                employee.setHoTen(arr[0]);
                employee.setMa(arr[1]);
                employee.setCmnd(arr[2]);
                employee.setSdt(arr[3]);
                employee.setEmail(arr[4]);
                employee.setGioiTinh(arr[5]);
                employee.setNgaySinh(arr[6]);
                employee.setViTri(arr[7]);
                employee.setTrinhDo(arr[8]);
                employee.setLuong(Integer.parseInt(arr[9]));
                list.add(employee);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
       return list;
    }
}
