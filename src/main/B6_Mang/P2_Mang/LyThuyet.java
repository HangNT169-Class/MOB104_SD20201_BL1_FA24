/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B6_Mang.P2_Mang;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class LyThuyet {
    /**
     * Mang: La tap hop cua cac gia tri cung kieu du lieu 
     * VD: N - tap hop so nguyen , R - so thuc 
     * VD:
     *  -1 9 5 4 10 0 => Mang so nguyen 
     *  -1 7.5 10 2 1  => K phai mang
     *  => size : So luong phan tu trong mang
     *  => Mang: arr
     *  -1 9 5 4 10 0 => gia tri cua mang 
     *  0  1 2 3 4 5  => vi tri cua mang
     * Luu y: 
     *  + Vi tri dau tien trong mang 0 => arr[0] : gia tri cua vi tri dau tien 
     *  + Vi tri cuoi cung: size -1 => arr[size-1] : gia tri cua vi tri cuoi cung
     *  + Vi tri i bat ky => Gia tri cua vt i: arr[i]
     */
    /*
     * 1. Nhap 1 mang so nguyen gom n phan tu. In cac gia tri ra man hinh
     * 2. Nhap 1 mang so nguyen gom n phan tu. Tinh tich cac phan tu.
     * 3. Nhap 1 mang so nguyen gom n phan tu. Tinh tong cac phan tu o vi tri chan
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap size cua mang:");
        int size = Integer.valueOf(sc.nextLine());
        // Khai bao mang
        // Cu phap:
        int arr[] = new int[size];
        System.out.println("Moi nhap cac phan tu trong mang:");
        // Nhap cac phan tu vao mang
        for (int i = 0; i < size; i++) {
            // nhap
            arr[i]=Integer.valueOf(sc.nextLine());
        }
        // In tt cua mang
        System.out.println("Cac phan tu trong mang la:");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
    
}
