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
public class Bai2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap so thu nhat");
        int number1 = sc.nextInt();
        System.out.println("moi nhap so thu hai");
        int number2 = sc.nextInt();
        int tong = number1 + number2;
        int hieu = number1 - number2;
        int tich = number1 * number2;
        double thuong = (double)number1 / number2;
        
        System.out.println("tong cua hai so la " + tong);
        System.out.println("hieu cua hai so la " + hieu);
        System.out.println("tich cua hai so la" + tich);
        System.out.println("thuong cua hai so la" + thuong);
    }
//    Nhap 2 so nguyen tu ban phim. Tinh tong, hieu, tich, thuong cua 2 so day
    //Scanne sc = new Scanner(System.in);
    
}
