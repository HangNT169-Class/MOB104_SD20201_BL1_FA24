/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B11_CRUDListFixCung;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class DienThoaiService {

    // Service => Tang xu ly toan bo logic project 
    // Trong main co bn chuc nang => Co it nhat bang day ham 
    // Co it nhat la 8 ham 
    private ArrayList<DienThoai> listDienThoai;

    public DienThoaiService(ArrayList<DienThoai> listDienThoai) {
        this.listDienThoai = listDienThoai;
        // fake data

    }

    public void nhapThongTin() {
        // B1: Nhap tt cua 1 doi tuong 
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ma :");
        int ma = Integer.valueOf(sc.nextLine());
        System.out.println("Moi nhap ten :");
        String ten = sc.nextLine();
        System.out.println("Moi nhap hang :");
        String hang = sc.nextLine();
        System.out.println("Moi nhap mau :");
        String mau = sc.nextLine();
        System.out.println("Moi nhap bo nho :");
        int boNho = Integer.valueOf(sc.nextLine());
        System.out.println("Moi nhap gia :");
        int gia = Integer.valueOf(sc.nextLine());
        // B2: Khoi tao 1 doi tuong 
        DienThoai dt = new DienThoai(ma, ten, hang, mau, boNho, gia);
        // B3: Add vao list
        listDienThoai.add(dt);
    }

    public void inDanhSachDienThoai() {
        for (DienThoai dt : listDienThoai) {
            dt.inThongTin();
        }
    }

    // String => compareTo
    public void sapXepGiamDanTheoTen() {
        // Compare
        // Lamda 
        listDienThoai.sort((o1, o2) -> {
            return o2.getTen().compareTo(o1.getTen());
        });
    }

    // TH la so => dung dau -
    public void sapXepTangDanTheoGia() {
        listDienThoai.sort((o1, o2) -> {
            return o1.getGia() - o2.getGia();
        });
    }

    public void xoaTheoViTri(int viTri) {
//        listDienThoai.remove(viTri);
        listDienThoai.remove(viTri);
    }

    public void xoaTheoMa(int maCanXoa) {
        // tim kiem tuan tu 
//        for (int i = 0; i < listDienThoai.size(); i++) {
//            // neu tim thay dien thoai trong ds co ma trung vs ma nhap vao
//            if(listDienThoai.get(i).getMa() == maCanXoa){
//                listDienThoai.remove(i);
//                return;
//            }
//        }
        // Java 8 -> lamda 
        listDienThoai.removeIf(s -> s.getMa() == maCanXoa);
    }
    // tim kiem theo ma nhap tu ban phim
    // search => filter cua lamda
    public ArrayList<DienThoai>searchByCode(int ma){
        ArrayList<DienThoai> listSearch = new ArrayList<>();
        // Code 
        for (DienThoai dienThoai : listDienThoai) {
            if(dienThoai.getMa() == ma){
                listSearch.add(dienThoai);
            }
        }
        return listSearch;
    }

}
