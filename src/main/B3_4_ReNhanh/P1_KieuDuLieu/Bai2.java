/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B3_4_ReNhanh.P1_KieuDuLieu;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Bai2 {

    /**
     * 1. Nhap ten,diaChi,nganhHoc cua ban than roi in ra man hinh 2. Nhap ten,
     * tuoi, diaChi, kyHoc, nganhHoc cua ban than roi in ra man hinh
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ten:");
        String ten = sc.nextLine();
        System.out.println("Moi nhap tuoi:");
//        String tuoiStr = sc.nextLine();
        // Tuoi (KDL dung) => INT . Dang CO String
        // => Can phai ep tu String ve int 
//        int tuoi = sc.nextInt();
        int tuoi = Integer.valueOf(sc.nextLine());
//        double a = Double.valueOf(sc.nextLine());
//        float b = Float.valueOf(sc.nextLine());
        // C => fflush.stdin
        // Java => scan.nextLine() => Lay gia tri cua phim enter 
//        sc.nextLine();
        // C2: COI TAT CA MOI THU NHAP VAO TU BAN PHIM LUON LUON LA CHUOI
        // SAU DO EP KIEU VE KIEU DU LIEU TUONG UNG 
        System.out.println("Moi nhap dia chi:");
        String diaChi = sc.nextLine();
        System.out.println("Moi nhap ky hoc:");
        int kyHoc = Integer.valueOf(sc.nextLine());
//        sc.nextLine();
        System.out.println("Moi nhap nganh hoc:");
        String nganHoc = sc.nextLine();
//        System.out.println("Ten: " + ten);
//        System.out.println("Tuoi: " + tuoi);
        System.out.println(" Ten : " + ten + "Tuoi la: " + tuoi
                + " DiaChi la : " 
                + diaChi + "Ky hoc la: " 
                + kyHoc + "Nganh hoc: " + nganHoc);
    }
}
