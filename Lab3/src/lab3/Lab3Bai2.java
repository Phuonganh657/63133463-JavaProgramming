/**
 * 
 */
package lab3;

/**
 * 
 */
public class Lab3Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 9; i++) {
            System.out.printf("Bảng cửu chương %d:%n", i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d%n", i, j, i * j);
            }
            System.out.println();
        }

	}

}
