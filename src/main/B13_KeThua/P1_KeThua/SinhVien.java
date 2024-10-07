/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B13_KeThua.P1_KeThua;

/**
 *
 * @author hangnt169
 */
public class SinhVien extends Nguoi {
//    Tạo class SinhVien kế thừa từ class Nguoi
    // nhưng thêm thuộc tính diem-double 
    // và các phương thức constructor, getter, setter
    // và display(): void
    // Java: 2 class Cha & Con 
    // Con se ke thua dc cac thuoc tinh va phuong thuc cua cha
    // Tuy nhien: CAC THUOC TINH & PHUONG THUC 
    // KHONG DUOC PHEP O PHAM VI TRUY CAP PRIVATE
    // Ke thua: extends
    // muon lay cac thuoc tinh & phuong cua thang cha: super
//    public void test1(){
//        super.getEmail();
//        super.ten = "";
//    }

    private double diem;
    // SV co bn thuoc tinh ? => 7 thuoc tinh 

    public SinhVien() {
    }
    // contrucotr full ts

    // 7 ts 
    public SinhVien(double diem, String ten,
            int tuoi, int gioiTinh,
            String queQuan, String soDienThoai, String email) {
        super(ten, tuoi, gioiTinh, queQuan, soDienThoai, email);
        this.diem = diem;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public void display() {
        // in toan bo tt cua doi tuong 
        // 7 tt
        // C1: In tt lan luot cac thuoc tinh 
//        System.out.println("Ten: " + super.getTen());
//        System.out.println("Tuoi: " + super.getTuoi());
//        System.out.println("Gioi tinh: " + super.getGioiTinh());
//        System.out.println("So dien thoai: " + super.getSoDienThoai());
//        System.out.println("Que quan: " + super.getQueQuan());
//        System.out.println("Email: " + super.getEmail());
        super.display();
        // in tt rieng
        System.out.println("Diem: " + diem);
    }

}
