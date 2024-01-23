/**
 * 
 */
package lab3;

/**
 * 
 */
import java.util.Scanner;
public class Lab3Bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên dương: ");
        int number = scanner.nextInt();

        // Kiểm tra số nguyên tố
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " là số nguyên tố.");
        } else {
            System.out.println(number + " không là số nguyên tố.");
        }

        scanner.close();

	}

}
