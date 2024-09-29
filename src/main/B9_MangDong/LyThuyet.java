/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B9_MangDong;

import java.util.ArrayList;

/**
 *
 * @author hangnt
 */
public class LyThuyet {
    /**
     * Co 2 loai mang:
     *  1. Mang co dinh: Phai biet truoc size 
     *       arr[100]
     *     => size: 5 
     *     =>  95 => lang phi bo nho ( thua nhieu tai nguyen => dung qua i)
     *     => size: 200
     *     => - 100 => k du bo nho de chua cac phan tu 
     *  2. Mang dong : Khong can phan biet truoc size 
     *      => Chi can khai bao so phan tu 
     *      => Collection: ArrayList, List, Queue, Map, Tree..
     *      => J1: ArrayList
     *      C: cung co mang dong: calloc, realloc, malloc..
     */
    public static void main(String[] args) {
        //mang: []
        //mang dong: <>
        // ctrl space 1 lan k ra => bam lan thu 2
        // Cu phap
        //ArrayList<Kieu du lieu>ten mang = new ArrayList<>();
        // Khai bao: 1 mang String 
        ArrayList<String>list1 = new ArrayList<>();
        System.out.println("Size ban dau: "+list1.size());
        // Them phan tu => add 
        list1.add("SD20201");
        list1.add("SD20202");
        list1.add("SD20203");
        System.out.println("Size 1:"+list1.size());
        list1.add("SD20204");
        list1.add("SD20205");
        System.out.println("Size 2:"+list1.size());
        // xoa => remove
        // Co 2 cach remove 
        // C1: truy truc tiep 1 doi tuong
        list1.remove("SD20201"); // remove ( doi tuong)
        System.out.println("Size 3:"+list1.size());
        // C2: Xoa theo vi tri
        // Vi tri: 0 
        list1.remove(0);
        System.out.println("Size 4:"+list1.size());
        // Gia tri
        // Mang thuong
            // vi tri 0 => gia tri o vi tri 0: arr[0]
            // vi tri i => gia tri o vi tri i : arr[i]
        // Mang dong => Lay thong qua ham get
            // vi tri 0 => gia tri: list.get(0)
            // vi tri i => list.get(i)
        // gia tri vi tri: list.get(vi tri) : Lay ra gia tri cua vi tri bat ky
        // in cac gia tri trong mang
        // C1: for i 
        System.out.println("Cach 1 - in mang");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        // C2: for each
        System.out.println("Cach 2 - in mang");
        for (String str : list1) {
            System.out.println(str);
        }

    }
}
