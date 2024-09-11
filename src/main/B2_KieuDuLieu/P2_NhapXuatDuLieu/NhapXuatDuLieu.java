/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B2_KieuDuLieu.P2_NhapXuatDuLieu;

import java.util.Scanner;
// Khai bao thu vien 
// C => #include
// java: import 

/**
 *
 * @author hangnt
 */
public class NhapXuatDuLieu {

    public static void main(String[] args) {
        // Trong C : scanf => Nhap du lieu tu ban phim 
        // Trong Java: Scanner 
        // Cu phap khai bao 
        Scanner scan = new Scanner(System.in);
        System.out.println("Moi nhap ten:");
        // Nhap chuoi => nextLine, next
        String ten = scan.nextLine();
//          String ten = scan.next();
        // next & nextLine => Deu doc duoc choi
        // next => den khoang cach => chet k doc duoc
        // nextLine => doc duoc tat ca 
        // In ra man hinh 
        // Nhap so
        int number = scan.nextInt();
        float number1 = scan.nextFloat();
//        nextDouble()
        System.out.println("Ten la "+ten);
        // B1: Nhap ten, diaChi, khuVucSong cua ban than va in ra man hinh
        // B2: Nhap diem toan, ly, hoa cua ban than va in ra man hinh
        
    }
}
