/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B10_OOP;

/**
 *
 * @author hangnt
 */
public class SinhVien {
    /**
     * OOP - Lap trinh huong doi tuong 
     * Doi tuong (Object):
     *  1. thuoc tinh (cac bien - attribute)
     *  2. Phuong thuc (cac ham - method)
     *  Tao class SinhVien gom cac thuoc tinh:
     *  maSV - String, ten - String, tuoi - int, kyHoc - int,
     *  soDuTaiKhoanNganHang - int, matKhauFacebook  - String
     *  va cac contructor, getter, setter va ham inThongTin(): void
     */
    /**
     * Tinh dong goi: 
     *   - Che giau nhung thu rieng tu => Show ra khi can thiet 
     * Pham vi truy cap (Access modifier): 4
     *      + public 
     *      + protected
     *      + default 
     *      + private 
     */
    private String maSV;
    private String ten;
    private int tuoi;
    private int kyHoc;
    private int soDuTaiKhoanNganHang;
    private String matKhauFacebook;

    // C1: Tao contructor(chuoi phai => insert code) - 2 contructor
//    public SinhVien() {
//    }
//
//    public SinhVien(String maSV, String ten, int tuoi, int kyHoc, int soDuTaiKhoanNganHang, String matKhauFacebook) {
//        this.maSV = maSV;
//        this.ten = ten;
//        this.tuoi = tuoi;
//        this.kyHoc = kyHoc;
//        this.soDuTaiKhoanNganHang = soDuTaiKhoanNganHang;
//        this.matKhauFacebook = matKhauFacebook;
//    }
    // C2: Ctrl space 
    /**
     * Contructor: Dung de khoi tao 1 doi tuong
     * Co 2 loai:
     *  1. Contructor khong tham so 
     *  2. Contructor co tham so
     * 
     * Dau hieu nhan biet:
     *  1. ten trung vs ten class 
     *  2. contructor khong co kieu du lieu tra ve (return)
     * 
     * Default cua 1 class la contructor khong tham so.
     * GS: Tao 1 contructor co tham so
     */
    public SinhVien() {
    }

////    public SinhVien(String maSV, String ten) {
////        this.maSV = maSV;
////        this.ten = ten;
////    }
//
    public SinhVien(String maSV, String ten, int tuoi, int kyHoc, int soDuTaiKhoanNganHang, String matKhauFacebook) {
        this.maSV = maSV;
        this.ten = ten;
        this.tuoi = tuoi;
        this.kyHoc = kyHoc;
        this.soDuTaiKhoanNganHang = soDuTaiKhoanNganHang;
        this.matKhauFacebook = matKhauFacebook;
    }

    // Getter: Lay ra thong tin thuoc tin cua doi tuong
    // Lay thong tin ma sv
    public String getMaSV() {
        return maSV;
    }

    // Setter: Thay doi thong tin thuoc tin cua doi tuong
    // Thay doi thong tin thuoc tinh MSSV cua doi tuong
    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getKyHoc() {
        return kyHoc;
    }

    public void setKyHoc(int kyHoc) {
        this.kyHoc = kyHoc;
    }

    public int getSoDuTaiKhoanNganHang() {
        return soDuTaiKhoanNganHang;
    }

    public void setSoDuTaiKhoanNganHang(int soDuTaiKhoanNganHang) {
        this.soDuTaiKhoanNganHang = soDuTaiKhoanNganHang;
    }

    public String getMatKhauFacebook() {
        return matKhauFacebook;
    }

    public void setMatKhauFacebook(String matKhauFacebook) {
        this.matKhauFacebook = matKhauFacebook;
    }

    public void inThongTin(){
        // in cac thong tin cua doi tuong 
        System.out.println("ma so sinh vien:"+maSV);
        System.out.println("ten cua ban la:"+ten);
        System.out.println("tuoi la:"+tuoi);
        System.out.println("ky hoc la:"+kyHoc);
        System.out.println("so du tai khoan la:"+soDuTaiKhoanNganHang);
        System.out.println("mat khau fb la:"+matKhauFacebook);
    }
    
   
}


