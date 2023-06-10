
public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 14;
		int columns = 14;
		
		for(int i = 1; i <= rows; i++)
		{
			for(int j =1; j <= columns; j++)
			{
				if(i == 1 || i == 14 || ((i ==2 || i ==13) && j <= columns/2)
						|| ((i ==3 || i == 12) && j <= columns/2-1) || ((i ==4 || i == 11) && j <= columns/2-2)
						|| ((i ==5 || i == 10) && j <= columns/2-3) || ((i ==6 || i == 9) && j <= columns/2-4)
						|| ((i ==7 || i == 8) && j <= columns/2-5))
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}

