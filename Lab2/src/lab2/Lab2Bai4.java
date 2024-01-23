/**
 * 
 */
package lab2;

/**
 * 
 */
import java.util.Scanner;
public class Lab2Bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();

	}
	public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("+---------------------------------------------------+");
            System.out.println("1. Giải phương trình bậc nhất");
            System.out.println("2. Giải phương trình bậc hai");
            System.out.println("3. Tính tiền điện");
            System.out.println("4. Kết thúc");
            System.out.println("+---------------------------------------------------+");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    giaiPTB1();
                    break;
                case 2:
                    giaiPTB2();
                    break;
                case 3:
                    tinhTienDien();
                    break;
                case 4:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }

    public static void giaiPTB1() {
        // Chứa mã của bài 1
        System.out.println("Bạn đã chọn giải phương trình bậc nhất.");
        // Thêm mã giải phương trình bậc nhất tại đây
    }

    public static void giaiPTB2() {
        // Chứa mã của bài 2
        System.out.println("Bạn đã chọn giải phương trình bậc hai.");
        // Thêm mã giải phương trình bậc hai tại đây
    }

    public static void tinhTienDien() {
        // Chứa mã của bài 3
        System.out.println("Bạn đã chọn tính tiền điện.");
        // Thêm mã tính tiền điện tại đây
    }
	

}
