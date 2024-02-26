package bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng scanner để nhập từ bàn phím
        Scanner scanner = new Scanner(System.in);
        
        // Tạo 2 đối tượng sản phẩm
        SanPham sp1 = new SanPham("", 0, 0);
        SanPham sp2 = new SanPham("", 0, 0);

        // Nhập thông tin cho sản phẩm 1
        System.out.println("Nhập thông tin cho sản phẩm 1:");
        sp1.nhap();

        // Nhập thông tin cho sản phẩm 2
        System.out.println("Nhập thông tin cho sản phẩm 2:");
        sp2.nhap();

        // Xuất thông tin của sản phẩm 1 và sản phẩm 2
        System.out.println("\nThông tin sản phẩm 1:");
        sp1.xuat();
        System.out.println("\nThông tin sản phẩm 2:");
        sp2.xuat();

        // Đóng đối tượng scanner
        scanner.close();
    }
}

