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
public class LyThuyet {
    /**
     * 1. if... else 
     * if(dieu kien){
     *      Code 
     * }else if(dieu kien){
     *      code 
     * }
     * CHU Y SO LUONG ELSE IF THI K GIOI HANN 
     * ELSE{
     * CAC TRUONG HOP CON LAI 
     * }
     * CHU Y:
     *     CHI CO 1 IF, 1 ELSE VA CO NHIEU ELSE IF 
     * BT:
     *  1. Kiem tra 1 so nhap tu ban phim la so nguyen duong hay nguyen am
     *  2. Nhap 2 so nguyen tu ban phim. Tinh tong, hieu, tich, thuong cua 2 so day
     *  3. Tinh binh phuong cua 1 so nguyen tu ban phim va cho biet binh phuong day la so chan hay le 
     *  4. Nhap vao diem toan ly, hoa cua sv. Tinh diem TB va cho biet SV thuoc loaij SV nao:
     *      diem >9 & <= 10 => xuat sac
     *      diem <8 & >= 9 => gioi
     *      diem >7 & <=8 => kha 
     *      diem >6 & <=7 => TB kha 
     *      diem >=5 & <=6 => TB  
     *      diem <5 => yeu 
     *  5. Nhap vao 2 so nguyen. Tinh P, S cua hcn
     *  6. Tim so lon nhat trong 3 songuyen nhap tu ban phim
     * 2. switch...case 
     * 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap so nguyen:");
        int number = sc.nextInt();
        if(number > 0){
            System.out.println("Day la so nguyen duong");
        }else if(number == 0 ){
            System.out.println("Day la so 0");
        }else{
            System.out.println("Day la so nguyen am");
        }
    }
}
