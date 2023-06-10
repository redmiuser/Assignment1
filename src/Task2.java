
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 14;
        int columns = 14;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
               if(i ==1 || i ==14 || (i ==2 && j != columns/2) || (i ==3 && (j <=5 || j >8)) || (i ==4 && (j <=5-1 || j >8+1))
            		   || (i ==5 && (j <=5-2 || j >8+2)) || (i ==6 && (j <=5-3 || j >8+3)) || ((i >=7 && i <=13) && (j ==1 || j ==14)))
               {
            	   System.out.print("*");
               }
               else
               {
            	   System.out.print(" ");
               }
            }
            System.out.println();
        }
	}

}
