package services;

import models.Facility;
import models.House;
import models.Room;
import models.Villa;
import utils.ConstantUtil;
import utils.doc_ghi_file.DocGhiFile;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    DocGhiFile docGhiFile = new DocGhiFile();
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
        while (true){

            System.out.println("nhap ma dich vu đúng định dạng: SVXX-YYYY, với YYYY là các số từ 0-9, XX là: VL ");
            String ma = sc.nextLine();
            if (ma.matches(ConstantUtil.REGEXVILLA)){
                villa.setMaDichVu(ma);
                break;
            }else {
                System.err.println("vui long nhap dung dinh dang : ");
            }

        }


        villa.input();

        System.out.println("nhap tieu chuan phong (Viet Hoa Chu Cai Dau Tien) : ");
        while (true){
            villa.setTieuChuanPhong(sc.nextLine());
            if (villa.getTieuChuanPhong().matches(ConstantUtil.REDEXTENDICHVU)){
                break;
            }else {
                System.err.println("Viet Hoa Chu Cai Dau Tien !!!");

            }
        }

        while (true){
            try {
                System.out.println("nhap dien tich ho boi > 30");
                while (true){
                    villa.setDienTichHoBoi(Double.parseDouble(sc.nextLine()));
                    if (villa.getDienTichHoBoi() > 30){
                        break;
                    }else {
                        System.err.println("dien tich ho boi phai lon hon  > 30");
                    }
                }

                System.out.println("nhap so tang : ");
                while (true){
                    villa.setSoTang(Integer.parseInt(sc.nextLine()));
                    if (villa.getSoTang() > 0){
                        break;
                    }else {
                        System.err.println("so tang phai > 0 ");
                    }
                }

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
        while (true) {

            System.out.println("nhap ma dich vu đúng định dạng: SVXX-YYYY, với YYYY là các số từ 0-9, XX là: HO ");
            String ma = sc.nextLine();
            if (ma.matches(ConstantUtil.REGEXHOUSE)) {
                house.setMaDichVu(ma);
                break;
            } else {
                System.err.println("vui long nhap dung dinh dang : ");
            }
        }
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
        while (true) {

            System.out.println("nhap ma dich vu đúng định dạng: SVXX-YYYY, với YYYY là các số từ 0-9, XX là: RO ");
            String ma = sc.nextLine();
            if (ma.matches(ConstantUtil.REGEXROOM)) {
                room.setMaDichVu(ma);
                break;
            } else {
                System.err.println("vui long nhap dung dinh dang : ");
            }
        }
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
            System.out.println(entry.getKey() + " : " + entry.getValue());

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