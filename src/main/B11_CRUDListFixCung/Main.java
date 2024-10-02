/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B11_CRUDListFixCung;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DienThoaiService service = new DienThoaiService(new ArrayList<>());
        int chon;
        while (true) {
            System.out.println("--------------------------");
            System.out.println("|1:chuc nang 1           |");
            System.out.println("|2:chuc nang 1           |");
            System.out.println("|3:chuc nang 1           |");
            System.out.println("|4:chuc nang 1           |");
            System.out.println("|5:chuc nang 1           |");
            System.out.println("|0:chuc nang 1           |");
            System.out.println("--------------------------");
            System.out.println("moi ban chon chuc nang");
            chon = Integer.valueOf(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("1");
                    service.nhapThongTin();
                    break;
                case 2:
                    System.out.println("1");
                    service.inDanhSachDienThoai();
                    break;
                case 3:
                    System.out.println("1");
                    break;
                case 4:
                    System.out.println("1");
                    service.sapXepGiamDanTheoTen();
                    System.out.println("Ds sau khi sap la:");
                    service.inDanhSachDienThoai();
                    break;
                case 5:
                    System.out.println("1");
                    break;
                case 0:
                    System.out.println("thoat");
                    System.exit(0);
                default:
                    System.out.println("Chuc nang khong ton tai");
                    break;
            }
        }
    }
}
