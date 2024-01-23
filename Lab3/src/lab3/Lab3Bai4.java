/**
 * 
 */
package lab3;

/**
 * 
 */
import java.util.Scanner;
public class Lab3Bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();

        String[] hoTen = new String[n];
        double[] diem = new double[n];

        // Nhập mảng họ tên và điểm
        for (int i = 0; i < n; i++) {
            scanner.nextLine(); // Đọc bỏ kí tự '\n' còn lại từ nextInt()
            System.out.printf("Nhập họ tên sinh viên thứ %d: ", i + 1);
            hoTen[i] = scanner.nextLine();
            System.out.printf("Nhập điểm sinh viên thứ %d: ", i + 1);
            diem[i] = scanner.nextDouble();
        }

        // Xuất mảng với học lực
        System.out.println("Danh sách sinh viên:");
        for (int i = 0; i < n; i++) {
            String hocLuc = xetHocLuc(diem[i]);
            System.out.printf("Họ tên: %s - Điểm: %.2f - Học lực: %s%n", hoTen[i], diem[i], hocLuc);
        }

        // Sắp xếp danh sách sinh viên theo điểm tăng dần
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (diem[i] > diem[j]) {
                    // Swap
                    double tempDiem = diem[i];
                    diem[i] = diem[j];
                    diem[j] = tempDiem;

                    String tempHoTen = hoTen[i];
                    hoTen[i] = hoTen[j];
                    hoTen[j] = tempHoTen;
                }
            }
        }

        // Xuất mảng sau khi sắp xếp
        System.out.println("Danh sách sinh viên sau khi sắp xếp:");
        for (int i = 0; i < n; i++) {
            String hocLuc = xetHocLuc(diem[i]);
            System.out.printf("Họ tên: %s - Điểm: %.2f - Học lực: %s%n", hoTen[i], diem[i], hocLuc);
        }
        scanner.close();
    }

    // Phương thức xét học lực dựa trên điểm
    public static String xetHocLuc(double diem) {
        if (diem < 5) {
            return "Yếu";
        } else if (diem < 6.5) {
            return "Trung bình";
        } else if (diem < 7.5) {
            return "Khá";
        } else if (diem < 9) {
            return "Giỏi";
        } else {
            return "Xuất sắc";
        }
    }
}
