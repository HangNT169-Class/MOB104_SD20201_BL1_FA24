/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B10_OOP;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    /**
     * Tao class SinhVien gom cac thuoc tinh: maSV - String, ten - String, tuoi
     * - int, kyHoc - int, soDuTaiKhoanNganHang - int, matKhauFacebook - String
     * va cac contructor, getter, setter va ham inThongTin(): void
     *
     * Tao class Main : Nhap thong tin cua 1 sinh vien va in ra man hinh
     */
    public static void main(String[] args) {
        // B1: Nhap tt cua doi tuong SV (het cac tt)
        Scanner sc = new Scanner(System.in);

        System.out.println("moi nhap ma sinh vien");
        String maSV = sc.nextLine();
        System.out.println("moi nhap ten");
        String ten = sc.nextLine();
        System.out.println("moi nhap ky hoc");
        int kyHoc = Integer.valueOf(sc.nextLine());
        System.out.println("moi nhap so du tai khoan ngan hang");
        int soDu = Integer.valueOf(sc.nextLine());
        System.out.println("moi nhap mat khau facebook");
        String matKhau = sc.nextLine();
        System.out.println("moi nhap tuoi");
        int tuoi = Integer.valueOf(sc.nextLine());

        // B2:Khoi tao 1 doi tuong SV 
        // C1: contructor khong tham so => setter 
//        SinhVien sv = new SinhVien();
//        // in ra gia tri default cua kieu du lieu
//        // String => null 
//        // int => 0 
//        // float => 0.0
//        // setter
//        sv.setMaSV(maSV);
//        sv.setKyHoc(kyHoc);
//        sv.setMatKhauFacebook(matKhau);
//        sv.setTen(ten);
//        sv.setTuoi(tuoi);
//        sv.setSoDuTaiKhoanNganHang(soDu);
//        // B3: In tt 
//        sv.inThongTin();
        // C2: contructor full ts 
        SinhVien sv = new SinhVien(maSV, ten, tuoi, kyHoc, soDu, matKhau);
        sv.inThongTin();
    }
}
