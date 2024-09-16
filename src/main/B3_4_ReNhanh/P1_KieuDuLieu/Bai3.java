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
public class Bai3 {
    /**
     * Nhap ten truong, so nam hinh thanh, dia chi, so luong chuyen nganh, nganh ban hoc
     * tai ngoi truong ban dang theo hoc
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap ten truong: ");
        String truong = sc.nextLine();
        
        System.out.println("So nam hinh thanh: ");
        int soNam= sc.nextInt();
        sc.nextLine();
        
        System.out.println("Nhap dia chi: ");
        String diaChi = sc.nextLine();
        
        System.out.println("Nhap so luong chuyen nganh: ");
        int soLuongChuyenNganh = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Nhap nganh ban hoc: ");
        String nganhBanHoc = sc.nextLine();
        
        System.out.println("Ten truong"+ truong);
        System.out.println("So nam hinh thanh"+soNam);
        System.out.println("Dia chi"+diaChi);
        System.out.println("So luong chuyen nganh"+soLuongChuyenNganh);
        System.out.println("Nganh ban hoc"+nganhBanHoc);
        
    }
}
