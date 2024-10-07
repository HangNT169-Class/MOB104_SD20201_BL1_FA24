/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B13_KeThua.P2_Chuoi;

/**
 *
 * @author hangnt169
 */
public class Main {
//    Bài 2: Nhâp 1 chuỗi từ bàn phím. 
//      - Kiểm tra xem chuỗi đó có chứa chữ "sa" không ? 
//      - Kiểm tra xem chuỗi đó có bắt đầu bằng "sa" không? 
//      - Kiểm tra xem chuỗi đó có kết thúc bằng "sa" không? 
//      - In ra độ dài của chuỗi vừa nhập từ bàn phím 
//      - Kiểm tra xem chuỗi đó có phải là  chuỗi "IT18315" không ? 

    public static void main(String[] args) {
        // nextLine => nhap chuoi
        String mess = "SD18401";
        //1. kiem tra do dai cua chuoi => length
        System.out.println(mess.length());
        // 2. ghep chuoi
        // C1: +
        String mess1 = " Java 5";
        String tong = mess + mess1;
        System.out.println("Chuoi sau khi merge:" + tong);
        // C2: concat 
        String tong1 = mess.concat(mess1);
        System.out.println("Tong1: " + tong1);
        // 3. So sanh chuoi:
        // 3.1. compareTo => int (so) : Bang ma acsii => Phan biet hoa thuong
        // TH1: >0 => chuoi 1 lon chuoi 2
        // TH2: <0 => chuoi 1 be chuoi 2
        // TH3: = 0 => chuoi 1 bang chuoi 2
//        System.out.println(mess.compareTo("sd18401"));
        // compareToIgnoreCase : Khong phan biet hoa thuong
        System.out.println(mess.compareToIgnoreCase("sd18401"));
        // 3.2 equals 
        // => boolean ( true/false)
        // => 2 chuoi co bang nhau hay khong 
//        System.out.println(mess.equals("sd18401"));
        System.out.println(mess.equalsIgnoreCase("sd18401"));
        // 4.contains : kiem tra chua <=> like% gia tri%
        System.out.println(mess.contains("da"));
        // 5: kiem tra bang dau bang: startWiths
        // 6: Ket thuc bang: endWids
        System.out.println(mess.startsWith("S"));
        //SD18401
        System.out.println(mess.endsWith("1"));
        // https://v1study.com/java-ham-xu-ly-chuoi-string-a577.html#google_vignette
    }
}
