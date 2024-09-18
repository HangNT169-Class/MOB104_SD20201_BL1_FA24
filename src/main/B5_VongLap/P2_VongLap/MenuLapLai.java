/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B5_VongLap.P2_VongLap;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class MenuLapLai {

    /**
     * Tao 1 menu lap lai toi khi chon chuc nang thoat. 1. Nhap thong tin ca
     * nhan : ten, tuoi, dia chi 2. Tinh tong cac so nguyen tu 1 - n. n la so
     * nguyen nhap tu ban phim. 3. Thoat
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            // Tao menu 
            System.out.println("chuc nang 1");
            System.out.println("chuc nang 2");
            System.out.println("chuc nang 3");
            System.out.println("Moi nhap chuc nang:");
            int menu = Integer.valueOf(sc.nextLine());
            switch (menu) {
                case 1:
                    System.out.println("Chuc nang 1");
                    break;
                case 2:
                    System.out.println("Chuc nang 1");
                    break;
                case 3:
                    System.out.println("Chuc nang 3");
                    System.exit(0); // THOAT NGAY LAP TUC CHUONG TRINH
                default:
                    System.out.println("Chuc nang khong ton tai");
                    break;
            }
        }
    }
}
