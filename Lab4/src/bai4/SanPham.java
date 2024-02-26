package bai4;

import java.util.Scanner;

public class SanPham {
    // Khai báo các trường dữ liệu với đặc tả truy xuất private
    private String tenSp;
    private double donGia;
    private double giamGia;

    // Constructor thứ nhất: 3 tham số là tên, giá và giảm giá
    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    // Constructor thứ hai: 2 tham số là tên và giá
    public SanPham(String tenSp, double donGia) {
        this(tenSp, donGia, 0); // Gọi constructor thứ nhất và đặt giảm giá mặc định là 0
    }

    // Phương thức tính thuế nhập khẩu (private)
    private double getThueNhapKhau() {
        return 0.1 * donGia;
    }

    // Phương thức xuất thông tin ra màn hình (public)
    public void xuat() {
        System.out.println("Tên sản phẩm: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
    }

    // Phương thức nhập thông tin từ bàn phím (public)
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        this.tenSp = scanner.nextLine();
        System.out.print("Nhập đơn giá: ");
        this.donGia = scanner.nextDouble();
        System.out.print("Nhập giảm giá: ");
        this.giamGia = scanner.nextDouble();
    }

    // Getter và setter cho các trường dữ liệu
    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public static void main(String[] args) {
        // Tạo sản phẩm có giảm giá
        SanPham sp1 = new SanPham("Sản phẩm 1", 100, 10);

        // Tạo sản phẩm không có giảm giá
        SanPham sp2 = new SanPham("Sản phẩm 2", 200);

        // Xuất thông tin của 2 sản phẩm
        System.out.println("Thông tin sản phẩm có giảm giá:");
        sp1.xuat();

        System.out.println("\nThông tin sản phẩm không có giảm giá:");
        sp2.xuat();
    }
}

