/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B3_4_ReNhanh.P2_ReNhanh.Menu;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    /**
     * Cu phap: bien trong switch : co the dinh dang String/so switch(ten bien){
     * case gia tri:{ // code break; } Co nhieu case default:{ // Giong else (
     * Cac TH con lai) } }
     */
    public static void main(String[] args) {
//        int number = 0 ;
//        switch(number){
//            case 1:{
//                
//            }
//        }
        // Tao 1 menu gom cac chuc nang sau:
        // 1. Nhap ten, tuoi, dia chi cua ban than va in ra man hinh
        // 2. Nhap vao 2 so nguyen duong. Tinh tong
        // 3. Thoat 
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap chuc nang:");
        int chucNang = Integer.valueOf(sc.nextLine());
        switch (chucNang) {
            case 1: {
                System.out.println("Moi ban nhap ten:");
                String ten = sc.nextLine();
                System.out.println("Moi ban nhap tuoi"); 
                int tuoi = Integer.valueOf(sc.nextLine());
                System.out.println("Moi ban nhap dia chi");
                String diachi = sc.nextLine();
                System.out.println("ten:"+ten);
                System.out.println("tuoi"+tuoi);
                System.out.println("diachi"+diachi);
                break;
               
            }
            case 2: {

                break;
            }
            case 3: {
                System.out.println("Thoat");
                break;
            }
            default: {
                System.out.println("Chuc nang k ton tai");
                break;
            }
//            case 1->{
//                // lamda (->) => Khong can ghi break
//            }

        }
    }
}
