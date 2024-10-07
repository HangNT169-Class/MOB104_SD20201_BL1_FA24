/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B13_KeThua.P1_KeThua;

/**
 *
 * @author hangnt169
 */
public class Nguoi {

    private String ten;
    private int tuoi;
    private int gioiTinh;
    private String queQuan;
    private String soDienThoai;
    private String email;

    public Nguoi() {
    }

    public Nguoi(String ten, int tuoi, int gioiTinh, String queQuan, String soDienThoai, String email) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
        this.soDienThoai = soDienThoai;
        this.email = email;
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

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    private String test(){
        return "demo";
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public void display() {
        System.out.println("Ten: " + ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("Que quan: " + queQuan);
        System.out.println("SDT: " + soDienThoai);
        System.out.println("Email: " + email);
    }
}
