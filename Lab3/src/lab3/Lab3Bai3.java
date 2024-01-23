/**
 * 
 */
package lab3;

/**
 * 
 */
import java.util.Arrays;
import java.util.Scanner;
public class Lab3Bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Nhập mảng từ bàn phím
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập phần tử thứ %d: ", i + 1);
            arr[i] = scanner.nextInt();
        }

        // Sắp xếp và xuất mảng
        Arrays.sort(arr);
        System.out.println("Mảng sau khi sắp xếp:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Xuất phần tử nhỏ nhất
        int minValue = arr[0];
        for (int i = 1; i < n; i++) {
            minValue = Math.min(minValue, arr[i]);
        }
        System.out.println("Phần tử nhỏ nhất trong mảng: " + minValue);

        // Tính và xuất trung bình cộng các phần tử chia hết cho 3
        int sum = 0;
        int count = 0;
        for (int i : arr) {
            if (i % 3 == 0) {
                sum += i;
                count++;
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.printf("Trung bình cộng các phần tử chia hết cho 3: %.2f%n", average);
        } else {
            System.out.println("Không có phần tử nào chia hết cho 3.");
        }
        scanner.close();

	}

}
