
public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int rows = 8;

	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            for (int k = 1; k <= 2 * (rows - i); k++) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	}

}
