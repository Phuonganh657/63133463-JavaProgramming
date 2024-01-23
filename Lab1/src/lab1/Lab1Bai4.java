/**
 * 
 */
package lab1;

/**
 * 
 */
import java.util.Scanner;
public class Lab1Bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();

        // Tính delta
        double delta = Math.pow(b, 2) - 4 * a * c;

        // Kiểm tra nếu delta âm thì không có căn delta
        if (delta < 0) {
            System.out.println("Phương trình không có nghiệm thực.");
        } else {
            // Tính căn delta
            double canDelta = Math.sqrt(delta);
            System.out.printf("Căn delta: %.2f%n", canDelta);
        }
        scanner.close();

	}

}
