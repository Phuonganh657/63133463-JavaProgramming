/**
 * 
 */
package lab1;

/**
 * 
 */
import java.util.Scanner;

public class Lab1Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều dài hình chữ nhật: ");
        double dai = scanner.nextDouble();

        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        double rong = scanner.nextDouble();

        double chuVi = (dai + rong) * 2;
        double dienTich = dai * rong;
        double canhNhoNhat = Math.min(dai, rong);

        System.out.printf("Chu vi: %.2f%n", chuVi);
        System.out.printf("Diện tích: %.2f%n", dienTich);
        System.out.printf("Cạnh nhỏ nhất: %.2f%n", canhNhoNhat);

        
        scanner.close();

	}

}
