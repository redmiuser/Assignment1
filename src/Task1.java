
public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    printI();
	        printN();
	        printE();
	        printU();
	        printR();
	        printO();
	        printN();

		}
		
		public static void printI() {
	        for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 5; j++) {
	                if (i == 0 || i == 4 || j == 2) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	        System.out.println();
	    }

	    public static void printN() {
	        for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 5; j++) {
	                if (j == 0 || j == 4 || i == j) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	        System.out.println();
	    }

	    public static void printE() {
	        for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 5; j++) {
	                if (i == 0 || i == 2 || i == 4 || j == 0) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	        System.out.println();
	    }

	    public static void printU() {
	        for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 5; j++) {
	                if ((i < 4 && (j == 0 || j == 4)) || (i == 4 && 0 < j && j < 4)) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	        System.out.println();
	    }

	    public static void printR() {
	        for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 5; j++) {
	                if (i == 0 || i == 2 || j == 0 || (i == 1 && j == 4) || (i == 3 && j == 4) || (i == 4 && j == 3)) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	        System.out.println();
	    }

	    public static void printO() {
	        for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 5; j++) {
	                if (i == 0 || i == 4 || j == 0 || j == 4) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	        System.out.println();
	    }



	}
