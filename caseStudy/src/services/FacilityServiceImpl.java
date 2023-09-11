package services;

import models.Facility;
import models.House;
import models.Room;
import models.Villa;
import utils.doc_ghi_file.DocGhiFile;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    Scanner sc = new Scanner(System.in);
    private int soLanSuDung = 0;



    LinkedHashMap<Facility, Integer> linkedHashMap;

    public FacilityServiceImpl() {
        linkedHashMap = new LinkedHashMap<>();
    }

    public FacilityServiceImpl(int soLanSuDung) {
        this.soLanSuDung = soLanSuDung;
    }

    public int getSoLanSuDung() {
        return soLanSuDung;
    }

    public void setSoLanSuDung(int soLanSuDung) {
        this.soLanSuDung = soLanSuDung +1;
    }

    public void addNewVilla() {
        Villa villa = new Villa();

        villa.input();
        System.out.println("nhap tieu chuan phong : ");
        villa.setTieuChuanPhong(sc.nextLine());
        while (true){
            try {
                System.out.println("nhap dien tich ho boi");
                villa.setDienTichHoBoi(Double.parseDouble(sc.nextLine()));
                System.out.println("nhap so tang : ");
                villa.setSoTang(Integer.parseInt(sc.nextLine()));
                break;
            }catch (NumberFormatException e){
                System.out.println("nhap sai moi ban nhap lai : ");
                System.out.println("------------------------");
            }
        }


        for (Map.Entry<Facility, Integer> entry : linkedHashMap.entrySet()) {
            if (entry.getKey().hashCode() == villa.hashCode()) {


             linkedHashMap.remove(entry.getKey());
             break;
//                linkedHashMap.replace(villa,soLanSuDung,soLanSuDung);

            }

        }
         linkedHashMap.put(villa, soLanSuDung);

    }

    public void addNewHouse() {
        House house = new House();
        house.input();
        System.out.println("nhap tieu chuan phong : ");
        house.setTieuChuanPhong(sc.nextLine());
        System.out.println("nhap so tang : ");
        house.setSoTang(Integer.parseInt(sc.nextLine()));
        for (Map.Entry<Facility,Integer> entry: linkedHashMap.entrySet()){
            if (entry.getKey().hashCode() == house.hashCode()){
                linkedHashMap.remove(entry.getKey());
                break;
            }
        }
        linkedHashMap.put(house, soLanSuDung);
    }

    public void addNewRoom() {
        Room room = new Room();
        room.input();
        System.out.println("nhap dich vu mien phi di kem : ");
        room.setDichVuMienPhiDiKem(sc.nextLine());
        for (Map.Entry<Facility,Integer> entry: linkedHashMap.entrySet()){
            if (entry.getKey().hashCode() == room.hashCode()){
                linkedHashMap.remove(entry.getKey());
            }
        }
        linkedHashMap.put(room, soLanSuDung);
    }

    public void hienThiDanhSachFacility() {
        for (Map.Entry<Facility, Integer> entry : linkedHashMap.entrySet()) {
            Facility key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : " + value);

        }
    }

    public void dsFacilityCanBaoTri() {
        for (Map.Entry<Facility, Integer> entry : linkedHashMap.entrySet()) {

            if (entry.getValue() >= 5) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }

        }
    }
    public void ghiDuLieu() {
        DocGhiFile docGhiFile = new DocGhiFile();
        System.out.println("nhap duong dan : ");
        String toPath = sc.nextLine();
        System.out.println("Nhap so nguyen bat ki neu ban muon appen :\n" +
                "Nhap chu bat ki neu ban  muon Override : ");
        boolean isAppen = sc.hasNextInt();
        docGhiFile.writeFile((List<?>) linkedHashMap, toPath, isAppen);

    }

    public void docDuLieu() {

    }

}