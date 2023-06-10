
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 14;
        int columns = 25;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                if (i == 1 || i == rows || j == 1 || j == columns) {
                    System.out.print("*");
                } else if (i >= 2 && i <= 5 && j >= 7 && j <= 19) {
                    System.out.print(" ");
                } else if (i >= 6 && i <= 12 && j >= 8 && j <= 18) {
                    System.out.print(" ");
                } else if (i == 13 && j >= 9 && j <= 17) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
   }

}



