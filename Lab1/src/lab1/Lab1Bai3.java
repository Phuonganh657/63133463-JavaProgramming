/**
 * 
 */
package lab1;

/**
 * 
 */
import java.util.Scanner;
public class Lab1Bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập cạnh của khối lập phương: ");
        double canh = scanner.nextDouble();

        // Cách 1: Sử dụng công thức thể tích lập phương = canh * canh * canh
        double theTich1 = canh * canh * canh;

        // Cách 2: Sử dụng hàm Math.pow để tính lũy thừa
        double theTich2 = Math.pow(canh, 3);

        System.out.printf("Thể tích của khối lập phương (cách 1): %.2f%n", theTich1);
        System.out.printf("Thể tích của khối lập phương (cách 2): %.2f%n", theTich2);

        scanner.close();

	}

}
