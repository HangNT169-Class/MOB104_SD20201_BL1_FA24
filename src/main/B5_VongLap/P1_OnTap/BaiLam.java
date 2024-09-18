/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B5_VongLap.P1_OnTap;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class BaiLam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi chonj chuc nang");
        int chucNang = Integer.valueOf(sc.nextLine());
        switch (chucNang) {
            case 1:
                System.out.println("moi nhap ma lop:");
                String maLop = sc.nextLine();

                System.out.println("Nhap ten lop:");
                String tenLop = sc.nextLine();

                System.out.println("Nhap mon hoc:");
                String monHoc = sc.nextLine();

                System.out.println("Nhap dien tich:");
                float dienTich = Float.valueOf(sc.nextLine());

                System.out.println("nhap toa hoc:");
                String toaHoc = sc.nextLine();

                System.out.println("nhap ki hoc:");
                int kiHoc = Integer.valueOf(sc.nextLine());

                System.out.println("nhap nganh :");
                String nganh = sc.nextLine();

                System.out.println("ma lop la:" + maLop);
                System.out.println("ten lop la:" + tenLop);
                System.out.println("mon hoc la:" + monHoc);
                System.out.println("dien tich la:" + dienTich);
                System.out.println("toa hoc la:" + toaHoc);
                System.out.println("ky hoc la:" + kiHoc);
                System.out.println("nganh la:" + nganh);
                break;
            case 2:
                System.out.println("day la cn 2");
                // Nhap vao 2 nguyen tinh tong,hieu, tich, thuong cua 2 so day

                break;
            case 3:
                System.out.println("day la cn 3");
                // Kiểm tra học lực
                System.out.println("Moi nhap diem toan");
                int diemToan = Integer.valueOf(sc.nextLine());
                System.out.println("Moi nhap diem li");
                int diemLy = Integer.valueOf(sc.nextLine());
                System.out.println("Moi nhap diem hoa");
                int diemHoa = Integer.valueOf(sc.nextLine());
                float diemTrungBinh = (float) (diemToan + diemLy + diemHoa) / 3;
                if (diemTrungBinh >= 0 && diemTrungBinh < 5){
                    System.out.println("hoc luc yeu");
                } else if (diemTrungBinh >= 5 && diemTrungBinh < 7) {
                    System.out.println("hoc luc trung binh");
                } else if (diemTrungBinh >= 7 && diemTrungBinh < 8) {
                    System.out.println("hoc luc kha");
                } else if (diemTrungBinh >= 8 && diemTrungBinh < 9) {
                    System.out.println("hoc luc gioi");
                } else {
                    System.out.println("hoc luc xuat sac");
                }

                break;
            case 4:
                System.out.println("day la cn 4");
                break;
            case 5:
                System.out.println("day la cn 5");
                break;
            case 6:
                System.out.println("out");
                break;
            default:
                System.out.println("chuc nang khong ton tai");
                break;
        }

    }
}
