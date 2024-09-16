/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B3_4_ReNhanh.P2_ReNhanh.IfElse;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap diem toan la: ");
        int toan = sc.nextInt();
        System.out.println("nhap diem ly la:");
        int ly = sc.nextInt();
        System.out.println("nhap diem hoa la:");
        int hoa = sc.nextInt();
        double diemTB = (double) (toan + ly + hoa) / 3;
        if (diemTB > 9 && diemTB <= 10) {
            System.out.println("xuat sac");
        } else if (diemTB > 8 && diemTB <= 9) {
            System.out.println("gioi");
        } else if (diemTB > 7 && diemTB <= 8) {
            System.out.println("kha");
        } else if (diemTB > 6 && diemTB <= 7) {
            System.out.println("tb kha");
        } else if (diemTB >= 5 && diemTB <= 6) {
            System.out.println("tb");
        } else {
            System.out.println("yeu");
        }
    }

}
