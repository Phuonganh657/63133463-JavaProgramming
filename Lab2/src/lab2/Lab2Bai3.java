/**
 * 
 */
package lab2;

/**
 * 
 */
import java.util.Scanner;
public class Lab2Bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số điện sử dụng trong tháng: ");
        int soDien = scanner.nextInt();

        int giaDuoi50 = 1000;
        int giaTren50 = 1200;
        int hanMuc50 = 50;

        int tien;

        if (soDien <= hanMuc50) {
            tien = soDien * giaDuoi50;
        } else {
            tien = hanMuc50 * giaDuoi50 + (soDien - hanMuc50) * giaTren50;
        }

        System.out.printf("Số tiền điện phải thanh toán: %d VND%n", tien);
        scanner.close();

	}

}
