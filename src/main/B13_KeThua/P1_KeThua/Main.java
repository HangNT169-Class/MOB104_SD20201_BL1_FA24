/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B13_KeThua.P1_KeThua;

import java.util.Scanner;

/**
 *
 * @author hangnt169
 */
public class Main {
    public static void main(String[] args) {
//        Nhập thông tin của 1 sinh viên 
//          và in ra màn hình ( Sử dụng constructor không tham số)   
        // B1: Nhap 7 tt cua doi tuong SV 
        Scanner sc = new Scanner(System.in);

        System.out.println("Moi nhap thong tin");
        System.out.println("Nhap ten:");
        String ten = sc.nextLine();
        System.out.println("Nhap tuoi:");
        int tuoi = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap gioi tinh:");
        int gioiTinh = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap so dien thoai:");
        String sdt = sc.nextLine();
        System.out.println("Nhap que quan:");
        String queQuan = sc.nextLine();
        System.out.println("Nhap email:");
        String email = sc.nextLine();
        System.out.println("Moi nhap diem:");
        double diem = Double.valueOf(sc.nextLine());
        
        // B2: Khoi tao 1 doi tuong 
        SinhVien sv = new SinhVien();
        // B3: Gan lai gia tri cho doi tuong SV 
        // => setter 
        sv.setTen(ten);
        // B4: In 
        sv.display();
    }
}
