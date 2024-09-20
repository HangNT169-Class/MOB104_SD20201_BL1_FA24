/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main.B6_Mang.P1_OnTap;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class LuyenTap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("-Menu-");
            System.out.println("1:Thong tin ban ben canh");
            System.out.println("2:Tong cac so nguyen tu 0-n");
            System.out.println("3:Tich cac so le tu 1-n");
            System.out.println("4:Tich cac so chia het cho 5 tu 1-n");
            System.out.println("5:Tong cac so chan chia het cho 4 tu 1-n");
            System.out.println("0:Thoat");
            System.out.println("Chon chuc nang:");
            int menu = Integer.valueOf(sc.nextLine());
            switch (menu) {
                case 1:
                    System.out.println("111");
                    break;
                case 2:
                    System.out.println("222");
                    System.out.println("Nha n: ");
                    int n = Integer.valueOf(sc.nextLine());
                    int tong = 0;
                    for (int i = 0; i < n + 1; i++) {
                        tong += i;
                    }
                    System.out.println("Tong cac so nguyen tu 0 den n la" + tong);

                    break;
                case 3:
                    System.out.println("333");
                    System.out.println("Moi nhap so le ");
                    int a = Integer.valueOf(sc.nextLine());
                    int tich = 1;
                    for (int i = 1; i <= a; i++) {
                        tich *= i;
                    }
                    System.out.println("Tich la: " + tich);
                    break;
                case 4:
                    System.out.println("444");
                    break;
                case 5:
                    System.out.println("555");
                    break;
                case 0:
                    System.out.println("000");
                    System.exit(0); // DUNG DOT NGOT CHUONG TRINH
                default:
                    System.out.println("Chuc nang k ton tai");
                    break;
            }
        }

    }

}
